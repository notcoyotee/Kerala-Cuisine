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

//import com.example.android.apis.R;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

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
       String VegList[] = {
    		   "Ada Pradhaman Recipe",
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
    		   "Ghee for frying "
    		   
    		   ,
    		   
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
    		   
				,
				
				"Ripe pumpkin (sliced)  1 cup\n"+
				"Banana (sliced)  1 cup\n"+
				"Elephant Yam (sliced)  1 cup\n"+
				"Red oriental beans  1/2 cup (cooked)\n"+
				"Turmeric powder  1/4 tsp\n"+
				"Cumin seeds  1 tsp\n"+
				"Garlic  2 flakes\n"+
				"Green chillies  3 no.\n"+
				"Pepper  1/2 tsp \n"+
				"Curry leaves\n"+
				"Coconut (grated)  11/2 cup\n"+
				
				
				"Ingredients for seasoning \n"+
				
				"Mustard seeds  1 tsp\n"+
				"Urad dal  1 tsp\n"+
				"Red chilly  4 no. \n"+
				"Curry leaves\n"+
				"Salt\n"+
				"Oil"
				
				,
				
				"Biriyani rice  2 cups\n"+
				"Ghee  5 to 6 tsp\n"+
				"Cashew nuts  1/2 cup\n"+
				"Clove  4 to 5 pieces\n"+
				"Crushed peppercorns  4 to 5 no.\n"+
				"Raisins  1/4 cup\n"+
				"Crushed ginger  1 tsp\n"+
				"Crushed garlic  1 tsp\n"+
				"Lime juice\n"+
				"Onions (sliced)  2 no.\n"+
				"Bay leaf  2 no.\n"+
				"Cardamom  4 no.\n"+
				"Cinnamon  2 sticks\n"+
				"Chopped coriander leaves  1/4 cup\n"+
				
				"Salt  to taste\n"+
				"Water  3 1/2 cup"
				
				,
				
				"Raw Banana  3 (cut into thin square pieces)\n"+
				"Coconut dried  1/2 cup\n"+
				"Green chillies  6 (sliced lengthwise)\n"+
				"Chilli powder  1 tsp\n"+
				"Turmeric powder  1/2 tsp\n"+
				"Salt  to taste\n"+
				"Oil \n"+
				"Mustard seeds  1 tsp\n"+
				"Curry leaves\n"+
				"Urad dal  1 tsp\n"
				
				,
				
				"Tapioca (Kappa)  1/2 kg grated\n"+
				"Puttu podi (powdered rice)  1/2 cup\n"+
				"Coconut (grated)  1 cup \n"+
				"Salt  to taste\n"
				
				,
				
				
				"Boiled potatoes  2 no. (cut into square pieces)\n"+
				"Small onions (chopped)  10 no.\n"+
				"Ginger  1 inch long piece\n"+
				"Garlic\n"+
				"Soaked Urad dal  (for making vadas)  1/2 cup\n"+
				"Green chillies  3 no.\n"+
				"Chilli powder  1 tsp\n"+
				"Coriander powder  2 tsp\n"+
				"Turmeric powder  1/2 tsp\n"+
				"Pepper powder  1/2 tsp\n"+
				"Garam masala powder  1/2 tsp\n"+
				"Mustard seeds  1 tsp\n"+
				"Coconut milk  1/2 cup\n"+
				"Curry leaves\n"+
				"Coriander leaves\n"+
				
				
				"Oil\n"+
				"Salt  to taste\n"
				
				,
				
				
				"Raw rice - 1 cup\n"+
				"Sugar - 2 tsp\n"+
				"Ghee - 2 tsp\n"
				
				,
				
				"Kumbalanga (Ash gourd)  1 medium\n"+
				"Pumpkin pieces  1 cup\n"+
				"Green chillies (split)  6 no. \n"+
				"Coconut milk  1 cup\n"+
				"Van Payar (Red oriental beans)  1/4 cup (cooked) \n"+
				"String beans\n"+
				"Curry leaves\n"+
				"Salt\n"+
				"Coconut oil  3 tsp\n"
				
				,
				
				"1/2 cup split green gram\n"+
				"1 cup grated coconut\n"+
				"3 pods of garlic\n"+
				"3 tsp coconut oil\n"+
				"2 tsp ghee\n"+
				"1/2 tsp cumin seeds\n"+
				"1/4 tsp turmeric powder\n"+
				"Curry leaves\n"
				
				,
				
				"Bitter gourd (cut into thin pieces) - 2 cups \n"+
				"Thinly sliced coconut pieces - 1/2 cup \n"+
				"Green chillies (cut into long slices) -4 \n"+
				"Chilly powder - 1 tsp \n"+
				"Turmeric powder - 1/2 tsp \n"+
				"Coconut or canola oil (for frying) \n"+
				"Salt. \n"
				
				,
				
				"Ripe banana  1 \n"+
				"Coconut (grated)  1 cup\n"+
				"Green chillies  3 no.\n"+
				"Turmeric powder  1/2 tsp\n"+
				"Cumin powder  1/4 tsp\n"+
				"Fenugreek powder  1/4 tsp\n"+
				"Butter milk  500 ml\n"+
				"Sugar  1 tsp\n"+
				"Salt\n"+
				"Oil\n"+
				"Curry leaves\n"+
				"Onion (small)  2 no.\n"+
				"Mustard seeds  1 tsp (to season)\n"
				
				,
				
				"Pineapple pieces  1 cup\n"+
				"Tamarind  lemon-size\n"+
				"Jaggery  1 small piece\n"+
				"Coconut (grated)  1/2 cup\n"+
				"Chilli powder  1/2 tsp\n"+
				"Green chillies (chopped)  1 tsp\n"+
				"Curry leaves\n"+
				"Mustard seeds  1 tsp\n"+
				"Red chilli  3 no.\n"+
				"Oil\n"+
				"Salt  to taste\n"
				
				
				,
				
				
				"100 g of elephant yam \n"+
				"1 raw banana \n"+
				"1 cup of mashed yoghurt \n"+
				"4 green chillies \n"+
				"4 tsp of ghee \n"+
				"1/2 tsp turmeric powder \n"+
				"1/2 tsp fenugreek seeds \n"+
				"1/2 tsp mustard seeds \n"+
				"1 tsp pepper \n"+
				"3 dry red chillies \n"+
				"Curry leaves \n"+
				
				"For the paste\n"+
				"1 1/2 cups of grated coconut \n"+
				"1/2 tsp cumin seeds \n"
				
				,
				
				"Small pieces of raw mango - 2 cups \n"+
				"Chilli powder - 3 tsp \n"+
				"Asafoetida  1 tsp \n"+
				"Turmeric powder - 1/4 tsp \n"+
				"Mustard seeds - 1 tsp \n"+
				"Oil  3 tsp \n"+
				"Salt - to taste \n"
				
				,
				
				"De-husked rice - 1/4 cup \n"+
				"Milk- 1 1/2 litre \n"+
				"Sugar- æ kg \n"+
				
				"For garnishing \n"+
				"Cashews- 1/4 cup \n"+
				"Raisins - 1/4 cup \n"+
				"Cardamom - 4 \n"+
				"Ghee (for frying) \n"
				
				,
				
				"Pappadam - 15 \n"+
				"Coconut (grated) - 1 cup \n"+
				"Green chillies - 4 \n"+
				"Red chillies - 2 \n"+
				"Small onions - 4 (finely chopped for seasoning) \n"+
				"Coconut oil - 1/4 cup \n"+
				"Mustard seeds - 1/2 tsp \n"+
				"Curry leaves \n"+
				"Salt \n"
				
				,
				
				"1/2 cup toor dal (Yellow Lentils)\n"+
				"1/2 cup masoor dal (Red lentils)\n"+
				"1 big snake gourd \n"+
				"8 cluster beans (amarakka) \n"+
				"6 lady's finger \n"+
				"6 small-sized colocacia \n"+
				"A medium-sized brinjal \n"+
				"150 g of cucumber \n"+
				"2 drumsticks \n"+
				"1 medium-sized potato \n"+
				"1 large onion \n"+
				"1 tomato \n"+
				"10 small onions \n"+
				"3 tsp of sambar powder \n"+
				"3 dry red chillies \n"+
				"1/4 cup of tamarind juice \n"+
				"3 tsp of oil \n"+
				"1 tsp of mustard seeds \n"+
				"1 pinch of asafoetida \n"+
				"Salt \n"+
				"Curry leaves \n"+
				"Coriander leaves \n"
				
				,
				
				
				"Brinjal (small)  4 no.\n"+
				"Shallot (small onion)  10 no.\n"+
				"Red chilli powder  1 tsp\n"+
				"Coriander powder  2 tsp\n"+
				"Turmeric powder  1/2 tsp\n"+
				"Crushed pepper  1/2 tsp\n"+
				"Tamarind water  1/2 cup\n"+
				"Mustard seeds  1 tsp\n"+
				"Coconut (grated)  1 cup\n"+
				"Fenugreek  1 tsp\n"+
				"Coconut oil  3 tsp\n"+
				"Curry leaves\n"+
				"Salt  to taste\n"+
				"Red chillies\n"
				,
				
				
				"Cucumber (cut into very small pieces) - 2 cups \n"+
				"Curd (not sour) - 1 cup \n"+
				"Grated coconut- 1/2 cup \n"+
				"Green chillies (cut into small round pieces) - 3 \n"+
				"Small onions - 2 \n"+
				"Cumin seeds- 1/2 tsp \n" +
				"Mustard seeds- 1/2 tsp \n"  +
				"Curry leaves \n" +
				"Salt \n"
       };
       
       final String Instructions[]={ "Making the batter for the Ada \n"+ "Soak rice for an hour, and then strain well and dry in a piece of cloth for two hours. After that, grind it to fine powder and sieve through a fine sieve. \n"+
    		   "Now add 2 teaspoons of melted ghee, 2 tsp of sugar and medium hot water to get the consistency of chapathi batter... or cookie batter. \n"+
    		   "Making the Ada \n"+ "Take plantain leaves and cut them into 6inch squares roughly. Hold them on the fire for a few seconds to make them flexible. \n"+
    		   "Boil plenty of water in a big broad vessel. Take lime-sized portions of the batter and spread on the back side of the plantain leaves. Immediately drop in the boiling water. \n"+ "Do this till all of the batter is used up. When the ada are well cooked, they float. \n"+
    		   "Alternately, you can steam them 3 or 4 at a time in a steamer. Remove, strain and scrape out the adas and wash in plenty of water; changing the water three or four times to remove the stickiness. Chop fine. \n"+
    		   "Making of Ada Pradhaman \n"+ "Grate the coconut and keep  1/4  cup of the first milk, 1  1/2  cups of the 2nd milk and 2 cups of the 3rd milk ready. \n"+
    		   "Heat up a vessel and add  1/4  cup of ghee and fry the cooked ada well. Then add the 3rd milk, jaggery and sugar and boil on a medium flame for 10 min. \n"+
    		   "Add the 2nd milk and boil for 5 min. Add the first milk and remove at once from the stove; stirring thoroughly. Add 1 tsp of cardamom powder and mix well. Add fried cashews and raisins. \n"+
    		   "Now, if you're an amateur cook, you may just be wondering what all this first milk, second milk, third milk business is all about it. Itís quite simple, really. The first milk is the milk extract that you strain out from the coconut the first time you beat it in the mixer with water. You shouldn't use too much water this time. Then, the coconut from which the first milk has been extracted is beaten in the mixer again with more water to get the second milk. Put that aside and then extract the third milk. \n"
    		   ,
    		   "Cut the veggies into batons. Boil them with the turmeric and just enough water. To this add the coconut paste that has been ground smoothly. Cook for five minutes. Add salt.\n"+ " \n"+ "Remove from the fire and add the curd, beaten, and the coconut oil. Mix well. Serve hot. \n"
    		   ,
    		   "Into a pressure cooker, put red oriental beans. Now add pieces of elephant yam, banana and pumpkin. Stir the contents well. Pour water and cook. \n"+
    		   "Open the pressure cooker lid and add the grounded ingredients comprising grated coconut, turmeric powder, cumin seeds, garlic, green chillies and pepper. Stir well. Add salt and pour some water. Stir gently.\n"+
    		   "For seasoning, take a pan and heat some oil. Into this add red chillies, mustard, urad dal, curry leaves and grated coconut. Stir well.\n"+
    		   "Remove the contents from the pressure cooker into a bowl. You may now transfer the seasoning from the pan into the bowl. \n"+
    		   "Now what are you waiting for? Get going with your Erissery.\n"
    		   ,
    		   "Wash and drain the rice and keep it aside.  Heat three teaspoons of ghee in a pan. To this, add cashew nuts and stir, till it becomes brown. Remove the cashew nuts. Repeat the procedure with raisins. \n"+
    		   "Heat some more ghee in the pan. Now put big onions and add salt. Stir and cook till it turns brown. Transfer this into the plate containing fried cashew nuts and raisins.\n"+
    		   "Take some more ghee and heat in a big vessel. Put cloves, followed by cinnamon, cardamom, crushed pepper, and ginger-garlic paste. Stir well. To this, add pieces of big onion and stir a bit. You may now add the rice, which has been washed, drained and kept aside. Mix well and add salt. Now add coriander leaves and stir again. Add some split pieces of bay leaf and pour water to cover the rice fully. Stir gently and close the vessel. Cook for five minutes.\n"+
    		   "Remove the lid of the vessel and add some lime juice. Mix well.\n"+
    		   "Garnish with cashew nuts, raisins, fried onions and serve the ghee rice hot.\n"
    		   ,
    		   "Heat three teaspoons of oil in a pan. To this, add mustard seeds, urad dal and coconut pieces. Stir well. Now add curry leaves. Stir a bit and add green chillies and sautÈ for some time. Add the thin square shaped banana pieces. Stir a bit. Proceed to add salt, turmeric powder and chilli powder. Now pour a cup of water. Stir a bit and cover the vessel. When all of the water is absorbed, lower the flame and mix the pieces well. \n"+
    		   "Serve hot and enjoy your lunch with Kai Mezhukkupuratti.\n"
    		   ,
    		   "Boil some water in a pressure cooker. Now mix the grated tapioca with puttu podi (rice flour) by adding salt. No need to add water. After mixing, keep the contents aside.\n"+
    		   "When the pressure cooker starts letting out steam, place the puttu maker on top of the pressure cooker; fully covering the outlet of the steam nozzle. First put some grated coconut into the puttu maker and on top of it add some puttu podi (rice-flour) ñ kappa (tapioca) flour mixture. \n"+
    		   "Allow the steam to cook for about three minutes. Now remove the puttu-maker from the top of the cooker. \n"+
    		   "Serve hot. Relish your Kappa Puttu ideally with fish curry or chicken curry.\n"
    		   ,
    		   "Take a small pan and heat some oil. Add salt to the urad dal paste (made by grinding it well without adding any water) for making the vada. Now take a spoonful of this paste and put it in the heated oil. Fry well. Remove the vadas into a bowl and keep it aside. \n"+ "  \n"+ "Now heat three teaspoons of oil in a pan. Put mustard seeds and curry leaves. When it splutters, add ginger, garlic, onions and green chilies. Stir a bit. Now add potatoes cut into cubes.  Stir and sautÈ for some time. You may now add coriander powder, chilli powder, garam masala and pepper powder. Stir well.\n"+
    		   "You may now pour a cup of water. Add salt and stir. Cover the vessel and cook well. When the contents become fully devoid of water, add thick coconut milk. Stir a bit. Now add the vadas. Boil for a while. Mix well and add coriander leaves.\n"+
    		   "Serve the Koottu curry hot. It goes well with rice dishes.\n"
    		   ,
    		   "Making the batter for the Ada\n"+
    		   "Soak rice for an hour, and then strain well and dry in a piece of cloth for two hours. After that, grind it to fine powder and sieve through a fine sieve.\n"+
    		   "Now add 2 teaspoons of melted ghee, 2 tsp of sugar and medium hot water to get the consistency of chapathi batter... or cookie batter.\n"+
    		   "Making the Ada\n"+
    		   "Take plantain leaves and cut them into 6inch squares roughly. Hold them on the fire for a few seconds to make them flexible.\n"+
    		   "Boil plenty of water in a big broad vessel. Take lime-sized portions of the batter and spread on the back side of the plantain leaves. Immediately drop in the boiling water.\n"+
    		   "Do this till all of the batter is used up. When the ada are well cooked, they float.\n"+
    		   "Alternately, you can steam them 3 or 4 at a time in a steamer. Remove, strain and scrape out the adas and wash in plenty of water; changing the water three or four times to remove the stickiness. Chop fine.\n"
    		   ,
    		   "In a pan, boil red oriental beans with salt. Put kumbalanga (ash gourd) and pumpkin cut into cubes. To this, add string beans and green chillies. Stir a bit and pour some water. Cover the pan and cook for five minutes. \n"+
    		   "Remove the lid. Stir gently. Now add salt and curry leaves. Stir a bit. Add to this, coconut milk and mix well. Pour some oil. Stir again.\n"+
    		   "The Olan is ready to delight your taste buds.\n"
    		   ,
    		   "Heat the ghee in a thick-bottomed pan or kadai. Now roast green gram, till it turns light brown. \n"+
    		   "Boil two cups of water in a vessel. To this, add the fried green gram and cook, till it's done. If it is too thick, thin it with a little more water. Mash the cooked dal well and add salt and turmeric powder. \n"+
    		   "Mix well. Grind together the grated coconut, cumin seeds and garlic. Mix the ground mixture with the mashed dal with a little water. \n"+
    		   "Put this on the fire and let it simmer for a few minutes until the ground mixture blends into the dal. Once that is done, remove the dal from the fire and add coconut oil and curry leaves. Mix well.\n"
    		   ,
    		   "Wash the gourd pieces and drain the water completely. Now add chilly powder, green chillies, coconut pieces, turmeric powder and salt and mix well with your hand. Keep this aside for a few minutes. \n"+
    		   "After that, you can fry the bitter gourd on a low flame till they turn crispy & light brown in colour. \n"+
    		   "It's great with rice. \n"
    		   ,
    		   "Cut ripe banana into medium-sized cubes. Put them in a vessel. Add water and cook it well. \n"+
    		   "Now, take a pan, and heat some oil. Put some mustard. When it splutters, add curry leaves and small onions. Stir a bit and add fenugreek powder. Stir again. Add the paste obtained by grinding grated coconut with green chillies, turmeric powder and cumin powder. Stir well.\n"+
    		   "You may now add this to the cooked banana. Pour some water. Stir well. Add sugar and salt. Mix the contents well. When it starts to boil, add butter milk and stir well. \n"+
    		   "It is now time for you to relish the Pazham Pulissery.\n"
    		   ,
    		   "Put pineapple pieces in a cooking vessel. Add tamarind water and boil it. Put chilli powder and salt. Stir well. Now pour some water. Cover the vessel and cook for about two minutes. \n"+
    		   "Remove the lid and stir the contents well. Now add the paste made from grated coconut and green chillies to the cooked pineapple pieces. Add small pieces of jaggery and mix well.\n"+
    		   "Now prepare the seasoning. Heat some oil in a pan. Put red chillies, mustard seeds and curry leaves. When the seasoning is ready, transfer this to the vessel containing the pachadi.\n"+
    		   "Serve hot."
    		   ,
    		   "First, remove the skin of the banana and yam and slice them into small pieces. Grind the coconut and cumin seeds to a smooth paste without adding water and keep aside. \n"+
    		   "Dissolve the pepper powder in 1/2 a cup of water and strain it through a clean cloth. Cook the vegetables in the above water after stirring in turmeric powder and salt. \n"+
    		   "When the water dries up, add a teaspoon of ghee and yoghurt and mix well. Lower the flame.\n"+
    		   "When the curd boils and becomes dry and thick, add the ground coconut mixture and the fenugreek powder. Stir well. Bring to a boil and then remove from flame. \n"+
    		   "Heat 3 teaspoons of ghee in a small frying pan. Splutter mustard seeds, dry red chillies and curry leave and add it to the Kaalan. \n"
    		   ,
    		   "Put the mustard seeds into a pan of heated oil and when they pop, reduce the heat to that of a low flame. Add chilli powder, salt, asafetida and turmeric and stir for about 3 minutes. \n"+
    		   "Now turn off the heat and let it cool for a while. Add this mixture to the cut mangoes and mix thoroughly. \n"+
    		   "Keep this for 7 to 8 days for the flavour to seep into mangoes. \n"+
    		   "You can add a little bit of distilled vinegar if you like to preserve the freshness. \n"
    		   ,
    		   "For something that tastes yum, it's really easy to make. All you need to do is mix all the ingredients together in a pressure cooker and cook on a high flame till you hear the first whistle. \n"+
    		   "Now lower the fire and cook for half an hour. Then garnish. \n"+
    		   "That's it! You can serve it either straight off the fire or chilled. \n"
    		   ,
    		   "Pound the grated coconut with the green chillies, curry leaves and small onions in a mixer bowl. Fry the pappadams lightly - the usual way - and then crush them. Now add salt and the coconut mixture to it and mix. Splutter the mustard seeds and then sautÈ the dry red chillies, chopped small onions and curry leaves. Add the pappadam-coconut mixture and mix well. Lower the flame and cook till done. \n"
    		   ,
    		   "Put all the vegetables into a pressure cooker. Add dals, turmeric, salt and just enough water to cover the vegetables. Cook on a high flame till you hear a whistle. Turn the fire off immediately and do not disturb till the pressure settles. \n"+
    		   "When the pressure settles, open the cooker and add 2 or 3 tbsp of sambar powder, tamarind juice and asafoetida.\n"+ " \n"+ "Stir. Heat the mixture for two minutes. Splutter mustard, dry red chillies and curry leaves in oil. Pour this into the sambar in the cooker and garnish with coriander leaves.\n"
    		   ,
    		   "In a pan, heat some oil. Put grated coconut. When it becomes slightly brown, add fenugreek. Continue stirring. Now add coriander powder, chilli powder, crushed pepper and turmeric powder. Stir well. Add small onions. Stir again. Make a paste of the ingredients and keep it aside.\n"+
    		   "Take another pan and heat two teaspoons of oil. Into this put the brinjals cut into small cubes and small onions. Stir well. Close the vessel and cook for some time.\n"+
    		   "You may now remove the lid, stir a bit and cover the vessel again and cook for some more time. Remove the lid again and add tamarind water and the paste prepared in the beginning. Allow it to boil. To this, add some water. Stir gently and add salt. Stir again. \n"+
    		   "Now prepare seasoning for the Theeyal. Heat some oil and add mustard, red chillies and curry leaves. Pour the seasoning into the Theeyal.  \n"+
    		   "Serve hot.\n"
    		   ,
    		   "Grind together the grated coconut, small onions and cumin seeds. Add crushed mustard seeds to it and mix well. \n"+
    		   "Cook the cucumber along with some water, chillies and salt. When the entire water in the vessel has been used up, add the ground coconut mixture and mix well. \n"+
    		   "Season with spluttered mustard seeds, red chillies and curry leaves. After the mixture is cooled, add curd and mix well. \n"
    		   };

       final String Veg_Vids[]={
    		   "http://www.youtube.com/watch?v=lcLePc6_2dc&feature=player_embedded"
    		   ,
    		   "http://www.youtube.com/watch?v=5jxdpr1bouU&feature=player_embedded"
    		   ,
    		   "http://www.youtube.com/watch?v=FWMYLBVG7HQ&feature=player_embedded"
    		   ,
    		   "http://www.youtube.com/watch?v=zh5pEgtxU64&feature=player_embedded"
    		   ,
    		   "http://www.youtube.com/watch?v=rTIAZuiqzLw&feature=player_embedded"
    		   ,
    		   "http://www.youtube.com/watch?v=Rc1HLjEf5tc&feature=player_embedded"
    		   ,
    		   "http://www.youtube.com/watch?v=wXPsUb8HqVg&feature=player_embedded"
    		   ,
    		   "http://www.youtube.com/watch?v=eWxDLtWnBj0&feature=player_embedded"
    		   ,
    		   "http://www.youtube.com/watch?v=JUcfFJACw2k&feature=player_embedded"
    		   ,
    		   "http://www.youtube.com/watch?v=uX4DFqSfFuQ&feature=player_embedded"
    		   ,
    		   "http://www.youtube.com/watch?v=2_HYDByTbN4&feature=player_embedded"
    		   ,
    		   "http://www.youtube.com/watch?v=FTwFFICZHy8&feature=player_embedded"
    		   ,
    		   "http://www.youtube.com/watch?v=8f9CBJ7YbcE&feature=player_embedded"
    		   ,
    		   "http://www.youtube.com/watch?v=9h2-yhLAI8U&feature=player_embedded"
    		   ,
    		   "http://www.youtube.com/watch?v=vKAsnZi_ky8&feature=player_embedded"
    		   ,
    		   "http://www.youtube.com/watch?v=IdPHJSkYz_g&feature=player_embedded"
    		   ,
    		   "http://www.youtube.com/watch?v=FNb69-99MNw&feature=player_embedded"
    		   ,
    		   "http://www.youtube.com/watch?v=V3KyTocH1Vg&feature=player_embedded"
    		   ,
    		   "http://www.youtube.com/watch?v=28CRMMUmS-0&feature=player_embedded"
    		   ,
    		   "http://www.youtube.com/watch?v=m8RgTbhoOsU&feature=player_embedded"
       };
       
       final TextView t1 = (TextView) findViewById(R.id.textViewLink1);
       t1.setMovementMethod(LinkMovementMethod.getInstance());
       
       // Selection of the spinner
       final Spinner spinner = (Spinner) findViewById(R.id.spinner1);
       final EditText txt_Ingredients = (EditText) findViewById(R.id.ingredients1);
       final EditText txt_Instructions = (EditText) findViewById(R.id.instructions1);
       txt_Ingredients.setFocusable(false);
       txt_Instructions.setFocusable(false);

       // Application of the Array to the Spinner
       ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this,   android.R.layout.simple_spinner_item, VegList);
       spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down vieww
       spinner.setAdapter(spinnerArrayAdapter);
       
       
		spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
		          mp1.start();    	
				// TODO Auto-generated method stub
				//Log.d("gil", Ingredients[spinner.getSelectedItemPosition()]);
				txt_Ingredients.setText(Ingredients[spinner.getSelectedItemPosition()]);
				txt_Instructions.setText(Instructions[spinner.getSelectedItemPosition()]);
				t1.setText(Html.fromHtml("<a href=\""+Veg_Vids[spinner.getSelectedItemPosition()]+"\">Watch recipe video on YouTube</a> "));
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
     
}
    
} // end class
