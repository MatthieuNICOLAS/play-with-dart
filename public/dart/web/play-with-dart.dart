import 'package:angular/angular.dart';
import 'package:angular/application_factory.dart';

import 'package:play_with_dart/component/rating.dart';
import 'package:play_with_dart/component/recipe_book.dart';
import 'package:play_with_dart/formatter/category_filter.dart';
import 'package:play_with_dart/tooltip/tooltip.dart';

class MyAppModule extends Module {
  MyAppModule() {
    bind(RecipeBookComponent);
    bind(RatingComponent);
    bind(Tooltip);
    bind(CategoryFilter);
  }
}

void main() {
  applicationFactory()
      .addModule(new MyAppModule())
      .run();
}