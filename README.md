# Projekt

This is a project to create a recipe book. It will have a Angular-based frontend and a Java-based backend.

The frontend will provide a recipe list and a detail view to display and edit a single recipe.

Every recipe will consist of the following components:
* title
* list of ingredient
* preparation
* categories
* additions

The additions are to do entries. Every addition can be have a status (new, checked, tested) and get assigned to another user by it creator.

The base concept of the frontend is the following:
* The recipes (both the list and the single recipes) are public readable.
* At the start page there are all recipes. There is a filter bar where the user (everyone) can select which critera should be matched by the recipes. Criteria could be categories: Some of them could be vegetarian, vegan, baking and low carb. Additional there should be a sorting option: For example filter by age, name and so on.
* There is a column view: On the left the list of recipes, on the right the selected recipes. There could be two options:
1. There is just the list of recipes visible (with full width) at the time of start.
2. There is the right area is filled with a welcome message or the recipe of the day or something like this at the time of start.
* At the recipe area: Next to every item (title, list of ingredients, preparation, additions) there is a small edit icon. If somebody clicks at that (as long as he is logged in) the static text is replaced by an editable textfield. Some can just edit every item separtedly.
* The transport format for edited texts is plain text.
* The recipes are fetched from the server als JSON object, but it should be possible to fetch single recipes by an identifier and every item of single recipe as well.
