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
 * This is the activity for feature 4 in the dashboard application.
 * It displays some text and provides a way to get back to the home activity.
 *
 */

public class F4Activity extends DashboardActivity 
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
    setContentView (R.layout.activity_f4);
    setTitleFromActivityLabel (R.id.title_text);
    final String CombinationList[] = {    
    		"Appam and Chicken stew",
    	 	"Idiappam and Egg Roast",
    		"Kappa and Fish Curry",
    		"Puttu and Kadala Curry"
 	 		};
    final String CombinationIngrediensts[] = {
    		"Raw Rice 1/2 kg\n"+
    				"Coconut (grated)  1 full\n"+
    				"Yeast 1/2 tsp \n"+
    				"Salt  to taste\n"+
    				"Sugar  3 tsp\n"+
    				"Cooked rice 1/2 cup\n"+
    				"Chicken piece  1/2 kg\n"+
    				"Potato  1 \n"+
    				"Big onion  2\n"+
    				"Carrot  1 big\n"+
    				"Green chilli  5 no.\n"+
    				"Garlic  8 flakes\n"+
    				"Ginger  1 piece\n"+
    				"Cinnamon  2 sticks\n"+
    				"Cloves  4 no.\n"+
    				"Cardamom  3 no.\n"+
    				"Bay leaf  1\n"+
    				"Curry leaves         \n"+
    				"Coriander leaves\n"+
    				"Coconut oil  3 tsp\n"+
    				"Thick coconut milk  1 cup\n"+
    				"Crushed pepper  1/2 tsp"
    				,
    				"Rice flour  2 cups\n"+
    				"Salt  1 tsp\n"+
    				"Coconut (grated)  1 cup\n"+
    				"Oil\n"+
    				"Hard-boiled egg  4\n"+
    				"Onion (sliced)  2 cups\n"+
    				"Green chilly (sliced)  5 no.\n"+
    				"Tomato (sliced)  2 no. \n"+
    				"Red chilly powder  1 tsp\n"+
    				"Coriander powder  1 tsp\n"+
    				"Turmeric powder  1/2 tsp\n"+
    				"Garam masala  1 tsp\n"+
    				"Ginger-Garlic paste  1 tsp\n"+
    				"Curry leaves\n"+
    				"Coriander leaves\n"+
    				"Mustard seeds"
    				,
    				"Tapioca  1 kg\n"+
    				"Small onion  5 no.\n"+
    				"Coconut (grated)\n"+
    				"Turmeric powder  1/2 tsp\n"+
    				"Cumin seeds  1 tsp\n"+
    				"Green chilli  5 no.\n"+
    				"Curry leaves\n"+
    				"Salt\n"+
    				"Oil\n"+
    				"Fish  clean and cut into 8 pieces\n"+
    				"Small onions  8 (cut length-wise)\n"+
    				"Tomato  1 (cut length-wise)\n"+
    				"Ginger (chopped)  1 tsp\n"+
    				"Coconut milk  1/2 cup\n"+
    				"Gamboges (Kodampuli)  4 pieces\n"+
    				"Green chilli  8 no. (cut length-wise)\n"+
    				"Curry leaves\n"+
    				"Garlic (chopped)  1 tsp\n"+
    				"Coriander powder  1 tsp\n"+
    				"Chilly powder  1 tsp\n"+
    				"Turmeric powder  1/2 tsp\n"+
    				"Fenugreek powder  1/2 tsp\n"+
    				"Salt\n"+
    				"Oil"
    				,
    				"Puttu mavu (rice flour)  2 cups\n"+
    				"Salt\n"+
    				"Hot water\n"+
    				"Coconut (grated)\n"+
    				"Black Channa (black chickpea / bengal gram)  1 cup \n"+
    				"Small onion (chopped)  1 cup \n"+
    				"Coconut (grated)  1 cup\n"+
    				"Coriander powder  2 tsp\n"+
    				"Red chilli powder  1 tsp\n"+
    				"Turmeric powder  1/2 tsp\n"+
    				"Garam masala  1/2 tsp\n"+
    				"Coconut (diced)  1/4 cup\n"+
    				"Tomato (chopped)  1/4 cup\n"+
    				"Curry leaves\n"+
    				"Coriander leaves\n"+
    				"Salt\n"+
    				"Oil\n"+
    				"Mustard seeds\n"+
    				"Red chillies\n"+
    				"Ginger-Garlic paste\n"

    };
    final String CombinationInstructions[] = {
    		"Appam - method of preparation\n"+
    				"Soak rice for about four hours and drain the water completely. Take the cooked rice and grind it with grated coconut in a mixer. Put yeast, salt and sugar in boiled water and keep it for half-an- hour. Add this to the grounded mixture. Keep the mixture for eight hours to ferment. Spread the mixture thickly on a non-stick pan. Spread it around a bit. \n"+
    				"Remove the appam from the pan and serve it hot. You may try this ideally with chicken stew. \n"+
    				"\nChicken Stew  method of preparation\n"+
    				"Cut chicken, onions and carrots into cubes. Heat two teaspoons of coconut oil in a pressure cooker. Put clove, cinnamon and cardamom. Stir a bit. Now add to this garlic and ginger, followed by onions, carrots, potatoes and green chillies. Again stir a bit. You may now add the chicken pieces. Stir again. Add bay leaf. Pour half-a-cup of water. Now close the lid and cook for three minutes. \n"+
    				"Remove the lid and shift the contents into a sauce pan. Stir a bit. Now add salt, crushed pepper, curry leaves and coriander leaves. Stir well. Add the thick coconut milk and a little amount of oil. Stir well and cook for about two minutes. Finally garnish it with curry leaves. \n"+
    				"Your chicken stew is now ready. It combines well with hot appams."
    				,
    				"Idiappam  method of preparation\n"+
    				"Take a vessel, pour some water and heat it. To this, add salt, followed by oil. Pour hot water to the rice flour. Knead well to get a smooth dough. After heating water in an Idiappam maker, fill the Idiappam squeezer (seva nazhi) with the rice dough. Now put small quantities of grated coconut on the concave surfaces of the Idiappam pan and squeeze down the dough on top of that. Steam well.\n"+
    				"Smooth Idiappams are now ready for serving. It would taste great with egg roast.\n"+
    				"\nEgg Roast  method of preparation\n"+
    				"Heat three teaspoons of coconut oil and add mustard seeds. To this, add curry leaves and ginger-garlic paste. Stir a bit. Now add big onions. Sauté till the onions turn brown. Add green chillies. Stir again. Add coriander powder, chilli powder, turmeric powder and garam masala. Stir well. Add some water and stir again. You may now add salt and the sliced tomatoes. Cook for three minutes. When it boils, add boiled eggs and cook for another three minutes. Now add some water. Mix well. \n"+
    				"Garnish Egg Roast with coriander leaves and serve hot."
    				,
    				"Kappa - method of preparation\n"+
    				"Remove the skin and cut the tapioca into small pieces. Place the pieces in a pressure cooker. Pour sufficient water and cook well. When it is cooked, drain the excess water. Now add salt and curry leaves. To this, add the coconut paste made by grinding grated coconut, turmeric powder and cumin seeds. Stir well. Pour a little oil and cover the vessel. Cook for some more time. Now you may mix the contents well and to this add two teaspoons of coconut oil.\n"+
    				"Serve the tapioca hot ideally with fish curry.\n"+
    				"\nFish Curry  method of preparation\n"+
    				"Heat three teaspoons of coconut oil in an earthen vessel. Put ginger and garlic. Saute for some time. Now add curry leaves and green chillies. Stir a bit. Add small onions and stir again. To this, add turmeric powder, chilli powder, coriander powder and fenugreek powder. Stir well. \n"+
    				"You may now add three cups of water and add Gamboges (Kodampuli) pieces. Now add salt. When it starts to boil, add fish pieces and stir gently. Boil it till the curry becomes half thick. Add to this tomato pieces and cook for some more time. Proceed to add coconut milk. Stir gently. Now add some curry leaves and three teaspoons of coconut oil. \n"+
    				"Serve your Fish curry hot. Ideally you may try it with Kappa (tapioca)."
    				,
    				"Puttu  method of preparation\n"+
    				"Just add sufficient hot water and salt to the rice flour. Mix the flour well with fingers. For making the Puttu, you may use the traditional Puttu Kudam. You may begin by adding a spoonful of grated coconut into the cylindrical container, followed by the well mixed rice flour. As you add the rice flour into the container, in between, you may also add small quantities of grated coconut. Make sure that the cylinder is just fully filled and now you may place it on the Puttu Kudam after covering the top portion of the cylinder. Allow the steam to take care of the cooking. \n"+
    				"Your Puttu will be ready in three minutes. Have it with Kadala curry for a great combination.\n"+
    				"\nKadala Curry  method of preparation\n"+
    				"First, soak the black channa (black chickpea / bengal gram) for at least ten hours by adding salt. Cook the black channa well and keep it aside. \n"+
    				"Heat one teaspoon of oil in a pan. Put the grated coconut and fry until it turns brown. To this, add coriander powder, chilli powder and garam masala. Stir all the ingredients until it becomes brown. Make a paste of this and keep it aside.\n"+
    				"Take a pan and heat some coconut oil. Put some mustard and add red chillies. When it begins to splutter, add the diced coconut. Stir a bit. Now add the ginger-garlic paste, followed by onions and tomatoes. Add some curry leaves and stir gently. You may now add the black channa (black chickpea). Pour sufficient water and add salt. Stir well. \n"+
    				"Now add the coconut paste kept aside to the cooked black channa. Boil the curry well. \n"+
    				"You may now garnish the curry with chopped coriander leaves and serve it ideally with Puttu. It is a great combination to relish.\n"
    };

    // Selection of the spinner
    final Spinner spinner = (Spinner) findViewById(R.id.spinner4);
    final EditText txt_Ingredients4 = (EditText) findViewById(R.id.ingredients4);
    final EditText txt_Instructions4 = (EditText) findViewById(R.id.instructions4);
    txt_Ingredients4.setFocusable(false);
    txt_Instructions4.setFocusable(false);
    // Application of the Array to the Spinner
    ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this,   android.R.layout.simple_spinner_item, CombinationList);
    spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down vieww
    spinner.setAdapter(spinnerArrayAdapter);
    
    
		spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
		          mp1.start();    	
				
				// TODO Auto-generated method stub
				//Log.d("gil", Ingredients[spinner.getSelectedItemPosition()]);
				txt_Ingredients4.setText(CombinationIngrediensts[spinner.getSelectedItemPosition()]);
				txt_Instructions4.setText(CombinationInstructions[spinner.getSelectedItemPosition()]);
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
  
}
 
} // end class
