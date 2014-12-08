library editor_component;

import 'dart:js';
import 'dart:html' as dom;
import 'dart:async';
import 'package:angular/angular.dart';

/* The selector field defines the CSS selector that will trigger the component. It can be any valid
 * CSS selector which does not cross element boundaries.
 *
 * The component's public fields are available for data binding from the view.
 * Similarly, the component's public methods can be invoked from the view.
 */
@Component(
    selector: 'editor',
    templateUrl: 'editor.html',
    useShadowDom: false
)
class EditorComponent extends ShadowRootAware {
  var editor;
  var session;

  void onShadowRoot(ShadowRoot shadowRoot) {
    editor = new JsObject(context['ace']['edit'], ['editor']);
    session = editor.callMethod('getSession', []);

    editor.callMethod('setTheme', ['ace/theme/monokai']);
    session.callMethod('setMode', ['ace/mode/javascript']);
  }


  EditorComponent() {
  }
}
