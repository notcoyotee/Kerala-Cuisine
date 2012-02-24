/*
 * Copyright (C) 2011 Wglxy.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.wglxy.example.dash1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * This is the activity for feature 1 in the dashboard application.
 * It displays some text and provides a way to get back to the home activity.
 *
 */

public class F1Activity extends DashboardActivity 
{

/**
 * onCreate
 *
 * Called when the activity is first created. 
 * This is where you should do all of your normal static set up: create views, bind data to lists, etc. 
 * This method also provides you with a Bundle containing the activity's previously frozen state, if there was one.
 * 
 * Always followed by onStart().
 *
 * @param savedInstanceState Bundle
 */

protected void onCreate(Bundle savedInstanceState) 
{
    super.onCreate(savedInstanceState);
    setContentView (R.layout.activity_f1);
    setTitleFromActivityLabel (R.id.title_text);
    
    // String[][][] VegDishes={{"Name","Ingredients","Instructions"}};
    // Array of choices
       String VegList[] = {"Ada Pradhaman Recipe",
    		   "Avial Recipe",
    		   "Erissery",
    		   "Ghee Rice (Neichoru)",
    		   "Kai Mezhukku Puratti",
    		   "Kappa Puttu",
    		   "Koottu Curry",
    		   "Making of Ada",
    		   "Olan",
    		   "Parippu ",
    		   "Pavakka Varuthathu",
    		   "Pazham Pulissery",
    		   "Pineapple Madhura Pachadi",
    		   "Recipe of Kaalan",
    		   "Recipe of Mango Pickle",
    		   "Recipe of Pal Payasam",
    		   "Recipe of Pappadam Thoran",
    		   "Sambar Recipe",
    		   "Theeyal",
    		   "Vellarikka Kichadi"};
       final String Ingredients[]={
    		   "Ingredients \n" + 
    		   "Raw rice - 1 cup \n" + 
    		   "Sugar - 1 cup \n" + 
    		   "Coconuts - 2 \n" + 
    		   "Jaggery - ½ kg \n" + 
    		   "\n" + 
    		   "For garnishing: \n" + 
    		   "Cashews - ¼ cup \n" + 
    		   "Raisins - ¼ cup \n" + 
    		   "Cardamom - 6 \n" + 
    		   "Ghee for frying ",
    		   
    		   "The basic set of vegetables includes: \n" + 
    		   "1 carrot \n" + 
    		   "3 beans \n" + 
    		   "2 raw bananas \n" + 
    		   "1 medium-sized brinjal \n" + 
    		   "100 g of cucumber \n" + 
    		   "100 g of snake gourd \n" + 
    		   "100 g of elephant foot yam \n" + 
    		   "And a drumstick \n" + 
    		   "\n" + 
    		   "You also need to make a paste with two cups of grated coconuts, a teaspoon of cumin seeds and six green chillies. \n" + 
    		   "\n" + 
    		   "2 cups of grated coconuts \n" + 
    		   "1 tsp of cumin seeds \n" + 
    		   "6 green chillies \n" + 
    		   "\n" + 
    		   "As a finishing touch for the cooked mixture, you will need to add curd and coconut oil. So keep two tablespoons of curd and ¼ of a cup of coconut oil ready. \n" + 
    		   "\n" + 
    		   "2 tbsp of curd \n" + 
    		   "¼ cup of coconut oil \n" + 
    		   "\n" + 
    		   "Apart from these, you need salt, half-a-teaspoon of turmeric powder and a sprig of curry leaves. \n" + 
    		   "\n" + 
    		   "Salt \n" + 
    		   "½ tsp turmeric powder \n" + 
    		   "1 sprig of curry leaves  "
       };
       final String Instructions[]={
    		   "Making the batter for the Ada \n" + 
    		   "Soak rice for an hour, and then strain well and dry in a piece of cloth for two hours. After that, grind it to fine powder and sieve through a fine sieve. \n" + 
    		   "Now add 2 teaspoons of melted ghee, 2 tsp of sugar and medium hot water to get the consistency of chapathi batter... or cookie batter. \n" + 
    		   "\n" + 
    		   "Making the Ada \n" + 
    		   "Take plantain leaves and cut them into 6\" squares roughly. Hold them on the fire for a few seconds to make them flexible. \n" + 
    		   "Boil plenty of water in a big broad vessel. Take lime-sized portions of the batter and spread on the back side of the plantain leaves. Immediately drop in the boiling water. \n" + 
    		   "Do this till all of the batter is used up. When the ada are well cooked, they float. \n" + 
    		   "Alternately, you can steam them 3 or 4 at a time in a steamer. Remove, strain and scrape out the adas and wash in plenty of water; changing the water three or four times to remove the stickiness. Chop fine. \n" + 
    		   "\n" + 
    		   "Making of Ada Pradhaman \n" + 
    		   "Grate the coconut and keep ¼ cup of the first milk, 1 ½ cups of the 2nd milk and 2 cups of the 3rd milk ready. \n" + 
    		   "Heat up a vessel and add ¼ cup of ghee and fry the cooked ada well. Then add the 3rd milk, jaggery and sugar and boil on a medium flame for 10 min. \n" + 
    		   "Add the 2nd milk and boil for 5 min. Add the first milk and remove at once from the stove; stirring thoroughly. Add 1 tsp of cardamom powder and mix well. Add fried cashews and raisins. \n" + 
    		   "Now, if you're an amateur cook, you may just be wondering what all this first milk, second milk, third milk business is all about it. It’s quite simple, really. The first milk is the milk extract that you strain out from the coconut the first time you beat it in the mixer with water. You shouldn't use too much water this time. Then, the coconut from which the first milk has been extracted is beaten in the mixer again with more water to get the second milk. Put that aside and then extract the third milk.",
    		   
    		   "Method of preparation \n" + 
    		   "Cut the veggies into batons. Boil them with the turmeric and just enough water. To this add the coconut paste that has been ground smoothly. Cook for five minutes. Add salt.\n" + 
    		   " \n" + 
    		   "Remove from the fire and add the curd, beaten, and the coconut oil. Mix well. Serve hot. "
       };

       // Selection of the spinner
       final Spinner spinner = (Spinner) findViewById(R.id.spinner1);
       final EditText txt_Ingredients = (EditText) findViewById(R.id.ingredients1);
       final EditText txt_Instructions = (EditText) findViewById(R.id.instructions1);

       // Application of the Array to the Spinner
       ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this,   android.R.layout.simple_spinner_item, VegList);
       spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down vieww
       spinner.setAdapter(spinnerArrayAdapter);
       
       
		spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				txt_Ingredients.setText(Ingredients[spinner.getSelectedItemPosition()]);
				txt_Instructions.setText(Instructions[spinner.getSelectedItemPosition()]);
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
     
}
    
} // end class
