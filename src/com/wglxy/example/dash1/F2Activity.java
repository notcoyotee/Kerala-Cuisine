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
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * This is the activity for feature 2 in the dashboard application.
 * It displays some text and provides a way to get back to the home activity.
 *
 */

public class F2Activity extends DashboardActivity 
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
    setContentView (R.layout.activity_f2);
    setTitleFromActivityLabel (R.id.title_text);

    final String NonVegList[] = {    
    		"Beef Fry",
    		"Chicken Curry",
    		"Chicken Thoran",
    		"Dry Prawns with Cabbage",
    		"Egg Koottu",
    		"Fish Mappas",
    		"Fish Masala Wrapped in Banana Leaf",
    		"Fish Moilee",
    		"Kerala Fish Curry",
    		"Malabar Mutton Biriyani",
    		"Meen Peera",
    		"Mutton Stew",
    		"Netholi Vazhayilayil Pollichathu",
    		"North Malabar Prawns Curry",
    		"Pork Peralan",
    		"Prawns Masala",
    		"Varutharacha Chicken Curry"
 	 		};
    final String NonVegIngredients[]={
    		"Boneless Beef 1kg\n"+
    				"Thinly sliced coconut - 1/2 a cup  \n"+
    				"Shallots cut into two - 1 cup \n"+
    				"Coriander powder - 3 tbsp  \n"+
    				"Chilli powder - 2 tsp \n"+
    				"Black pepper powder - 2 tsp \n"+
    				"Turmeric powder - 1/2 tsp \n"+
    				"Garam masala - 2-3 tsp \n"+
    				"Fresh ginger, chopped - 4-5 cm \n"+
    				"Garlic cloves, chopped - 10 no. \n"+
    				"Salt - to taste. \n"
    				,
    				"cubed chicken 1 kg\n"+
    				"Oil\n"+
    				"Onion - 2 no.  \n"+
    				"Ginger - 2 inches \n"+
    				"Garlic - 8-10 cloves  \n"+
    				"Green chillies - 2 or 3\n"+
    				"Coriander powder  - 2 to 3 tbsp \n"+
    				"Chilli powder  - 11/2 tsp \n"+
    				"Turmeric powder - 1/2 tsp  \n"+
    				"Garam masala  - 11/2  to 2 tsp \n"
    				,
    				"Chicken pieces (cut into small pieces) - 1/2 kg (boneless)\n"+
    				"Onions (sliced) - 2 cups\n"+
    				"Garlic (chopped) - 2 tsp\n"+
    				"Ginger (chopped) - 2 tsp\n"+
    				"Green chillies (chopped) - 8 no.\n"+
    				"Chicken masala powder - 2 tsp\n"+
    				"Pepper (crushed) - 1 tsp\n"+
    				"Cumin seeds - 1 tsp\n"+
    				"Coconut (grated) - 1 cup\n"+
    				"Curry leaves\n"+
    				"Coriander leaves - 1/2 cup\n"+
    				"Salt\n"+
    				"Oil\n"+
    				"Mustard seeds - 1 tsp\n"+
    				"Urad dal - 1 tsp\n"+
    				"Bay leaf \n"
    				,
    				"Dry prawns (small size) - 1 cup\n"+
    				"Cabbage (thinly sliced) - 2 cups\n"+
    				"Onion (thinly sliced) - 1 cup \n"+
    				"Grated coconut - 1 cup\n"+
    				"Green chillies (chopped) - 5 no.\n"+
    				"Garam masala - 1/2 tsp\n"+
    				"Garlic - 4 flakes \n"+
    				"Cumin seeds - 1 tsp\n"+
    				"Ginger (chopped) - 1/2 tsp\n"+
    				"Pepper powder - 1/2 tsp\n"+
    				"Turmeric powder - 1/2 tsp\n"+
    				"Salt\n"+
    				"Oil\n"+
    				"Coriander leaves\n"+
    				"Ingredients for seasoning\n"+
    				"Mustard seeds - 1 tsp\n"+
    				"Urad dal (split) - 1 tsp\n"+
    				"Curry leaves\n"+
    				"Red chillies - 3 no.\n"
    				,
    				"Hard boiled egg - 4\n"+
    				"Onion (sliced) - 1cup\n"+
    				"Green chillies chopped - 3 no.\n"+
    				"Tomato (sliced) - 1 cup \n"+
    				"Garam masala - 1 tsp\n"+
    				"Coriander powder - 1 tsp\n"+
    				"Cumin seeds - 1 tsp\n"+
    				"Red chilli powder - 1 tsp\n"+
    				"Turmeric powder - 1/2 tsp\n"+
    				"Ginger-Garlic paste - 1 tsp\n"+
    				"Curry leaves\n"+
    				"Coriander leaves\n"+
    				"Salt\n"+
    				"Oil\n"
    				,
    				"fish slices 500-800g\n"+
    				"Chilli powder  - 1 1/2 to 2 tsp \n"+
    				"Coriander powder - 11/2 to 2 tsp \n"+
    				"Turmeric powder - 1/2 tsp  \n"+
    				"Onion  - 2 (thinly sliced) \n"+
    				"Ginger - 2 to 3 inches sliced \n"+
    				"Garlic - 8 to 10 cloves sliced  \n"+
    				"Green chillies - 4 to 5 sliced \n"+
    				"Few curry leaves\n"
    				,
    				"1 kg cleaned slices of Seer fish, Pearl Spot or Pomphret coconut oil  3-4 tbsp\n"+
    				"Thinly sliced onion - 4 to 5 no.  \n"+
    				"Thinly sliced ginger - 2 to 3 inches  \n"+
    				"Thinly sliced garlic   - 10 to 12 cloves \n"+
    				"Chilli powder - 4 tsp  \n"+
    				"Turmeric powder - 1/2 tsp  \n"+
    				"Fenugreek powder - 1/2 tsp \n"
    				,
    				"500-800 g pomphret, pearl spot mullet or seer fish\n"+
    				"salt\n"+
    				"turmeric\n"+
    				"pepper\n"+
    				"oil\n"+
    				"onion 2\n"+
    				"ginger 2 inches \n"+
    				"garlic\n"+
    				"10-12 gloves\n"+
    				"green chillies 2-3\n"+
    				"tomato 1\n"+
    				"coriander powder 2.5 tsp\n"+
    				"fenugreek powder .5 tsp\n"+
    				"turmeric powder .5 tsp\n"
    				,
    				"500g of fish/prawns\n"+
    				"coconut oil\n"+
    				"ginger 2 inches\n"+
    				"garlic 10-12 cloves\n"+
    				"shallots 5-6\n"+
    				"curry leaves 3\n"+
    				"mustard seeds pinch\n"+
    				"kashmiri chilli powder 4-6 tsp\n"+
    				"fenugreek powder .5 tsp\n"+
    				"turmeric powder .5 tsp\n"
    				,
    				"Mutton - 1/2 kg (cut into medium size)\n"+
    				"Coriander leaves - 25 g\n"+
    				"Mint leaves - 25 g\n"+
    				"Curry leaves - 10 g\n"+
    				"Green chillies - 5 no.\n"+
    				"Cumin seeds - 1 tsp\n"+
    				"Garlic (chopped) - 2 tsp\n"+
    				"Ginger (chopped) - 2 tsp\n"+
    				"Turmeric powder - 1/2 tsp\n"+
    				"Lime juice - 1 tsp\n"+
    				"Poppy seed paste - 1 tsp\n"+
    				"Yogurt - 1/2 cup\n"+
    				"Coriander powder - 2 tsp\n"+
    				"Aniseed powder - 1/2 tsp\n"+
    				"Ghee - 3 tsp\n"+
    				"Cinnamon - 5 to 6 no.\n"+
    				"Bay leaf - 1\n"+
    				"Cardamom seeds - 4 to 5 no.\n"+
    				"Curry leaves\n"+
    				"Onion (chopped) - 1 cup\n"+
    				"Biriyani rice - 250 g\n"+
    				"Water - 1/2 L\n"+
    				"Ghee - 2 tsp \n"+
    				"Cinnamon - 5 no.\n"+
    				"Bay leaf - 1\n"+
    				"Cloves - 4 no.\n"+
    				"Cardamom - 4 no.\n"+
    				"Nutmeg - 100 g\n"+
    				"Tomato - 1\n"+
    				"Onion (sliced) - 1 cup\n"+
    				"Cashew nuts - ¼ cup\n"+
    				"Raisins - ¼ cup\n"
    				,
    				"anchovies or sardines cleaned and cut into pieces\n"+
    				"Shredded coconut - two cups  \n"+
    				"Ginger - 2 inches \n"+
    				"Garlic - about 12 cloves  \n"+
    				"Green chillies - 4 or 5 \n"+
    				"Curry leaves - a few \n"+
    				"Turmeric powder - 1/2 tsp \n"+
    				"Fenugreek powder  - 1/2 tsp \n"+
    				"Salt - to taste \n"+
    				"Tamarind (cocum) - 3 or 4 pieces \n"+
    				"Coconut oil - 1 tbsp. \n"
    				,
    				"mutton 1kg\n"+
    				"oil\n"+
    				"Medium-sized onions - 2 (sliced)  \n"+
    				"Ginger - 2 inches \n"+
    				"Garlic - 8 to 10 cloves  \n"+
    				"Green chillies - 2 to 3 (sliced)\n"+
    				"cinnamon 2-3 sticks\n"+
    				"garlic 8-10 cloves\n"+
    				"cardamom 3-4\n"+
    				"peppercorns 1 tsp\n"+
    				"tomato 1\n"+
    				"potato 1\n"+
    				"carrots 2\n"+
    				"salt to taste\n"+
    				"coconut milk\n"+
    				"corn flour 2 tsp\n"+
    				"onion 1\n"
    				,
    				"Netholi (anchovy) fish - 1 cup\n"+
    				"Small onions (sliced) - 1 cup\n"+
    				"Ginger (chopped) - 1 tsp\n"+
    				"Garlic (chopped) - 1 tsp\n"+
    				"Kanthari mulaku or green chilly crushed - 1 tsp\n"+
    				"Peppercorns crushed - 1 tsp\n"+
    				"Turmeric powder - 1/2 tsp\n"+
    				"Curry leaves\n"+
    				"Salt\n"+
    				"Coconut oil\n"
    				,
    				"50 medium-sized prawns, shelled and cleaned\n"+
    				"1 green mango cut into small bits\n"+
    				"1 inch length ginger, cut into fine strips\n"+
    				"4 to 5 green chillies cut into two\n"+
    				"Coconut (grated) - 1\n"+
    				"Red chilli powder\n"+
    				"Turmeric powder - 1/2 tsp\n"+
    				"Cumin seeds - 1 tsp\n"+
    				"Fenugreek powder - ¼ tsp\n"+
    				"Small onions - 8 to 10 no.\n"+
    				"Curry leaves\n"+
    				"Salt\n"+
    				"Coconut oil - 1 tsp\n"
    				,
    				"pork 1 kg\n"+
    				"Coriander powder - 5-6 tbsp\n"+
    				"Chilli powder - 1 tbsp (powder roast for 1-2 minutes)\n"+
    				"Pepper powder - 1 tbsp (powder roast for 1-2 minutes)\n"+
    				"Turmeric powder - 1/2 tsp\n"+
    				"White vinegar - 2 tbsp\n"+
    				"Salt - to taste\n"+
    				"Water 1.5 cups\n"+
    				"oil 3-4 tsp\n"+
    				"garlic 10-12 cloves\n"+
    				"ginger 2 inches\n"+
    				"onions 2\n"+
    				"curry leaves 3\n"
    				,
    				"medium sized prawns 500g\n"+
    				"Chilli powder  - 2 tsp  \n"+
    				"Turmeric powder  - 1/2 tsp  \n"+
    				"Tamarind (cocum) - 2 to 3 small pieces  \n"+
    				"Coconut slices - 1/2 cup\n"+
    				"coconut oil 7 tbsp\n"+
    				"Shallotts - 1 coffee cup (or one onion, sliced)  \n"+
    				"Ginger - 2 inches (sliced) \n"+
    				"Garlic - 6-8 cloves (sliced)  \n"+
    				"Curry leaves - a few  \n"+
    				"Green chillies - 2 to 3 (sliced) \n"+
    				"onion 1\n"+
    				"fenugreek powder .5 tsp\n"
    				,
    				"Chicken - 1/2 kg (boneless)\n"+
    				"Coconut (grated) - 1 cup \n"+
    				"Ginger - 1 inch long piece \n"+
    				"Garlic - 6 no. \n"+
    				"Green chilli - 6 no. \n"+
    				"Coconut oil  \n"+
    				"Small onions - 1 cup\n"+
    				"Big onions - 1 \n"+
    				"Tomato - 1\n"+
    				"Chilli powder - 1 tsp\n"+
    				"Turmeric powder - 1/2 tsp\n"+
    				"Coriander powder - 2 tsp\n"+
    				"Garam masala - 1/2 tsp \n"+
    				"Curry leaves\n"+
    				"Salt\n"
    };

    final String NonVegInstructions[]={
    		"Marinate a kilogram of cleaned, boneless beef, cut into small cubes with the following: \n"+
    				"Thinly sliced coconut -  1.5  a cup  \n"+
    				"Shallots cut into two - 1 cup \n"+
    				"Coriander powder - 3 tbsp  \n"+
    				"Chilli powder - 2 tsp \n"+
    				"Black pepper powder - 2 tsp \n"+
    				"Turmeric powder -  1.5  tsp \n"+
    				"Garam masala - 2-3 tsp \n"+
    				"Fresh ginger, chopped - 4-5 cm \n"+
    				"Garlic cloves, chopped - 10 no. \n"+
    				"Salt - to taste. \n"+
    				"When the beef is well marinated, cook it in a pressure cooker with 200 ml of water until it becomes soft (roughly15-20 minutes).\n"+
    				"If there is water left over after the meat is done, cook with the lid open on a high flame till the water has completely evaporated.\n"+
    				"Pour three to four tablespoons of coconut oil and sauté two medium-sized onions, slices and a few curry leaves. Then add the cooked beef into it. Fry on a medium flame until the meat turns brown. \n"
    				,
    				"Cut a kilogram of chicken into medium-sized pieces and keep aside. \n"+
    				"Take 3 to 4 tablespoons of oil and sauté the following: \n"+
    				"Onion - 2 no.  \n"+
    				"Ginger - 2 inches \n"+
    				"Garlic - 8-10 cloves  \n"+
    				"Green chillies - 2 or 3. \n"+
    				"Then add the masala made by either grinding together or mixing little water with the following:\n"+
    				"Coriander powder  - 2 to 3 tbsp \n"+
    				"Chilli powder  - 1 1.5  tsp \n"+
    				"Turmeric powder -  1.5  tsp  \n"+
    				"Garam masala  - 1 1.5   to 2 tsp \n"+
    				"Stir till the masala is roasted and the oil separates out. Then add the chicken pieces and one or two cubed potatoes, one sliced tomato and salt to taste. Mix well and add one-and-a-half glass of water. Cover and cook till the meat becomes soft. If there is too much gravy, open the lid and cook on a high flame for some more time. Garnish with curry leaves. \n"
    				,
    				"Heat three teaspoons of oil in a kadai (big pan). Put mustard seeds, urad dal, cumin seeds, curry leaves, ginger and garlic. Now add green chillies and big onions. Stir and sauté for some time and add the chicken pieces. Mix gently. Add chicken masala, crushed pepper, turmeric powder and salt. \n"+
    				"You may now add two cups of water. Add bay leaf. Cover the vessel and cook well. When all of the water is absorbed, add grated coconut. Mix well. Cook for some more time. Add chopped coriander leaves and stir a bit.\n"+
    				"The delicious and spicy Chicken Thoran is now all yours.\n"
    				,
    				"Take three teaspoons of oil in a kadai (big pan) and heat it. Put mustard. When it starts to splutter, add urad dal, red chillies, curry leaves, ginger and garlic. Stir well. Now add cumin seeds, green chillies, dry prawns, turmeric powder, crushed pepper and garam masala. Pour some water and add salt. Close the vessel and cook for eight minutes. \n"+
    				"Now remove the lid of the vessel. Stir a bit and add big onions, cabbage and grated coconut. Stir well. Cover the vessel and cook for some more time. Open the lid to check whether all the water content has been absorbed. Stir again. Close the lid and cook for some more time.\n"+
    				"Serve the Dry Prawns with Cabbage hot after garnishing it with chopped coriander leaves.\n"
    				,
    				"Heat three teaspoons of coconut oil in a pan. Put cumin seeds and ginger-garlic paste and sauté for some time. To this, add sliced big onions, green chillies and curry leaves. When it turns brown in colour add tomatoes and stir well. Now add coriander powder, chilli powder, turmeric powder and garam masala. Stir well. To this, pour half-a-cup of water. Stir gently. Now add salt. \n"+
    				"When it starts to boil, cut each egg in to four or six parts and add this to the boiling contents in the pan. Mix well without breaking the yellow portion of the egg.  \n"+
    				"Garnish the Egg Koottu with chopped coriander leaves and serve hot.\n"
    				,
    				"Clean and keep aside 500 to 800 g of fleshy fish slices. \n"+
    				"Make a paste by adding a little water to the following: \n"+
    				"Chilli powder  - 1  1.5  to 2 tsp \n"+
    				"Coriander powder - 1 1.5  to 2 tsp \n"+
    				"Turmeric powder -  1.5  tsp  \n"+
    				"Heat 4 to 5 tablespoons of coconut oil and splutter a teaspoon of mustard seeds. Then add half-a-teaspoon of fenugreek seeds and also:\n"+
    				"Onion  - 2 (thinly sliced) \n"+
    				"Ginger - 2 to 3 inches sliced \n"+
    				"Garlic - 8 to 10 cloves sliced  \n"+
    				"Green chillies - 4 to 5 sliced \n"+
    				"Few curry leaves. \n"+
    				"Sauté till the onion becomes transparent. Then add the masala paste and fry till you get a roasted smell. Add two sliced tomatoes and sauté.\n"+
    				"Add a cup of water and salt to taste and let the water boil. When the water boils, add the fish slices. Cover and cook on a low flame till the gravy becomes thick.\n"+
    				"Finally, add one cup of coconut milk and remove from the fire as soon the milk is just warmed up. \n"
    				,
    				"Keep a kilogram of cleaned slices of Seer fish, Pearl Spot or Pomphret ready.\n"+
    				"In three or four tablespoons of coconut oil, sauté the following: \n"+
    				"Thinly sliced onion - 4 to 5 no.  \n"+
    				"Thinly sliced ginger - 2 to 3 inches  \n"+
    				"Thinly sliced garlic   - 10 to 12 cloves \n"+
    				"When the sautéed mixture become light brown, remove from the fire and keep the mixture aside in another vessel.\n"+
    				"Now, into the same pan, pour two tablespoons of oil and roast a paste made with the following: \n"+
    				"Chilli powder - 4 tsp  \n"+
    				"Turmeric powder -  1.5  tsp  \n"+
    				"Fenugreek powder -  1.5  tsp \n"+
    				"The paste is made either by mixing the three powders with a little water or by grinding them all together. \n"+
    				"Fry till you get the roasted odour. Then add one-fourth of a kilogram of sliced tomato. Cook till the tomato becomes soft. Now add the sautéed onion-ginger-garlic mixture. Add a tablespoon of vinegar and salt to taste and stir everything well.\n"+
    				"When the ingredients are all well mixed, remove the pan from the fire and keep aside.\n"+
    				"Take a banana leaf and show it over the fire to make it soft. After spreading a little oil on it, put some masala and place a slice of fish on it. Spread some more masala on top of the fish and then wrap the fish with the leaf and tie it up tightly. \n"+
    				"Heat up a thick-bottomed pan and cook the fish packets in some oil poured into the pan. Cover and cook on a low fire, turning the fish periodically. \n"+
    				"When the banana leaf becomes light brown, the fish is more or less done. \n"
    				,
    				"Clean and keep aside 500 - 800 g of Pomphret, Pearl Spot, Mullet or Seer fish.\n"+
    				"Marinate the fish with a little salt, turmeric and pepper for 15-30 minutes. Shallow-fry and keep it aside.\n"+
    				"Splutter a teaspoon of mustard seeds in three to four tablespoons of oil and sauté the following:\n"+
    				"Onion  - 2 (thinly sliced) \n"+
    				"Ginger - 2 inches (sliced) \n"+
    				"Garlic - 10 to 12 cloves (sliced)  \n"+
    				"Green chillies - 2 or 3 split into two \n"+
    				"When the onion becomes transparent, add a sliced tomato. \n"+
    				"Saute again and then add the masala paste made by either grinding together or mixing little water with the following:\n"+
    				"Coriander powder - 2 1.5  tsp  \n"+
    				"Fenugreek powder -  1.5  tsp \n"+
    				"Turmeric powder -  1.5  tsp \n"+
    				"Stir till you get a roasted smell. Then add two to three cups of thin coconut milk (the second extract of one coconut) and add salt to taste.\n"+
    				"Add the shallow-fried fish when the coconut milk boils. Cover and cook for 15 minutes. \n"+
    				"Then add the first extract of coconut milk (thick coconut milk). (For thicker gravy, add two teaspoons of corn flour diluted in water).\n"+
    				"Allow a minute’s boiling and remove from the fire. Put some fresh coriander leaves on top.\n"
    				,
    				"Clean and cut 500 g of any fish / prawns into square or round pieces and keep aside.\n"+
    				"In a wide, thick-bottomed vessel (clay or non-stick), pour three to four tablespoons of coconut oil.\n"+
    				"Keep the following ready for sautéing: \n"+
    				"Ginger - 2 inches (slice into thin, long pieces)\n"+
    				"Garlic - 10 to 12 cloves (slice into thin, long pieces)\n"+
    				"Shallots - 5 to 6\n"+
    				"Curry leaves - a few\n"+
    				"Splutter a teaspoon of mustard seeds, add the above four ingredients and saute.\n"+
    				"Then add a paste made of the following: \n"+
    				"Kashmiri chilli powder  - 4 to 6 tsp  \n"+
    				"Fenugreek powder -  1.5  tsp  \n"+
    				"Turmeric powder -  1.5  tsp  \n"+
    				"The masala or paste can be made either by grinding the three powders together or adding little water to the powder mixture.\n"+
    				"Stir till the oil separates from the masala. Add salt to taste, few pieces of tamarind (cocum) and half to one cup of water. Let it boil. \n"+
    				"Then, arrange the slices of fish neatly in the boiling masala with some curry leaves on top. Cover and cook till the fish are done and the gravy becomes thick. Then, add three tablespoons of coconut oil on top and remove from the fire.\n"+
    				"Keep this fish curry for 10-12 hours before using it. One may use it immediately after it is done but the taste will not be as good. \n"
    				,
    				"You may begin by marinating the mutton pieces. Take the mutton pieces in a bowl and add garlic, cloves, cinnamon, aniseeds, green chillies, turmeric powder, poppy-seed paste, chopped ginger, nutmeg, bay leaf, mint leaves, cumin seeds, cardamom, coriander powder, lime juice, curry leaves, yoghurt and salt. Mix well and keep it aside\n"+
    				"Now take a pan and heat one teaspoon of ghee. Put cashew nuts. When they become brown, remove it. Repeat the process with raisins. You may now put big onions, salt and stir well. Keep the contents aside.\n"+
    				"Heat three teaspoons of ghee in a pan. Put shredded onions and stir. To this, add tomatoes and stir well. Now add the marinated mutton. Pour enough water and stir a bit. Close the vessel and cook. \n"+
    				"Take another vessel and heat four teaspoons of ghee. Put cloves, aniseeds, cinnamon, cumin seed powder and curry leaves. To this, add cardamom and onions. Stir well and add the rice. Stir again. Pour enough water to cover the rice. Now add salt. Cover the vessel and cook. \n"+
    				"Now remove the lid of the pan in which the mutton is being cooked. Stir a bit. \n"+
    				"From the vessel in which the rice is being prepared, remove a portion of the cooked rice into a bowl. Take some mutton pieces and place them on top of the remaining rice in the vessel. Add the portion of the cooked rice removed into a bowl on top of the mutton pieces. Again add the remaining mutton pieces on top of this. Finally add cashew nuts, raisins and fried onions. Add some coriander leaves and cook for a minute. \n"+
    				"Now get ready to savour this popular delicacy from the Malabar region of Kerala.\n"
    				,
    				"For this preparation, you will need any small fish such as anchovies or sardines. \n"+
    				"Clean the fish. If sardines are used, cut each fish into two pieces. \n"+
    				"You will also need the following:\n"+
    				"Shredded coconut - two cups  \n"+
    				"Ginger - 2 inches \n"+
    				"Garlic - about 12 cloves  \n"+
    				"Green chillies - 4 or 5 \n"+
    				"Curry leaves - a few \n"+
    				"Turmeric powder -  1.5  tsp \n"+
    				"Fenugreek powder  -  1.5  tsp \n"+
    				"Salt - to taste \n"+
    				"Tamarind (cocum) - 3 or 4 pieces \n"+
    				"Coconut oil - 1 tbsp. \n"+
    				"Mix together all the ingredients, except the fish. When they are well mixed, add the fish and mix again gently. Then add one cup of water. Cover and cook till the fish are done and the water dries up on a low flame.\n"
    				,
    				"Clean and keep aside half a kilogram of mutton, cut into medium-sized pieces.\n"+
    				"In three to four tablespoons of oil, sauté the following: \n"+
    				"Medium-sized onions - 2 (sliced)  \n"+
    				"Ginger - 2 inches \n"+
    				"Garlic - 8 to 10 cloves  \n"+
    				"Green chillies - 2 to 3 (sliced). \n"+
    				"Then add two or three sticks of cinnamon; eight to ten cloves; three or four cardamoms, and a teaspoon of peppercorns. Saute.\n"+
    				"Now add a sliced tomato; one big potato cubed, one or two cubed carrots and salt to taste.\n"+
    				"Saute once more. Add the sliced mutton and mix well. Add three or four cups of the second extract of coconut milk.\n"+
    				"Cover and cook till the meat becomes soft. Then add two teaspoons of corn flour diluted in cold water to thicken the gravy.\n"+
    				"Boil for two or three minutes. Then add the first extract of coconut milk. Warm up and remove from the fire.\n"+
    				"Garnish with sliced small onion roasted in ghee. \n"
    				,
    				"Take two teaspoons of oil and heat it in a pan. Put ginger, garlic, green chillies and onions. Stir well and fry it for three minutes. Now add turmeric powder and crushed pepper. Stir well and add salt. Stir and add the cleaned netholi (anchovy) fish. Stir and cook for some time. \n"+
    				"Now keep the pan aside and heat two teaspoons of oil in an earthen vessel. Place the steamed banana leaf inside the vessel and pour some oil on it. Place the cleaned netholi (anchovy) fish on the banana leaf and wrap it. Cover the earthen pot and cook on low fire. \n"+
    				"When it is cooked well, remove from fire. Garnish it with curry leaves and serve hot.\n"
    				,
    				"Put prawns in an earthen vessel. Into this, add mango and chopped green chillies. Add salt and pour some water. Mix the contents well. Now close the vessel and cook for some time. When the prawns are cooked, add the ground masala mixed with half-a-cup of water. Boil on a high flame. Stir a bit. Add curry leaves. When it boils, lower the flame to simmer. Add some oil and cook for five minutes.\n"+
    				"Serve the Prawns curry hot.\n"
    				,
    				"Clean and cut a kilogram of pork into medium-sized pieces and marinate with the following: \n"+
    				"Coriander powder - 5-6 tbsp\n"+
    				"Chilli powder - 1 tbsp (powder roast for 1-2 minutes)\n"+
    				"Pepper powder - 1 tbsp (powder roast for 1-2 minutes)\n"+
    				"Turmeric powder -  1.5  tsp\n"+
    				"White vinegar - 2 tbsp\n"+
    				"Salt - to taste\n"+
    				"After half an hour, pressure cook with half-a-cup of water for 20 to 25 minutes. In to a wok, pour three to four tablespoons of oil and saute 10 to 12 cloves of crushed garlic.\n"+
    				"Add two inches of sliced ginger and two sliced onions. Stir till the onion becomes pale and soft. Add a few curry leaves and the pre-cooked pork.\n"+
    				"Cover and cook for a few more minutes till the gravy becomes thick. Stir well.\n"
    				,
    				"Cook 500 g of cleaned, medium-sized prawns with the following: \n"+
    				"Chilli powder  - 2 tsp  \n"+
    				"Turmeric powder  -  1.5  tsp  \n"+
    				"Tamarind (cocum) - 2 to 3 small pieces  \n"+
    				"Coconut slices -  1.5  cup \n"+
    				"Keep the cooked prawn aside. In another pan, splutter a teaspoon of mustard seeds in three tablespoons of coconut oil. Then in it, sauté the following: \n"+
    				"Shallotts - 1 coffee cup (or one onion, sliced)  \n"+
    				"Ginger - 2 inches (sliced) \n"+
    				"Garlic - 6-8 cloves (sliced)  \n"+
    				"Curry leaves - a few  \n"+
    				"Green chillies - 2 to 3 (sliced) \n"+
    				"When the onion becomes soft (transparent), add the cooked prawns and enough water. Also add half a teaspoon of fenugreek powder. Mix well. Cover and cook till the water dries up.\n"+
    				"Then mix in three to four tablespoons of coconut oil and cook on a low flame. Remove from the fire after five minutes\n"
    				,
    				"Heat two teaspoons of oil in a pan and fry the grated coconut. Put coriander powder, chilli powder, garam masala, turmeric powder and stir well. When the mixture becomes brown in colour, make it into a paste and keep it aside. \n"+
    				"Now take a pan and heat some oil. Add some curry leaves. To this, add the mixture comprising small onions, ginger, green chillies and garlic. Fry for some time. Now add the chicken pieces along with salt and stir. Pour about two cups of water. Stir gently. Close the pan and cook for some time.\n"+
    				"Open the pan and add big onions and tomatoes. Pour some more water. Now cover the pan and cook for 20 minutes. \n"+
    				"You may now remove the lid and add the grounded masala kept aside. Add some more water. Stir well. Put some curry leaves. Cook for another ten minutes on low flame.\n"+
    				"Now get ready to relish this spicy chicken dish. \n"

	
    };    
    final String NonVeg_Vids[]={

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
    
    final TextView t2 = (TextView) findViewById(R.id.textViewLink2);
    t2.setMovementMethod(LinkMovementMethod.getInstance());
    

    // Selection of the spinner
    final Spinner spinner = (Spinner) findViewById(R.id.spinner2);
    final EditText txt_Ingredients2 = (EditText) findViewById(R.id.ingredients2);
    final EditText txt_Instructions2 = (EditText) findViewById(R.id.instructions2);
    txt_Ingredients2.setFocusable(false);
    txt_Instructions2.setFocusable(false);
    // Application of the Array to the Spinner
    ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this,   android.R.layout.simple_spinner_item, NonVegList);
    spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down vieww
    spinner.setAdapter(spinnerArrayAdapter);
    
    
		spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				//Log.d("gil", Ingredients[spinner.getSelectedItemPosition()]);
				txt_Ingredients2.setText(NonVegIngredients[spinner.getSelectedItemPosition()]);
				txt_Instructions2.setText(NonVegInstructions[spinner.getSelectedItemPosition()]);
				t2.setText(Html.fromHtml("<a href=\""+NonVeg_Vids[spinner.getSelectedItemPosition()]+"\">Watch recipe video on YouTube</a> "));

			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
  
}
 
} // end class
