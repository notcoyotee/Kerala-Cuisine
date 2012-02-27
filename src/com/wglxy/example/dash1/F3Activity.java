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
 * This is the activity for feature 3 in the dashboard application.
 * It displays some text and provides a way to get back to the home activity.
 *
 */

public class F3Activity extends DashboardActivity 
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
    setContentView (R.layout.activity_f3);
    setTitleFromActivityLabel (R.id.title_text);
    
    final String KeralaSpecialityList[] = {
    		"Aattirachi (Mutton) Ularthiyathu",
    		"Ada Pradhaman",
    		"Alleppey fish curry",
    		"Appam",
    		"Appam & Mutton Stew",
    		"Arikkadukka",
    		"Avial",
    		"Beef Ularthiyathu",
    		"Chemmeen Moile",
    		"Chemmeen Thullichathu",
    		"Chemmeen Varuthathu",
    		"Chicken Pepper Fry",
    		"Chilli Garlic Prawns",
    		"Chiratta Puttu",
    		"Chuttirachi",
    		"Cochin Attin Soup",
    		"Dry Fish Curry",
    		"Duck Mappas",
    		"Duck Roast",
    		"Erachi Vada",
    		"Finger Prawns",
    		"Ginger feathered tiger prawns",
    		"Golden Fried Prawns",
    		"Green Masala Fried Karimeen",
    		"Kallappam (10Nos.)",
    		"Kallummakaya Ularthiyathu",
    		"Kappa & Meen Mulakittathu",
    		"Kappa (Tapioca) Biriyani",
    		"Karimeen Mappas",
    		"Karimeen pollichathu",
    		"Kaya Attirachi Curry",
    		"Kerala Fish Curry",
    		"Kerala Mutton Soup (for two portions)",
    		"Konchu (Prawn) Fry",
    		"Konchu Pollichathu",
    		"Kozhi Peralan",
    		"Kozhuva (Anchovies) Varuthathu",
    		"Lamb with Kappa (Tapioca) Ularthiathu",
    		"Madhura Kizhangu Uppumavu",
    		"Malabar Chicken Biriyani.",
    		"Malabar Duck Roast",
    		"Malabar Lamb Curry",
    		"Malabar Mutton Biriyani",
    		"Malabari Chemmeen Soup",
    		"Malabari Fish Roast",
    		"Masala Fried Fish",
    		"Masala Fried Prawns",
    		"Masala Grilled Pork (Serves 2)",
    		"Meen Moleshyam",
    		"Meen Muringakka Curry",
    		"Meen Pathiri",
    		"Meen Peera",
    		"Meen Pollichathu (Pomfret)",
    		"Meen Thavayil Pollichathu",
    		"Mezhukkupuratty",
    		"Mutton Biriyani (2 Plates)",
    		"Mutton Coconut Fry",
    		"Mutton Urunda Kulambu",
    		"Nadan Kozhi Curry",
    		"Naimeen Molee (Sear Fish)",
    		"Naimeen Soup",
    		"Naimeen Vevichathu",
    		"Palada Pradhaman",
    		"Pappadam Thoran",
    		"Pathiri",
    		"Pazham Nirachathu",
    		"Pazhampori",
    		"Pork With Kaya Ularthiyathu",
    		"Prawns Appam",
    		"Prawns Chilly Fry",
    		"Prawns in Country Style",
    		"Puttu and Kadala Curry",
    		"Seafood Grill",
    		"South Indian Potatoes",
    		"Squid Ularthiyathu",
    		"Stewed Vegetables With Prawns",
    		"Stuffed Chicken 'Kerala Style'",
    		"Stuffed Kallummekaya (Mussels) with seafood",
    		"Tender Coconut Souffle",
    		"Thalassery Kozhicurry",
    		"Travancore Appam (for 4 persons)",
    		"Travancore Chicken Fry (4 Portion)",
    		"Ulli Theeyal",
    		"Varuttirachi",
    		"Vathalappam",
    		"Vegetable Manga Mappas"
    		};
    final String KeralaSpecialityIngredients[] = {
    		"Aattirachi (Mutton) 1 kg (cut into cubes)\n"+
    				"Tomato 250 g\n"+
    				"Onion 250 g\n"+
    				"Green Chillies 100 g\n"+
    				"Coriander Powder 6 tbsp\n"+
    				"Chilli Powder 2 tbsp\n"+
    				"Black Pepper Powder 2 tbsp\n"+
    				"Turmeric Powder 2 Tsp\n"+
    				"Ginger 50 g\n"+
    				"Garlic 25 g\n"+
    				"Cinnamon, Cloves, Cardamom 10 g\n"+
    				"Curry Leaves Few leaves\n"+
    				"Oil 25 g\n"+
    				"Salt To taste\n"
    				,
    				"Ada 50g\n"+
    				"Jaggery 150g\n"+
    				"Coconut milk 250ml\n"+
    				"Sultanas 25g\n"+
    				"Cashew nuts 25g\n"+
    				"Ghee 50ml\n"+
    				"Cardamom powder 05g\n"+
    				"Coconut 10g\n"
    				,
    				"Fish 250 gm\n"+
    				"Coconut oil 50 gm\n"+
    				"Mustard seeds and \n"+
    				"fenugreek little\n"+
    				"Coconut 0.5\n"+
    				"Row mango 1 small\n"+
    				"Tomato 1\n"+
    				"Chilly powder a pinch\n"+
    				"Turmeric powder 1 sp and 0.5\n"+
    				"Curry leaves 1 spring\n"+
    				"Salt\n"
    				,
    				"Rice flour 1 kg\n"+
    				"Yeast 5gm\n"+
    				"Coconut milk 0.5 litre\n"+
    				"Sugar to taste \n"+
    				"Salt to taste\n"+
    				"Water according to consistency\n"+
    				"Kappi 100 g\n"+
    				"Crab diced 0.5 kg\n"+
    				"Onion 200g\n"+
    				"Ginger 25g\n"+
    				"Green Chilli 4\n"+
    				"Garlic 25g\n"+
    				"Curry Leaves little\n"+
    				"Tomato 100g\n"+
    				"Coconut milk 2 no (10.5 glass)\n"+
    				"Garam masala little \n"+
    				"Turmeric Powder 1tsp\n"+
    				"Coriander powder 25g\n"+
    				"Chilli powder 30g\n"+
    				"Salt to taste\n"+
    				"Coconut oil 100g\n"
    				,
    				"Rice flour (finely powdered ) 500 g\n"+
    				"Coconut milk 250 ml\n"+
    				"Salt to taste\n"+
    				"Sugar 1 tbsp\n"+
    				"Semolina 100 g\n"+
    				"Water\n"+
    				"Mutton 250 g\n"+
    				"Coconut ?\n"+
    				"Onion 2 no.s\n"+
    				"Potatoes 2\n"+
    				"Tomatoes 3\n"+
    				"Green chilies 6\n"+
    				"Garlic ?\n"+
    				"Ginger 4 pieces\n"+
    				"Poppy seeds 1 tsp\n"+
    				"Cinnamon ? pod\n"+
    				"Cloves ? pod\n"+
    				"Coriander seeds 1 tbsp\n"+
    				"Coriander leaves ?\n"+
    				"Oil 2 tbsp\n"+
    				"Salt to taste\n"
    				,
    				"Mussels 16\n"+
    				"Parboiled Rice 250 g\n"+
    				"Small Onions 75 g\n"+
    				"Curry Leaves 2 sprigs\n"+
    				"Grated Fresh Coconut 75 g\n"+
    				"Saunf 1 tsp\n"+
    				"Salt to taste\n"+
    				"Oil to fry\n"+
    				"For Marinade \n"+
    				"Red Chilli powder 1 tbsp\n"+
    				"Turmeric 1 pinch\n"+
    				"Ginger Garlic paste 1 tsp\n"+
    				"Lime juice 1 tsp\n"+
    				"Salt to taste\n"
    				,
    				"Carrot 100g\n"+
    				"Beans 100g\n"+
    				"Raw Banana 1\n"+
    				"Yam 25g\n"+
    				"Drumstick 2\n"+
    				"Coconut 1\n"+
    				"Coconut oil 100ml\n"+
    				"Jeera 10g\n"+
    				"Green chilly 4\n"+
    				"Curd 50ml\n"+
    				"Salt to taste\n"+
    				"Turmeric powder 5 g\n"+
    				"Curry leaves 1 sprig\n"
    				,
    				"Beef (trimmed) 0.5kg \n"+
    				"Red chilli powder 3/4 spoon\n"+
    				"Coriander powder 1 tsp\n"+
    				"Turmeric powder 0.5 tsp\n"+
    				"Pepper powder 1/4 tsp\n"+
    				"Cummins (Jeera) 1 pinch\n"+
    				"Cinnamon 2 pinch\n"+
    				"Cloves 3-4\n"+
    				"Cardamom 2\n"+
    				"Shallots (sliced) 100g\n"+
    				"Garlic (flakes) 1 big clove\n"+
    				"Ginger 1 piece\n"+
    				"Curry leaves 2 sprigs\n"+
    				"Coconut (cut into small pieces) 100g\n"+
    				"Vinegar 0.5 tsp\n"+
    				"Salt to taste\n"+
    				"Coconut oil 50ml\n"+
    				"Mustard seeds 1tsp\n"
    				,
    				"Chemmeen 100 gm\n"+
    				"Curry leaves 1 sprig\n"+
    				"Garlic 1/4 tsp chop\n"+
    				"Ginger 1/4 thin strips - tsp\n"+
    				"Onion 4 nos.\n"+
    				"Turmeric powder 1 pinch\n"+
    				"Lime juice 1/4 tsp\n"+
    				"Coconut milk 100 ml\n"+
    				"Coconut oil 10 ml\n"+
    				"Mustard seeds 2 gm\n"
    				,
    				"Coconut oil 10 ml\n"+
    				"Mustard seeds 2 gm\n"+
    				"Fenugreek 1 gm\n"+
    				"Curry leaves 3 nos.\n"+
    				"Ginger julienne 5 gm\n"+
    				"Green chilly 2 slice\n"+
    				"Shallot 10 gm\n"+
    				"Quartered tomato 1 no.\n"+
    				"Thick coconut milk 300 ml\n"+
    				"Salt to taste\n"+
    				"Lime juice 0.5\n"+
    				"Prawns 150 gm\n"
    				,
    				"Prawns 12\n"+
    				"Salt to taste\n"+
    				"Lemon Juice from 1 lemon\n"+
    				"Red chilli paste 1 tsp (5 g)\n"+
    				"Turmeric powder 0.5 tsp (2 g)\n"+
    				"Cumin powder 1 tsp (5 g)\n"+
    				"Ginger-garlic paste 1 tsp (5 g)\n"+
    				"Oil to fry\n"
    				,
    				"Chicken 300 gms\n"+
    				"Onion 75 gms\n"+
    				"Curry leaves 5 gms\n"+
    				"Salt to taste\n"+
    				"Oil 20 ml\n"+
    				"Garlic 10 gms\n"+
    				"Grinding \n"+
    				"Turmeric 2 gms\n"+
    				"Chilly powder 5 gms\n"+
    				"Pepper corns 10 gms\n"+
    				"Cumin 3 gms\n"+
    				"Ginger 5 gms\n"
    				,
    				"Tiger Prawns (12 to 18 count) 24 pcs\n"+
    				"Diced onions 100 g\n"+
    				"Capsicum 150 g\n"+
    				"Sliced green chillies 25 g\n"+
    				"Ginger 50 g\n"+
    				"Garlic 50 g\n"+
    				"Refined flour 75 g\n"+
    				"Corn flour 50 g\n"+
    				"Sugar 2 g\n"+
    				"Salt 3 g\n"+
    				"Monosodium glutamate 3 g\n"+
    				"Oil For frying\n"+
    				"Red colour 5 ml\n"+
    				"White pepper powder 2 g\n"
    				,
    				"Raw rice flour 1 kg\n"+
    				"Coconut 1\n"+
    				"Cumin seed 3 pinches\n"+
    				"Chiratta 2 or 3.\n"+
    				"Salt Water to taste\n"
    				,
    				"Green gram 500 g\n"+
    				"Coconut 1\n"+
    				"Small onion 40 g\n"+
    				"Red Chilli 8\n"+
    				"Curry leaves 6 g\n"+
    				"Coconut oil 200 ml\n"+
    				"Mustard 3 g\n"
    				,
    				"Buffalo meat slices 400 gm\n"+
    				"Chilly powder 5 gm\n"+
    				"Ginger garlic paste 5 gm\n"+
    				"Coconut oil 5 ml\n"+
    				"Garam Masala powder 2 gm\n"+
    				"Black pepper powder 2 gm\n"+
    				"Turmeric powder 1 gm\n"+
    				"Salt to taste\n"
    				,
    				"Ghee 5 ml\n"+
    				"Mutton stock 200 ml\n"+
    				"Mutton meat 20 gm\n"+
    				"Shallot 20 gm\n"+
    				"Garlic 5 gm\n"+
    				"Coriander leaves 5 gm\n"+
    				"Turmeric 1 pinch\n"+
    				"Rice flour 5 gm\n"+
    				"Thick coconut milk 30 ml\n"+
    				"Coconut oil 5 ml\n"+
    				"Mustard 1 pinch\n"+
    				"Curry leaves 0.5 sprig\n"+
    				"Salt to taste\n"
    				,
    				"Dry fish 250 g\n"+
    				"Onion 75 g\n"+
    				"Green chilli 2\n"+
    				"Ginger garlic paste 30 g\n"+
    				"Coriander powder 30 g\n"+
    				"Chilli powder 30 g\n"+
    				"Turmeric powder 10 g\n"+
    				"Curry leaves 100 g\n"+
    				"Mustard 100 g\n"+
    				"Fenugreek 100 g\n"+
    				"Coconut oil 100 g\n"
    				,
    				"Duck 1 no\n"+
    				"Chillie Powder 1tsp\n"+
    				"CorianderPowder 1tsp\n"+
    				"Pepper 1 large pinch\n"+
    				"Turmeric 1tsp\n"+
    				"Ghee or mixture of ghee and oil 0.5 cup\n"+
    				"Onion 1 large\n"+
    				"Vinegar 1tsp\n"+
    				"Coconut 1 no\n"+
    				"Salt to taste \n"+
    				"Ghee 1tsp\n"+
    				"Cinnamon 2.5 cm pieces \n"+
    				"Cloves 3\n"+
    				"Mustard Seeds 1tsp\n"+
    				"Curryleaves 1 sprig \n"
    				,
    				"Duck 1\n"+
    				"Water 2 cups\n"+
    				"Garlic Paste 1/4 tsp\n"+
    				"Ginger Paste 1/4 tsp\n"+
    				"Turmeric Paste 1/4 tsp\n"+
    				"Black Pepper Powder 1/4 tsp\n"+
    				"Onion slices 1\n"+
    				"Salt to taste\n"+
    				"Oil for deep-frying\n"
    				,
    				"Minced Meat 500 g\n"+
    				"Eggs 6 \n"+
    				"Garlic 50 g\n"+
    				"Ginger 50 g\n"+
    				"Green Chilly 50 g\n"+
    				"Cinnamon 2 g\n"+
    				"Cloves 2 g\n"+
    				"Fennel 2 g\n"+
    				"Coriander Leaves 50 g\n"+
    				"Salt To taste \n"
    				,
    				"Prawns with head & tail 200g\n"+
    				"Lime 1\n"+
    				"Parsley 1 sprig \n"+
    				"Salad oil 5ml\n"+
    				"Pepper, Salt to taste\n"+
    				"Ginger & garlic paste 10g \n"+
    				"Egg 1\n"+
    				"Maida 25g\n"+
    				"Corn flour 25g\n"+
    				"Bread crumbs 50g \n"+
    				"Refined oil 100ml\n"+
    				"Potatoes 100g\n"+
    				"Lettuce 50g\n"
    				,
    				"Tiger prawn 1no\n"+
    				"Ginger 1piece\n"+
    				"Aubergine 3slice\n"+
    				"Lemon grass 1piece\n"+
    				"Turmeric powder 1pinch\n"+
    				"Salt & pepper to taste\n"+
    				"Mango puree 1tsp\n"
    				,
    				"Prawns with tails (15 count) 200 gm, 3 nos\n"+
    				"Egg 0.5 no\n"+
    				"Maida 25 gms\n"+
    				"Cornflour 25 gms\n"+
    				"Pepper, salt to taste\n"+
    				"Ginger garlic paste 10 gms\n"+
    				"Soya sauce 5 ml\n"+
    				"Oil 70 gms\n"+
    				"Potato \n"+
    				"100 gms\n"+
    				"Lime 1 no.\n"
    				,
    				"Karimeen (pearl spot) (200gm) 1\n"+
    				"Green pepper 1tsp\n"+
    				"Green chilli 1\n"+
    				"Ginger-garlic paste 1 tsp\n"+
    				"Coconut oil 1 tsp\n"+
    				"Lime juice 1 tsp\n"+
    				"Egg 1\n"
    				,
    				"Raw rice 500 g\n"+
    				"Yeast 2 g\n"+
    				"Sugar 50 g or to taste\n"+
    				"Salt to taste\n"+
    				"Coconut 1\n"+
    				"Cumin 5 g\n"+
    				"Small onions (sliced) 10 \n"+
    				"Curry leaves (chopped) 2 sprigs \n"+
    				"Garlic (crushed) 5 cloves \n"+
    				"Coconut oil 20 ml\n"
    				,
    				"Coconut oil 50ml\n"+
    				"Fennel 10ml\n"+
    				"Curry leaves 1\n"+
    				"Ginger julienne 50g\n"+
    				"Green Chilly 25g\n"+
    				"Coconut slice 25g\n"+
    				"Mango puree 1tsp\n"+
    				"Chilly powder 10.5tsp\n"+
    				"Turmeric powder 0.5tsp\n"+
    				"Coriander powder 1 0.5tsp\n"+
    				"Tomato 100g\n"+
    				"Salt to taste\n"+
    				"Mussles 1 kg\n"+
    				"Small onion 250g\n"+
    				"Below mentioned items should be crushed\n"+
    				"Fennel 10g\n"+
    				"Pepper corn 10g\n"+
    				"Red chilly 10g\n"+
    				"Small onion 50g\n"
    				,
    				"Tapioca 1kg \n"+
    				"Green Chilly 2 no \n"+
    				"Coconut Half \n"+
    				"Turmeric powder a pinch \n"+
    				"Salt to taste\n"+
    				"Curry leaves 1 sprig\n"+
    				"Small onions 2 or 3 \n"+
    				"Mustard seeds 1 tsp\n"+
    				"Curry leaves a sprig\n"+
    				"Coconut oil 1 tbsp\n"+
    				"Seer fish 500g\n"+
    				"Red chilly powder 40 g \n"+
    				"Coriander powder 20g\n"+
    				"Ginger 1 piece\n"+
    				"Garlic 1 clove\n"+
    				"Kokum 15g\n"+
    				"Salt to taste\n"+
    				"Coconut oil 2tbsp\n"+
    				"Small onions 2 or 3\n"+
    				"Mustard seeds 1tsp\n"+
    				"Red chilly 2 \n"+
    				"Fenugreek a pinch\n"+
    				"Curry leaves 2 sprigs\n"
    				,
    				"Tapioca 1 Kg\n"+
    				"Green chilli 4\n"+
    				"Curry leaves 2 leaflets\n"+
    				"Coconut oil 100 g\n"+
    				"Mustard seeds a little\n"+
    				"Coconut paste (fried) 50 g\n"+
    				"Meat 250 g\n"+
    				"Garlic 25 g\n"+
    				"Ginger 25 g\n"+
    				"Small onion 100 g\n"+
    				"Coriander powder 1 0.5 tsp\n"+
    				"Turmeric powder 1 0.5 tsp\n"+
    				"Red chilli powder 1 0.5 tsp\n"+
    				"Coriander leaves (Chopped) to taste\n"+
    				"Salt 100 ml\n"+
    				"Garam masala a little\n"
    				,
    				"Karimeen (Pearl spot) 200 gm\n"+
    				"Coconut Half a coconut\n"+
    				"Coconut oil 50 ml\n"+
    				"Mustard 5 gms\n"+
    				"Curry leaves to taste\n"+
    				"Shallots-sliced 30 gms\n"+
    				"Ginger-sliced 10 gms\n"+
    				"Garlic-sliced 10 gms\n"+
    				"Green Chillies Split 10 gms\n"+
    				"Vinegar 10 ml\n"+
    				"Salt to taste\n"+
    				"Dry chillies 5 gms\n"+
    				"Coriander 10 gms\n"+
    				"Shallots 2 gms\n"+
    				"Ginger 5 gms\n"+
    				"Turmeric 2 gms\n"
    				,
    				"Karimeen 200g\n"+
    				"Ginger 10g\n"+
    				"Garlic 10g\n"+
    				"Onion (chopped) 50g\n"+
    				"Curry leaves 2 springs\n"+
    				"Chilly Powder 5g\n"+
    				"Turmeric Powder 3g\n"+
    				"Coriander Powder 5g\n"+
    				"Peppercorn crush 2g\n"+
    				"Lime 1\n"+
    				"Salt to taste\n"+
    				"Coconut Oil 25ml \n"+
    				"Banana leaf 1 \n"
    				,
    				"Raw bananas 2 Nos\n"+
    				"Lamb Leg 200 gm\n"+
    				"Coconut 0.5 a coconut \n"+
    				"Coriander powder 15 gm\n"+
    				"Red chilly powder 15 gm\n"+
    				"Turmeric powder 5 gm\n"+
    				"Sonf 5 gm\n"+
    				"Peeled garlic 5 gm\n"+
    				"Curry leaves 1 sprig\n"+
    				"Salt To taste\n"
    				,
    				"Fish (Seer fish) 150 gms\n"+
    				"Oil 20 ml\n"+
    				"Fenugreek 5 gm\n"+
    				"Onion 40 gms\n"+
    				"Ginger 10 gms\n"+
    				"Chilly powder 15 gms\n"+
    				"Coriander powder 15 gms\n"+
    				"Big Chilly 2 gms\n"+
    				"Turmeric powder 2 gms\n"+
    				"Tomato slices 25 gms\n"+
    				"Coconut 1/4 no\n"+
    				"Tamarind 15 gms\n"+
    				"Salt to taste\n"+
    				"Curry leaves 5 gms\n"+
    				"Garlic 2 gms\n"
    				,
    				"Mutton stock 500 ml\n"+
    				"Mashed potato 75 g\n"+
    				"Shallots (sliced) 10\n"+
    				"Ginger (chopped) 10 g\n"+
    				"Curry leaves (chopped) 10 leaves\n"+
    				"Chilli powder 1 tsp\n"+
    				"Coriander powder 1 tsp\n"+
    				"Turmeric powder 1 pinch\n"+
    				"Garam masala 0.5 tsp\n"+
    				"Minced Mutton 50 g\n"+
    				"Coconut oil 15 ml\n"+
    				"Ghee 15 ml\n"
    				,
    				"Prawn 4\n"+
    				"Chilli powder 3/4 tsp\n"+
    				"Turmeric powder 1/4 tsp\n"+
    				"Coriander powder 0.5 tsp\n"+
    				"Tamarind 10 g\n"+
    				"Water 0.5 cup\n"+
    				"Ginger paste 0.5 tsp\n"+
    				"Garlic paste 0.5 tsp\n"+
    				"Salt to taste\n"+
    				"Coconut oil 1 tsp\n"
    				,
    				"Konju (Scampi) 4\n"+
    				"Onion (Chopped) 250g\n"+
    				"Ginger garlic paste 10g\n"+
    				"Tomato (chopped) 150g\n"+
    				"Curry leaves 10 leaves\n"+
    				"Green chillies 5 \n"+
    				"Mustard seeds 5g\n"+
    				"Chilli powder 50g\n"+
    				"Coriander powder 50g\n"+
    				"Coconut milk 10ml\n"+
    				"Turmeric a pinch\n"+
    				"Lime juice 10ml\n"+
    				"Coccum 4\n"+
    				"Oil 100ml\n"+
    				"Pepper powder 5g\n"+
    				"Salt to taste \n"+
    				"Banana leaves 4\n"
    				,
    				"Chicken (broiler) 1\n"+
    				"Red chillies 10 \n"+
    				"Pepper corns 5-6 \n"+
    				"Cinnamon, Cloves, Fennel & Cardamom 3 g\n"+
    				"Garlic 1 pod\n"+
    				"Ginger 2.5 cm piece\n"+
    				"Salt to taste\n"+
    				"Vinegar 1 tsp\n"+
    				"Onion 200 g\n"+
    				"Tomato 2 medium size\n"+
    				"Curry leaves 1 sprig \n"
    				,
    				"Kozhuva 200gms\n"+
    				"Ginger/garlic paste 5gms\n"+
    				"Lime juice 1 nos\n"+
    				"Salt to taste\n"+
    				"Chilly powder 1 table spoon\n"+
    				"Whole black pepper 10 nos\n"+
    				"Turmeric powder 1 tea spoon\n"+
    				"Rice flour 0.5 tea spoon\n"+
    				"Curry leaves few\n"+
    				"Oil to fry the fish\n"+
    				"Salad to serve with the fish\n"
    				,
    				"Tapioca 500g\n"+
    				"Lamb 800g\n"+
    				"Tomato 200g\n"+
    				"Onion 200g\n"+
    				"Green Chilli 25g\n"+
    				"Coriander powder 6tbsp\n"+
    				"Chilli powder 2tsp\n"+
    				"Back pepper powder 2tbsp\n"+
    				"Turmeric powder 2tbsp\n"+
    				"Ginger 25g\n"+
    				"Garlic 15g\n"+
    				"Cinnamon 4 pieces\n"+
    				"Cloves 8\n"+
    				"Cardamom 4\n"+
    				"Curry leaves 4 bunches\n"+
    				"Salt to taste\n"+
    				"Coconut oil 50g\n"
    				,
    				"Sweet Potato 500 g\n"+
    				"Green Chilly 5 no.\n"+
    				"Onion 1 no.\n"+
    				"Mustard seed 10 g\n"+
    				"Red Chilly(dry) 3 no\n"+
    				"Curry leaves 1 pinch\n"+
    				"Coconut oil 25 ml\n"+
    				"Salt to taste\n"
    				,
    				"Basmathi rice 1 kg\n"+
    				"Chicken 1\n"+
    				"Biriyani Masala Paste 4tbsp\n"+
    				"(green chilly, cinnamon, \n"+
    				"cloves, fennel, cardamom, \n"+
    				"peppercorn) 4tbsp\n"+
    				"Green chilly 10 \n"+
    				"Ginger garlic paste 2 tbsp\n"+
    				"Coriander leaves 50 g\n"+
    				"Mint leaves 25 g\n"+
    				"Curd 150 ml\n"+
    				"Tomato 150 g\n"+
    				"Onion 1 kg\n"+
    				"Black cumin seeds 1 tsp\n"+
    				"Cinnamon stick 2 pieces\n"+
    				"Bay leaves 2 \n"+
    				"Cashew nuts kismis 50 g\n"+
    				"Cardamom 5 \n"+
    				"Ghee 200 g\n"+
    				"Coriander powder 2 tbsp\n"+
    				"Milk 500 ml\n"+
    				"Saffron 1 pinch\n"+
    				"Water (For rice) 1 litre\n"
    				,
    				"Duck 1 breast\n"+
    				"Shallots 100gms\n"+
    				"Ginger and garlic 10 gms each\n"+
    				"Kashmeeri chilly powder 1 teaspoon\n"+
    				"Turmeric powder 0.5 teaspoon\n"+
    				"Coriander powder 1 teaspoon\n"+
    				"Garam masala 1 pinch\n"+
    				"Cashew nut 2 halves\n"+
    				"Raisins 6 nos\n"+
    				"Coconut milk 50ml\n"+
    				"Coconut oil a dash\n"+
    				"Curry leaves 1 stem\n"+
    				"Cherry tomatoes 3 nos\n"+
    				"Salt to taste\n"
    				,
    				"Lamb 1 kg\n"+
    				"Coriander 250 gms\n"+
    				"Powder 50 gms\n"+
    				"Chille Powder 200 g\n"+
    				"Curry Masala 25 gms\n"+
    				"Turmeric 100 g\n"+
    				"Powder 200 g\n"+
    				"Green Chille 600 g\n"+
    				"Coconut Oil 300 g\n"+
    				"Onion 100 g\n"+
    				"Tomato \n"+
    				"Ginger Garlic Paste\n"
    				,
    				"Mutton 1 kg \n"+
    				"Basmathi rice 1 kg\n"+
    				"Onion 500 g \n"+
    				"Garlic 50 g \n"+
    				"Ginger 50 g \n"+
    				"Green chilli 100 g \n"+
    				"Coriander powder 3 tsp \n"+
    				"Turmeric powder 1 tsp \n"+
    				"Red chilli powder half tsp \n"+
    				"Tomato 300 g \n"+
    				"Poppy seeds 2 tsp\n"+
    				"Fresh coconut half cup\n"+
    				"Coriander leaves 1 small bunch\n"+
    				"Mint leaves 1 small bunch \n"+
    				"Curd as required\n"+
    				"Limejuice 4 tbsp\n"+
    				"Ghee 200 g\n"+
    				"Oil as required \n"+
    				"Cashew nuts 500 g \n"+
    				"Raisins 50 g\n"+
    				"Garam masala powder 2 tsp \n"+
    				"Salt to taste\n"+
    				"For garam masala\n"+
    				"Cinnamon 2 pieces \n"+
    				"Cardamom 3-4 \n"+
    				"Cloves 3-4 \n"+
    				"Nutmeg quarter \n"+
    				"Aniseed half tsp\n"+
    				"Cumin seed half tsp\n"+
    				"Mace 2 strands\n"
    				,
    				"Prawn shells 1 Kg\n"+
    				"Water 1.5 Lit\n"+
    				"Green chillies 25 g\n"+
    				"Garlic 20 g\n"+
    				"Curry leaves 15 g\n"+
    				"Black pepper powder 0.5 tsp\n"+
    				"Garam masala powder 0.5 tsp\n"+
    				"Turmeric powder 10 g\n"+
    				"Chopped fresh mint Limejuice 2 tsp\n"+
    				"Boiled shrimps 75 g\n"+
    				"Coconut milk 250 ml\n"+
    				"Salt To taste\n"+
    				"Onion 50 g\n"
    				,
    				"Fish 250 gm\n"+
    				"Onion 100 gm\n"+
    				"Tomato 100 gm\n"+
    				"Chilly Powder 30 gm\n"+
    				"Coriander powder 20 gm\n"+
    				"Turmeric powder 1 tsp\n"+
    				"Mustard seeds a pinch\n"+
    				"Ginger garlic paste 1 tsp\n"+
    				"Green chilly 3 nos\n"+
    				"Curry leaves 1 spring\n"+
    				"Coconut oil 50 ml\n"+
    				"Salt to taste\n"+
    				"Coconut milk 0.5 coconut\n"+
    				"Tamarind pulp to taste\n"
    				,
    				"Sear fish darned (Sliced on the bone) 1\n"+
    				"Crushed pepper corn 5 g\n"+
    				"Ginger 3 g\n"+
    				"Garlic 3 g\n"+
    				"Green Chilli 3 g\n"+
    				"Chilli powder 2 g\n"+
    				"Turmeric powder 2 g\n"+
    				"Curry leaves 1 sprig\n"+
    				"Lime 1\n"+
    				"Coconut oil 50 ml\n"+
    				"Egg 0.5\n"+
    				"Salt To taste\n"+
    				"Onion 1\n"+
    				"Salad cucumber 50 g\n"+
    				"Carrot 50 g\n"+
    				"Tomato 1\n"
    				,
    				"Jumbo prawns 6 pcs\n"+
    				"Small onions 100 g \n"+
    				"Green chillies 3 nos\n"+
    				"Chilly powder 1 tsp\n"+
    				"Coriander powder 0.5 tsp \n"+
    				"Curry leaves One pinch\n"+
    				"Ginger vallience One pinch\n"+
    				"Coconut oil 2 tsp\n"+
    				"Coconut milk 2 tsp\n"+
    				"Salt to taste\n"
    				,
    				"Pork (thin slices) 250 g\n"+
    				"Chilli Powder 2 tsp\n"+
    				"Turmeric powder 1pinch\n"+
    				"Lime (juice oil) 0.5 \n"+
    				"Salt taste to taste\n"+
    				"Garam masala 1 0.5 tsp\n"+
    				"Ginger, garlic paste 25 g\n"+
    				"Curry leaves 2 sprigs\n"+
    				"Coconut oil 20 ml\n"
    				,
    				"Small Sardines 500 g\n"+
    				"Green Pepper Corns 60 g\n"+
    				"Green Chillies 3 - 4 nos.\n"+
    				"Ginger Chopped 30 g\n"+
    				"Garlic Chopped 30 g\n"+
    				"Curry Leaves 2 sprigs\n"+
    				"Sambar Onions 100 g\n"+
    				"Mustard 5 g\n"+
    				"Cocum 2 - 3 pods\n"+
    				"Salt to taste\n"+
    				"Coconut Oil 30 ml\n"
    				,
    				"Fish 500 g\n"+
    				"Drum stick 150 g\n"+
    				"Coriander seeds 100 g\n"+
    				"Red chillies 8 g\n"+
    				"Turmeric 2 g\n"+
    				"Pepper corns 4 g\n"+
    				"Fennel seeds 2 g\n"+
    				"Coconut oil 50 ml\n"+
    				"Coconut 1\n"+
    				"Red onion 300 g\n"+
    				"Cocum 15 g\n"+
    				"Salt to taste\n"+
    				"Tomato 80 g\n"+
    				"Ginger garlic paste 10 g\n"+
    				"Mustard seeds 3 g\n"+
    				"Curry leaves 2 sprigs\n"
    				,
    				"Rice flour (finely ground) 1 cup\n"+
    				"Water 1 cup\n"+
    				"Shallots (Butter Onions 4 nos \n"+
    				"Fish 0.5 kg\n"+
    				"Chopped onions 0.5 kg\n"+
    				"Chopped green chillies 3\n"+
    				"Ginger A one-inch piece\n"+
    				"Curry leaves As required\n"+
    				"Coriander powder 2 tsp\n"+
    				"Chilli powder 1 tbsp\n"+
    				"Turmeric powder 1 tbsp\n"+
    				"Cloves 3 nos\n"+
    				"Coconut oil 2 tbsp\n"+
    				"Salt to taste\n"
    				,
    				"Chicken ? kg\n"+
    				"Potatoes 2 no.s\n"+
    				"Onion 2 no.s\n"+
    				"Coriander seeds 2 tbsp\n"+
    				"Red chillies 10 no.s\n"+
    				"Pepper 1 tsp\n"+
    				"Grated coconut 2 full cups\n"+
    				"Small onions 6 to 8 no.s\n"+
    				"Coconut oil 2 tbsp\n"+
    				"Salt to taste\n"+
    				"Green chillies/Ginger cut lengthwise\n"+
    				"Small onions and curry leaves for tempering\n"
    				,
    				"Small variety of fish 0.5 kg\n"+
    				"Coconut 1\n"+
    				"Green Chillies 30 g\n"+
    				"Small red onions / shallots 10 g\n"+
    				"Turmeric 1/4 tbsp\n"+
    				"Ginger 0.5 inch\n"+
    				"Cocum 15-20 g\n"+
    				"Curry leaves 1 sprig\n"+
    				"Coconut oil 15 ml\n"
    				,
    				"Pomfret 1no\n"+
    				"Small onion 50g\n"+
    				"Red chilly 25g\n"+
    				"Lemon Juice from 3nos of lime \n"+
    				"Tomato 50g\n"+
    				"Salt to taste \n"+
    				"Ginger Garlic Paste 10g\n"+
    				"Curry Leaves 05g\n"+
    				"Banana Leaf 1no\n"
    				,
    				"Red tomatoes 250 g\n"+
    				"Ginger 10 g\n"+
    				"Garlic 5 g\n"+
    				"Refined flour 15 g\n"+
    				"Onion 100 g\n"+
    				"Pepper corns 5 g\n"+
    				"Coconut mix 0.5 cup\n"+
    				"Salt to taste\n"+
    				"Cream 20 ml\n"+
    				"Vegetable stock 750 ml\n"+
    				"Butter 50 g\n"+
    				"Coriander leaves 1 bunch \n"
    				,
    				"Long slices of tender string beans 2 cup\n"+
    				"Coconut oil 0.5 cup\n"+
    				"Chilli powder 1 tsp\n"+
    				"Salt To taste\n"+
    				"Pepper powder To taste\n"+
    				"Curry leaves One sprig\n"
    				,
    				"Mutton 250 gm\n"+
    				"Onion 200 gm (for frying and masala)\n"+
    				"Ginger garlic 35 gm\n"+
    				"Garam masala powder 5 gm\n"+
    				"Whole garam masala 10 gm\n"+
    				"Chilly powder 1 tsp\n"+
    				"Coriander powder 1 tsp\n"+
    				"Turmeric powder 0.5 tsp\n"+
    				"Green chilly 4 nos.\n"+
    				"Coriander leaves & Mint leaves 30 gm\n"+
    				"Pineapple 15 gm\n"+
    				"Ghee 50 gm\n"+
    				"Oil 200 gm\n"+
    				"Rose water 0.5 tsp\n"+
    				"Saffron a pinch\n"+
    				"Cashew nut paste 50 gm\n"+
    				"Tomatoes 75 gm\n"+
    				"Salt and cashew nuts for garnishing\n"+
    				"Basmati rice 250 gm (wash and soak for 15 mints)\n"+
    				"Lime 1\n"
    				,
    				"Mutton (boneless) 300 gm\n"+
    				"Coconut Kernal 75 gm\n"+
    				"Coriander powder 10 gm\n"+
    				"Turmeric powder 5 g\n"+
    				"Red chilli powder 15 g\n"+
    				"Cinnamon 5 g\n"+
    				"Cloves 5 g\n"+
    				"Mustard seeds (whole) 2 g\n"+
    				"Pepper corn (whole) 5 g\n"+
    				"Onion 150 g\n"+
    				"Garlic 10 gm\n"+
    				"Ginger 10 gm\n"+
    				"Curry leaves few springs\n"+
    				"Coriander leaves (Chopped) For Garnish\n"+
    				"Coconut oil \n"+
    				"100 ml\n"+
    				"Salt to taste\n"+
    				"Garam masala powder 5 gm\n"
    				,
    				"Minced mutton 150 gm\n"+
    				"Garam masala powder one pinch\n"+
    				"Chilli powder one pinch\n"+
    				"Turmeric powder one pinch\n"+
    				"Cumin powder one pinch\n"+
    				"Coconut paste (fried) 50 g\n"+
    				"Coriander powder 1 tsp\n"+
    				"Tomato 2 nos\n"+
    				"Onion 250 gm\n"+
    				"Ginger garlic paste 2 tsp\n"+
    				"Coconut grated 250gm\n"+
    				"Sonf 1 tsp\n"+
    				"Mustard seed one pinch\n"+
    				"Coriander leaves (Chopped) to taste\n"+
    				"Curry leaf\n"+
    				"1 leaf\n"+
    				"Dry red chilli 2 nos\n"+
    				"Coconut oil one tsp\n"
    				,
    				"Chicken 1 kg\n"+
    				"Onion 400 g\n"+
    				"Green Chilli 20 g\n"+
    				"Ginger 20 g\n"+
    				"Chilli powder 2 sp\n"+
    				"Coriander powder 3 sp\n"+
    				"Chicken masala powder 2 sp\n"+
    				"Curry leaves 2 g\n"+
    				"Coconut oil 150 ml\n"+
    				"Coconut milk 1.5 ltr\n"+
    				"Salt to taste\n"+
    				"Turmeric Powder 1 pinch\n"
    				,
    				"Onion 2\n"+
    				"Green chilli 4\n"+
    				"Fenugreek a little\n"+
    				"Ginger (Julienne) 25 g\n"+
    				"Garlic 25 g\n"+
    				"Curry leaf a little\n"+
    				"Coconut oil 100 g \n"+
    				"Capsicum 1\n"+
    				"Salt to taste\n"+
    				"Lemon 4\n"+
    				"Coconut milk 0.5 litre\n"+
    				"Turmeric powder 1 tsp\n"+
    				"Sear fish 1 kg\n"+
    				"Rice flour a little\n"
    				,
    				"Fish 100 g\n"+
    				"Fish bones 50 g\n"+
    				"Tomato 2\n"+
    				"Green chilli 20 g\n"+
    				"Curry Leaves 1 sprig\n"+
    				"Coconut oil 20 ml\n"+
    				"Fennel 10 g\n"+
    				"Garlic 20 g\n"+
    				"Onion 30 g\n"+
    				"Coriander leaves 15 g\n"+
    				"Ginger 10 g\n"+
    				"Lemon 2\n"
    				,
    				"Naimeen 250 gms\n"+
    				"Oil 4 tsp\n"+
    				"Fenugreek 2 pinches\n"+
    				"Onion 2 tsp (long slices)\n"+
    				"Ginger 0.5 tsp (long slices)\n"+
    				"Chilli powder 2 tsp\n"+
    				"Water 3/4 cup (also a little for soaking tamarind)\n"+
    				"Tamarind (Kudampuli) 3 or 4 pieces\n"+
    				"Garlic 1 tsp\n"
    				,
    				"Naimeen 250 gms\n"+
    				"Oil 4 tsp\n"+
    				"Fenugreek 2 pinches\n"+
    				"Onion 2 tsp (long slices)\n"+
    				"Ginger 0.5 tsp (long slices)\n"+
    				"Chilli powder 2 tsp\n"+
    				"Water 3/4 cup (also a little for soaking tamarind)\n"+
    				"Tamarind (Kudampuli) 3 or 4 pieces\n"+
    				"Garlic 1 tsp\n"
    				,
    				"Instant ada 250g\n"+
    				"Water 6 cups\n"+
    				"Butter 1 0.5 dsp\n"+
    				"Milk 300ml\n"+
    				"Condensed milk 500ml\n"+
    				"Sugar 1.5 cup\n"+
    				"Fine rice flour 1 dsp\n"+
    				"Cashew nuts 0.5 cup\n"+
    				"Cardamom powder 0.5 tsp\n"
    				,
    				"Pappadam 15\n"+
    				"Coconut (grated) 1 cup\n"+
    				"Green chillies 4\n"+
    				"Red chillies 2\n"+
    				"Small onions \n"+
    				"(finely chopped for seasoning)\n"+
    				"4\n"+
    				"Coconut oil ¼ cup\n"+
    				"Mustard seeds ½ tsp\n"+
    				"Curry leaves few\n"+
    				"Salt to taste\n"
    				,
    				"Rice Flour (Roasted) 500 g\n"+
    				"Water 450-500 ml\n"+
    				"Salt to taste\n"
    				,
    				"Ripe bananas 2\n"+
    				"Powdered cardamom 2 pods\n"+
    				"Sugar 2 tablespoons\n"+
    				"Flour 2 tablespoons\n"+
    				"Eggs 2\n"+
    				"Raisins 1 tablespoon\n"+
    				"Cashew nuts (chopped) 2 tablespoons\n"+
    				"Water For mixing\n"+
    				"Oil For frying\n"+
    				"Salt To taste\n"
    				,
    				"Banana 4\n"+
    				"Refined flour 100 g\n"+
    				"Yellow colour 4 drops\n"+
    				"Cumin seed 1 pinch\n"+
    				"Sugar 100 g\n"+
    				"Refined oil 1.5 ltr\n"
    				,
    				"Pork 500 g\n"+
    				"Raw banana 200 g\n"+
    				"Onion 100 g\n"+
    				"Ginger 40 g\n"+
    				"Garlic 30 g\n"+
    				"Green chilli 20 g\n"+
    				"Coconut oil 40 ml\n"+
    				"Garam Masala 30 g\n"+
    				"Chilli Powder 25 g\n"+
    				"Coriander Powder 25 g\n"+
    				"Turmeric Powder 20 g\n"+
    				"Lime 1\n"+
    				"Curry Leaves 1 sprig\n"
    				,
    				"Rice 100 gm\n"+
    				"Sugar 1 tsp\n"+
    				"Coconut water (Fermented) 1 cup\n"+
    				"Coconut milk 1 table spoon\n"+
    				"Rice powder (Medium) 1 table spoon\n"+
    				"Salt 1 pinch\n"+
    				"Prawns 3 nos\n"+
    				"Onion 1\n"+
    				"Tomato 1\n"+
    				"Ginger garlic paste 1 tsp\n"+
    				"Curry powder 1 tsp\n"+
    				"Coconut oil 1 table spoon\n"+
    				"Curry leaf 1 sprig\n"
    				,
    				"Shelled de-veined tail-on prawns 40g\n"+
    				"Green chilli juliennes 2\n"+
    				"Garlic juliennes 4 flakes\n"+
    				"Ginger juliennes 0.5 tbsp\n"+
    				"Curry leaves 2 sprigs\n"+
    				"Onion (sliced) 2 cup\n"+
    				"Chilli powder 2 tbsp\n"+
    				"Turmreic powder 1 tbsp\n"+
    				"Coriander powder 1 tbsp\n"+
    				"Lime 1\n"+
    				"Salt to taste \n"+
    				"Coconut Oil 4 tbsp\n"+
    				"Split green chillies 4\n"+
    				"Ginger juliennes 0.5 tbsp\n"+
    				"Curry leaves 2 sprigs\n"+
    				"Tomato (sliced) 1\n"+
    				"Garam masala 0.5 a pinch\n"
    				,
    				"Jumbo prawns with shell 200 g\n"+
    				"Onion (sliced) 50 g\n"+
    				"Ginger garlic paste \n"+
    				"10 g\n"+
    				"Curry leaves 1 sp\n"+
    				"Lime 1 no\n"+
    				"Salt and pepper to taste\n"+
    				"Boiled rice 100 g\n"+
    				"Boiled vegetables 100 g\n"
    				,
    				"Coarse rice flour 1 cup\n"+
    				"Grated coconut 0.5 cup\n"+
    				"Water As required\n"+
    				"Salt To taste\n"
    				,
    				"Black Bengal gram 1 kg\n"+
    				"Coconut oil 100 ml\n"+
    				"Grated coconut 3\n"+
    				"Garlic 10 g\n"+
    				"Shallots 150 g\n"+
    				"Mustard seeds 10 g\n"+
    				"Red chilli 50 g\n"+
    				"Sliced onion 500 g\n"+
    				"Whole Coriander 50 g\n"+
    				"Turmeric powder 1 tsp\n"+
    				"Red chilli powder 0.5 tsp\n"+
    				"Curry leaves 2 sprigs\n"+
    				"Garam masala powder 2 tsp\n"+
    				"Salt to taste\n"
    				,
    				"Tuna 1 piece (75 gms)\n"+
    				"For marinating\n"+
    				"Turmeric a pinch\n"+
    				"Lime 1 no\n"+
    				"Coconut oil 1 tea spoon\n"+
    				"Mustard paste a little\n"+
    				"Salt to taste \n"+
    				"For marinating, use curd, chilly paste, salt and pepper\n"+
    				"Whole Pomfret 1 no\n"+
    				"For marinating\n"+
    				"Chilly powder a pinch\n"+
    				"Coriander powder a pinch\n"+
    				"Turmeric powder a pinch\n"+
    				"Lime 1 no\n"+
    				"Ginger-Garlic paste \n"+
    				"Curry leaves \n"+
    				"Salt \n"+
    				"Coconut oil\n"+
    				"Green spinach thoran\n"+
    				"Ingredients Quantity\n"+
    				"Green spinach 250 gms\n"+
    				"Shallots 2 nos\n"+
    				"Ginger 1 piece\n"+
    				"Garlic 3 cloves\n"+
    				"Turmeric powder a pinch\n"+
    				"Grated coconut 100 gms\n"+
    				"Coconut oil \n"+
    				"Mustard seeds\n"+
    				"Shallots 100 gms\n"+
    				"Ginger 50 gms\n"+
    				"Garlic 2 cloves\n"+
    				"Coconut flakes 25 gms\n"+
    				"Green chilly 2 nos\n"+
    				"Cocum 1 piece\n"+
    				"Turmeric powder a pinch\n"+
    				"Coconut milk 250 ml\n"+
    				"Coconut oil \n"+
    				"Curry leaves \n"
    				,
    				"Potatoes [peeled, washed and cut into cubes] 150gms\n"+
    				"Ginger [cut into strips] 1 tablespoon\n"+
    				"Shallots [sliced] 30gm\n"+
    				"Curry leaves a few\n"+
    				"Oil\n"+
    				"to shallow fry\n"+
    				"For the marinade \n"+
    				"Ingredients Quantity\n"+
    				"Shallots 30gms\n"+
    				"Chilly powder 1 teaspoon\n"+
    				"Ginger garlic paste 1 teaspoon\n"+
    				"Salt to taste\n"+
    				"Turmeric little\n"+
    				"Lime juice of one lemon\n"
    				,
    				"Squid 150 gms\n"+
    				"Chilly Powder 10 gms\n"+
    				"Turmeric Powder 2 gms\n"+
    				"Pepper Powder 5 gms\n"+
    				"Coconut Oil 35 ml\n"+
    				"Salt To taste\n"+
    				"Curry leaves 2 gms\n"+
    				"Ginger 10 gms\n"+
    				"Garlic 7 gms\n"+
    				"Onion 100 gms\n"+
    				"Tomato 50 gms\n"+
    				"Green Chilly 10 gms\n"+
    				"Coriander Powder 20 gms\n"
    				,
    				"Cleaned prawns* 4 cups\n"+
    				"Onions (chopped) 2\n"+
    				"Coconut (desiccated) 4 tbsp\n"+
    				"Green chillies (chopped) 2\n"+
    				"Ginger (grated) 1 tsp\n"+
    				"Garlic (minced) 1 tsp\n"+
    				"Cardamom powder 0.5 tsp\n"+
    				"Coriander powder 1 tsp\n"+
    				"Chilli powder 1 tsp\n"+
    				"Cumin powder 1 tsp\n"+
    				"Sugar 2 tsp\n"+
    				"Vegetables (cut and cleaned)** 6 cups\n"+
    				"Garam masala powder 0.5 tsp\n"+
    				"Salt 1 tsp\n"+
    				"Chopped coriander, to garnish 2 tsp\n"+
    				"Turmeric powder 0.5 tsp\n"+
    				"Lime juice 1 tsp\n"+
    				"Salt 0.5 tsp\n"+
    				"Oil 2 tbsp\n"
    				,
    				"Full Chicken (For Batter) 1 1/4 Kg \n"+
    				"Red Chilly powder 50g \n"+
    				"Coriander powder 25 gm \n"+
    				"Turmeric powder 25 gm \n"+
    				"Ginger Garlic paste 4 tsp \n"+
    				"Curd 200 ml\n"+
    				"Garam Masala 1 tsp\n"+
    				"Curry leaves 1 spring\n"+
    				"Egg (For frying) 1 no\n"+
    				"Oil 3 Kg\n"+
    				"Chicken Liver (Chopped) 1 no\n"+
    				"Boiled egg 1 no\n"+
    				"Mashed boiled potato 100 gm\n"+
    				"Red chilly powder 1 0.5 tsp\n"+
    				"Coriander powder 0.5 tsp\n"+
    				"Turmeric powder 1/4 tsp\n"+
    				"Garam masala 1/4 tsp\n"+
    				"Curd 50 ml\n"+
    				"Salt as needed\n"+
    				"Curry leaves 0.5 spring\n"+
    				"Ginger Garlic paste 1 tsp\n"+
    				"Green chilly 1 no\n"+
    				"Onion 1 no\n"+
    				"Coconut oil 25 ml\n"
    				,
    				"Seer Fish (Small pieces) 50g\n"+
    				"Kallummekaya meat 50 g\n"+
    				"Crab meet 50 g\n"+
    				"Shrimps (boiled and chopped) 50 g\n"+
    				"Squid rings 50 g\n"+
    				"Onion (chopped) 50 g\n"+
    				"Curry leaves (finely chopped) 1 sprig\n"+
    				"Mushroom (chopped) 20 g\n"+
    				"Chopped garlic 10 g\n"+
    				"Lime 2\n"+
    				"Salt to taste\n"+
    				"Pepper Powder to taste\n"+
    				"Maida 30 g\n"+
    				"Coconut oil 30 ml\n"+
    				"Coconut milk 100 ml\n"
    				,
    				"Tender coconut 1 no \n"+
    				"Sugar 80 gms\n"+
    				"Milk 300 ml \n"+
    				"Gelatine 10 gms \n"+
    				"Egg – white 2 nos \n"+
    				"Coconut extract 25 ml \n"+
    				"Rose essence 2 drops \n"+
    				"Milk cream 10 ml \n"+
    				"Corn flour 10 gms \n"
    				,
    				"Chicken 01 Kg\n"+
    				"Coconuts 02 Kg. \n"+
    				"Shallots 250 gms.\n"+
    				"Green Chilli 100 gms.\n"+
    				"Garlic 50 gms.\n"+
    				"Ginger 50 gms.\n"+
    				"Curry leaves 25 gms.\n"+
    				"Red chillies 15 gms.\n"+
    				"Mustard seeds 05 gms.\n"+
    				"Fennel seeds 150 gms.\n"+
    				"Coconut oil 50 ml.\n"
    				,
    				"Rice Flour 0.5 kg\n"+
    				"Yeast 10 gms\n"+
    				"Sugar 100 gms\n"+
    				"Coconut milk 100 ml (first extract milk)\n"
    				,
    				"Mutton Kheema 500 gms\n"+
    				"Potato 200 gms\n"+
    				"Coconut 1 nos\n"+
    				"Ginger 15 gms\n"+
    				"Green Chilly 15 gms\n"+
    				"Onion 50 gms\n"+
    				"Tomato 30 gms\n"+
    				"Curry leaves 1 sprig\n"+
    				"Coriander leaves 20 gms\n"+
    				"Garam Masala 20 gms\n"+
    				"Coriander powder 15 gms\n"+
    				"Chilly powder 15 gms\n"+
    				"Turmeric powder 10 gms\n"+
    				"Salt to taste\n"
    				,
    				"Chicken 800 gms\n"+
    				"Chilly powder 50 gms\n"+
    				"Gram flour 100 gms\n"+
    				"Lemon 1\n"+
    				"Vinegar 50 ml\n"+
    				"Ginger garlic paste 15 gms\n"+
    				"Oil for frying\n"+
    				"Salt to taste\n"+
    				"Curry leaves 5 gms\n"
    				,
    				"Small onions (shallots) 100 g\n"+
    				"Coconut (grated) 100 g\n"+
    				"Coconut oil 50 ml\n"+
    				"Fenugreek seeds 5 g\n"+
    				"Mustard seeds 5 g\n"+
    				"Curry leaves few sprigs\n"+
    				"Red chilli (whole) 5 g\n"+
    				"Tamarind 10 g\n"+
    				"Jagery 5 g\n"+
    				"Salt to taste\n"+
    				"Aniseeds 5 g\n"+
    				"Pepper corn (whole) 10 g\n"+
    				"Coriander seeds 10 g\n"+
    				"Garlic flakes 3\n"+
    				"Cumin seeds 5 g\n"
    				,
    				"Sun dried buffalo meat 100 gm\n"+
    				"Coconut slice 20 gm\n"+
    				"Ginger julienne 2 gm\n"+
    				"Garlic slices 2 nos\n"+
    				"Black pepper 1 pinch\n"+
    				"Kashmiri chilly powder 2 gm\n"+
    				"Garam masala powder 1 pinch\n"+
    				"Onion slice 0.5 no.\n"+
    				"Lime juice 0.5 no.\n"+
    				"Salt to taste\n"+
    				"Onion 2 gm\n"+
    				"Somph 2 gm\n"+
    				"Tempering \n"+
    				"Coconut oil 10 gm\n"+
    				"Mustard seed 2 gm\n"+
    				"Curry leaves 3 nos\n"+
    				"Dry chilly 2 nos. (cut into small pieces)\n"
    				,
    				"Eggs 4\n"+
    				"Milk 150 ml.\n"+
    				"Coconut milk (1st extract) 200 ml.\n"+
    				"Jaggery 200 g.\n"+
    				"Cardamom powder 1 tsp.\n"+
    				"Sugar 50 g\n"
    				,
    				"Carrots 150 g.\n"+
    				"Beans 100 g.\n"+
    				"Cauliflower 150 g.\n"+
    				"Potato 100 g.\n"+
    				"Green Peas 75 g.\n"+
    				"Raw Mango 1 no.\n"+
    				"Onions 75 g.\n"+
    				"Green Chilli 20 g.\n"+
    				"Ginger 10 g.\n"+
    				"Garlic 15 g.\n"+
    				"Curry leaves 10 g.\n"+
    				"Green Cardamom 3 g.\n"+
    				"Cinnamon a small stick\n"+
    				"Cloves 2 g.\n"+
    				"Red chilli powder 0.5 tsp.\n"+
    				"Turmeric powder 0.25 tsp.\n"+
    				"Coconut milk (I extract) 150 ml.\n"+
    				"Coconut milk (II extract) 100 ml.\n"+
    				"Mustard seeds 2 g.\n"+
    				"Coconut oil 15 ml.\n"

    };
    final String KeralaSpecialityInstructions[] = {
    		"Slice onion and green chillies and saute.\n"+
    				"Then add chilli powder, coriander powder, turmeric powder and pepper powder. \n"+
    				"Crush ginger, garlic and spices; add with onion mixture and stir. \n"+
    				"Add mutton cubes, enough water and salt to taste and cook properly.\n"+
    				"Cut tomatoes lengthwise and saute.\n"+
    				"Mix prepared meat with the sauteed tomato"
    				,
    				"Parboil the ada and drain the water thoroughly.\n"+
    				"Make syrup with jaggery, water and strain through a muslin cloth.\n"+
    				"Add the ada to the syrup and cook it well.\n"+
    				"Add the coconut milk , cardamom powder and just heat but do not boil.\n"+
    				"Finish with fried sultanas, cashew nuts and coconut"
    				,
    				"Make paste with coconut, chilly powder, turmeric powder and ? of a raw mango and tomato.Wash the fish and marinate with salt and with turmeric powder.Add little water in the coconut mixture and boil it along with the fish.Put remaining raw mango slices, salt and half of curry leaves.Cook for 15 min.Check the salt.Heat little coconut oil and put remaining curry leaves and temper it with the fish."
    				,
    				"Mix together rice, water, yeast and kappi. It should be in thick consistency. \n"+
    				"Let the above mixture ferment for one night (6 hour)\n"+
    				"Add the Sugar, Salt & Coconut milk to the fermented mixture and make a pouring consistency.\n"+
    				"The appam can be made in traditional Appachatti.\n"+
    				"To make the kappi, mix little rice flour and hot water. Allow to cook for some time in thick consistency."
    				,
    				"Heat oil in a pan.\n"+
    				"Saute together sliced onion, garlic, ginger, curry leaves, green chilli till get browned.\n"+
    				"Add all spice powder and little chopped tomatoes.\n"+
    				"Add the diced crab to the masala and cook it with some water.\n"+
    				"Finally finish with coconut milk and diced tomatoes can be added to make it attractive"
    				,
    				"Appam\n"+
    				"Heat the semolina in a little water to a thick consistency.\n"+
    				"Remove from the fire and keep it aside to cool. \n"+
    				"Make a batter with rice flour, coconut milk and water.Add the cooked semolina, soaked yeast and sugar and then mix well. \n"+
    				"Keep the mixture to ferment for three to four hours.\n"+
    				"Heat the appam thava (the special vessel for making appam), rub a little oil and pour some batter into it. \n"+
    				"Turn the batter around in the thava and make it into a round with thin edges and a thick middle. \n"+
    				"Cover with a lid and keep it over a slow fire. \n"+
    				"After the appam is ready, serve with mutton stew.\n"+
    				"Mutton Stew\n"+
    				"Clean, cut and wash the mutton.\n"+
    				"Slice the onion, chillies and tomatoes. Peel and cut potatoes into four. \n"+
    				"Grind the coriander seeds and poppy seeds separately to a fine paste. \n"+
    				"Grind the ginger and garlic together. Add the onions, chillies,tomatoes, masala and salt to the mutton and mix well. \n"+
    				"Heat the ghee and add spices. Add the mutton and fry for a while. \n"+
    				"Add just sufficient water to cook the mutton; cook till it becomes soft and water is absorbed. \n"+
    				"Grate the coconut and take out 2 cups of milk. \n"+
    				"Add the milk and chopped coriander leaves. \n"+
    				"Simmer and remove from the fire and serve hot"
    				,
    				"Scrub and wash the mussels clean.\n"+
    				"Wash and soak the rice in hot water for 20 mts. Drain and grind with the rest of the ingredients except the mussels and oil.\n"+
    				"Blanch mussels for 30 sec in acidulated, salted hot water. Set aside to drain.\n"+
    				"Stuff the paste in the mussels and steam for 7-8 mts.\n"+
    				"Remove stuffing along with the flesh, steep in the marinade and shallow fry till crisp.\n"+
    				"Place back in the shell and serve hot with the tamarind relish.\n"+
    				"Serve with Tamarind Relish.\n"+
    				"Cook tamarind pulp, jaggery, crisp fried chopped ginger, salt and chilli powder together for 15 mts. Add 2 tsp of hot oil and gently stir in. Strain and use."
    				,
    				"Cut carrot, beans, banana, yam and drumsticks into batons. \n"+
    				"Boil the vegetables with turmeric powder with just enough water.\n"+
    				"Make a paste of grated coconut, jeera, green chilli, into a smooth paste.\n"+
    				"Add this into the vegetables & cook for 5 minutes. Add salt.\n"+
    				"Heat coconut oil; add curry leaves for the tempering.\n"+
    				"Add beaten curd to the vegetable mixture after removing from fire & add the tempering.\n"+
    				"Serve hot."
    				,
    				"Grind all spices together into a fine paste. \n"+
    				"Marinate beef with the spice paste and keep aside. 3.Add ginger, garlic, shallots, curry leaves, coconut, vinegar and salt to the marinated meat and mix thoroughly. \n"+
    				"Cook meat on a slow fire till tender. \n"+
    				"Temper beef with coconut oil, mustard seed, curry leaves, shallots and crushed garlic. \n"+
    				"Serve hot."
    				,
    				"Shelled prawns, wash well. Heat oil in a pan, add mustard seeds. Add onion, garlic, ginger, curry leaves and saute for a while. Add prawns, stir, pour coconut milk, simmer. Add salt, limejuice. Serve hot."
    				,
    				"Heat oil in a saucepan or frying pan. Add the tempering ingredients; mustard seeds, fenugreek and curry leaves. To this add ginger julienne, green chilly and shallot and saute in slow fire for few minutes. Add cleaned prawns. Saute for about two minutes in slow fire. Add the thick coconut milk and allow to boil. Now add salt and quartered tomato. Pour the thick milk into this and leave to simmer for few minutes. Serve hot with plain rice."
    				,
    				"Clean, shell and de-vein the prawns\n"+
    				"Mix all the remaining ingredients, except oil, and apply it to the prawns.\n"+
    				"Keep aside for half an hour to marinate.\n"+
    				"Heat oil in a shallow pan and fry the prawns four at a time.\n"+
    				"Cook for three minutes, remove and drain.\n"+
    				"Serve hot, garnished with rings of onion and fried curry leaves."
    				,
    				"Wash chicken pieces and cook in half a cup of water adding salt and the ground spices till tender. Fry chopped onion and curry leaves in oil till golden brown. Add the cooked chicken and fry for few minutes.\n"+
    				" \n"+
    				"Another Method\n"+
    				"Boil the chicken pieces in salt and turmeric. Then fry onion and curry leaves and add the boiled chicken and then the masalas and fry for few minutes."
    				,
    				"Marinate the prawn in refined flour, corn flour, sugar, salt, monosodium glutamate & white pepper powder.\n"+
    				"Shallow fry for about 5 minutes. \n"+
    				"Stir fry the capsicum, onions, green chilli and chopped ginger & garlic. \n"+
    				"Add sugar, salt, monosodium glutamate and white pepper powder.\n"+
    				"Add fish stock, mix in the prawns and cook for about 3 minutes.\n"+
    				"Serve hot with hot garlic sauce."
    				,
    				"Powder soaked raw rice pertaining to puttu podi (with little grains). Roast it for a little while without causing any colour change.\n"+
    				"Add salt and cumin seed, pour a little water and rub it gently to make a mixture. \n"+
    				"Put a hole in the coconut shell (chiratta), place some grated coconut in it, and fill the shell with the mixture and put some grated coconut on the top also. \n"+
    				"Steam in a vessel for 10 minutes and serve hot."
    				,
    				"Soak the green gram in water for an hour. \n"+
    				"Boil it with little salt. \n"+
    				"Heat the kadai and temper Mustard seed, red chilli, curry leaves and small onion in coconut oil. \n"+
    				"Add green gram and grated coconut into it; mix it gently. \n"+
    				"Serve hot."
    				,
    				"Beef slices marinated in masala around 1 hour. Spread in a hot oven around 2 hours, stir, meat pieces become dry, serve hot."
    				,
    				"Heat oil in thick bottom sauce pan. Add oil, tempered, mustard, curry leaves, garlic shallot. Add tender mutton pieces. Add turmeric coconut slices and flavour. Saut? well. Pour rich mutton stock boil. Add salt. Pour thick coconut milk. Simmer. Add ghee and serve hot."
    				,
    				"Clean the dry fish and put it in cold water.\n"+
    				"Take a vessel and add coconut oil, mustard, curry leaves, green chilli slices, onion slices and make it brown.\n"+
    				"Add ginger garlic paste, chilli powder, turmeric powder and coriander powder.\n"+
    				"Add cleaned fish, tamarind and cook well."
    				,
    				"Clean and joint duck.  Grind together chilly powder, coriander powder, pepper and turmeric.  Slice onion.  Crate coconut and take three extraction of coconut milk.  Heat oil, add sliced onion and ground ingredients saute.  Add duck, fry for 5 minutes.  Add salt and third extract of coconut milk and vinegar and boil.  Simmer.  When the duck is nearly done add second extract of coconut milk.  Simmer for 5-10 minutes.  Add first extract.  Boil and remove from fire.  Heat ghee and add crushed cinnamon, cloves and mustard seeds.  When the seeds crackle, pour over the curry and mix well."
    				,
    				"Clean one full duck; mix all ingredients in the section.\n"+
    				"Boil the duck along with the above mentioned  ingredients. \n"+
    				"When 3/4th of boiling is done, remove the duck and deep fry it, till the duck becomes golden brown. \n"+
    				"Take out the thick stock and rub it all over the duck.\n"+
    				"Garnish with French fries and fried onion."
    				,
    				"Mix the minced garlic, ginger, green chillies, powdered cinnamon, cloves and fennel with minced meat. Add salt to taste and cook. Add a little limejuice and coriander leaves. After the \n"+
    				"prepared meat is cold, add beaten eggs and mix. Make meat in the shape of vada (ring-shaped) and deep fry in oil. Serve hot."
    				,
    				"Marinate the prawns in salad oil, pepper, salt, limejuice and ginger garlic paste. \n"+
    				"Dust in seasoned flour.\n"+
    				"Pierce the prawns with toothpicks from head to tail and dip in seasoned beaten egg, roll in breadcrumbs.\n"+
    				"Fry until golden brown in colour.\n"+
    				"Remove toothpicks and serve hot in bed of lettuce leaves with French fries, lime wedge and parsley sprigs"
    				,
    				"Marinate the tiger prawn with turmeric powder, mango puree, ginger garlic paste, salt and pepper. Keep aside.\n"+
    				"Clean the lemon grass, then grind it well .Apply this paste on the aubergine slices with salt and pepper.\n"+
    				"Slice the ginger very thin and marinate with turmeric powder, salt and pepper then deep fry it.\n"+
    				"Grill the tiger prawn and aubergine, place the tiger prawn on a bed of aubergine, and serve on an appam.\n"+
    				"Deep fry lady?s fingers filled with mango puree and place them on the side"
    				,
    				"Clean the prawns and de-vein. Don't remove the head and the tail. Remove the shell. Make a thin batter of the above ingredients except oil. After coating the prawns with the batter, deep fry in oil. Serve with chilly garlic sauce.\n"+
    				"Accompaniments\n"+
    				"French fries, Sauteed vegetables and lime wedge with a sprig of parsley"
    				,
    				"Mix all the ingredients in to a fine paste. Apply the mixture over the Karimeen (pearl spot) Shallow fry the fish. Serve hot"
    				,
    				"Grind the soaked raw rice to a smooth paste. The batter should be thick, but of pouring consistency.\n"+
    				"Dilute the yeast in 15 ml luke warm water and 10 g of sugar and mix to the ground batter.\n"+
    				"Mix in the sugar and salt to the batter and allow 6 to 8 hours to ferment.\n"+
    				"Mix in the grated coconut, garlic, curry leaves, small onion and check for salt and sugar. Keep aside for half an hour.\n"+
    				"Heat dosa pan, sprinkle oil, and pour one ladle full of batter and cook for one minute in slow fire.\n"+
    				"Turn the side and cook till golden brown colour.\n"+
    				"Sprinkling a few drops of ghee before serving will add to the taste and flavour"
    				,
    				"Heat the coconut oil in pan and temper Fennel and Curry leaves.\n"+
    				"Add ginger, green chilly, small onion, coconut slice and then make it brown.\n"+
    				"Then add chilly powder, turmeric powder and coriander powder after tomato slice. Saut? it well, till it becomes paste.\n"+
    				"Add mussels, add some salt to taste and then saute it well till it becomes dry"
    				,
    				"Kappa\n"+
    				"Clean tapioca and dice. \n"+
    				"Wash thoroughly and boil in water.\n"+
    				"Drain off excess water from cooked tapioca.\n"+
    				"Add salt, ground coconut, green chilly and turmeric.\n"+
    				"For tempering, heat, oil and crackle mustard seeds, brown small onion slices and curry leaves\n"+
    				"Put these over the stirred tapioca and serve hot.\n"+
    				"Meen Mulakittathu\n"+
    				"Clean the fish and cut into even-sized pieces. \n"+
    				"Marinate for a while. \n"+
    				"Slice ginger and garlic. \n"+
    				"Smear with red chilly powder, coriander powder, salt, kokum and curry leaves. \n"+
    				"Add water and cook for 5 to 10 minutes. \n"+
    				"Temper with given ingredients"
    				,
    				"Clean and cut the tapioca into small pieces.\n"+
    				"Cook the tapioca in water with some salt and turmeric powder.\n"+
    				"Heat the oil in a kadai and add mustard seeds and after the seed cracks, add curry leaf, green chilli, small onion and ginger garlic paste.\n"+
    				"Add all spices and meat to it and let it cook.\n"+
    				"After the meat is cooked, add the strained boiled tapioca to the masala and mix together.\n"+
    				"Finally finish with some garam masala and serve"
    				,
    				"Marinate the fish with half of ground masala and fry till half done. Heat coconut oil and add mustard. When it splutters add fenugreek and then curry leaves. Add shallots, ginger, garlic, green chillies and saut?. After some time add the ground paste. Let it brown and then add second extraction of coconut milk. Add the fish, vinegar and salt. Cover it partially and cook. When the fish is cooked, add the first extraction of coconut milk and boil it once and remove from fire"
    				,
    				"Clean fish. Make gashes all over. Mix all the herbs and spices. Add limejuice and smear all over the fish. Place the fish and a sprig of curry leaf on a banana leaf, cover and seal the sides. Grill both sides evenly in a hot tawa. Serve with a piece of lime, & mixed salad"
    				,
    				"Peel and cut the bananas into 1/2’ pieces. Wash in salted water and keep aside. \n"+
    				"Clean and cut lamb leg into 1’ square pieces. \n"+
    				"Mix the lamb and bananas with the chilly, coriander and turmeric and cook covered till mutton is  soft.\n"+
    				"Make a fine paste of grated coconut, sonf and garlic.\n"+
    				"Add this paste to the curry along with curry leaves and salt.\n"+
    				"Simmer till lamb is fully cooked and serve hot."
    				,
    				"Cut the fish into cubes. Heat oil and fry fenugreek, curry leaves, big chilly, onion. Saute and add ginger. Add the masala powders and saute well. Add the second extract of coconut milk, fish pieces and tomato. When the fish is cooked, add the tamarind pulp, salt and finish off with first extract of coconut."
    				,
    				"In a saucepan, heat coconut oil and half the ghee.\n"+
    				"Saute shallots, ginger, garlic and curry leaves till golden brown.\n"+
    				"Add the masalas, cook for one minute. Add the minced mutton and pour the stock.\n"+
    				"Mix in the mashed potato, check for seasonings.\n"+
    				"Serve in soup bowls, with two or three drops of ghee in each bowl."
    				,
    				"Clean the prawns with shell. Keep the shell separate after boiling it for some time. Separated prawns should clean properly.\n"+
    				"Mix with the second section of the ingredients. Boil it, till the water become thick gravy along with other ingredients. \n"+
    				"Remove the prawns and fry for some seconds in coconut oil. \n"+
    				"Dress the prawns with its shell. Garnish with French fries."
    				,
    				"Clean and wash the scampi. Cut the scampi along the middle at the back and devein. Do not remove shells or heads. Wash thoroughly and marinate in lime juice, crushed pepper, turmeric powder, ginger garlic paste and chilli powder for an hour.\n"+
    				"Heat the oil in a sauce pan and put mustard and curry leaves into it. Then add chopped onion, green chilli and saut? until light brown. Add ginger garlic paste, turmeric powder, chopped tomatoes and coccum. Saute till brown. Finish with coconut milk and salt to taste. \n"+
    				"Heat a tava and lightly glaze with oil. Cook the scampi with the shells on for around five minutes or until done. Now remove the scampi from the tava, add masala and put them back wrapped in banana leaves. Grill until the masala is burnt into the scampi. Serve hot. (Pollichathu means burnt. Hence, it is imperative that the meat has a slightly burnt flavour)"
    				,
    				"Clean and joint the chicken.\n"+
    				"Grind together all the spices with salt, curry leaves and vinegar.\n"+
    				"Slice onion and chop tomato roughly.\n"+
    				"Marinate the chicken with half of the ground spices. Keep aside for 15-20 minutes.\n"+
    				"Heat oil in a Kadai\n"+
    				"Saute sliced onion to light brown colour.\n"+
    				"Add remaining ground spices to the pan.\n"+
    				"Add chopped tomato, saute for a few minutes before adding the chicken.\n"+
    				"Cover and cook till chicken is tender.\n"+
    				"Check for seasoning. Remove from fire and serve with Indian bread"
    				,
    				"Clean and wash the fish. Squeeze out all the water. Grind chilly powder, whole back pepper, turmeric powder and rice flour to a fine paste. Add ginger garlic paste and salt to taste. Marinate the fish with the paste. Add lime juice. Keep it for 15 minutes. \n"+
    				"Heat the oil in a kadai and fry the fish on slow flame, till crisp. When the fish is almost done, add curry leaves into the oil. Fry it for a minute. Remove the fish and curry leaves from the oil. \n"+
    				"Serve hot with salads"
    				,
    				"Clean tapioca and cut it into small cubes; boil it with enough salt and water.\n"+
    				"Slice onion and green chilli, saut? with enough coconut oil.\n"+
    				"Add coriander powder, chilli powder, turmeric powder, black pepper powder and saute for two minutes.\n"+
    				"Crush ginger, garlic, cinnamon, cloves, cardamom and put all saut?ed masala crushed ingredients and lamb in a cooker with three cups of water and enough salt; cook till tender.\n"+
    				"Slice tomato and saute with little coconut oil. Finally add cooked lamb and cooked tapioca into the saut?ed tomato.\n"+
    				"Stir and serve hot"
    				,
    				"Grate the Sweet potato,put it in boiling water and strain it\n"+
    				"Heat coconut oil in a kadai, add mustard seed, dry Red chilly, Curry leaves, Onion and sauté for two minute.\n"+
    				"Then add Green chilly and potato; season with salt"
    				,
    				"Heat the ghee in a saucepan; saute the onions till golden brown colour and add sliced tomatoes saut? well. \n"+
    				"Put ginger garlic paste, curd and biriyani masala and turmeric powder, and coriander powder. \n"+
    				"Add the chicken pieces and cook well.\n"+
    				"Soak the rice about 10 minutes and drain well.\n"+
    				"Melt the ghee in a saucepan and add in the spices and sliced onion mint, coriander leaves, cashew nuts, kismis, bay leaves and saut? till brown in colour. \n"+
    				"Add milk and water. Allow to boil and then add rice. Lower the heat, cover and continue to cook for 15 minutes.\n"+
    				"Take another saucepan and place half the rice into it. And add the chicken on the top of the rice. And put the remaining rice on top of the chicken. And spread to make an even layer.\n"+
    				"Make random holes through the rice with a spoon and pour into each a little saffron milk. \n"+
    				"Place a few knobs of ghee, fried onion, cashew nuts and kismis on the surface and cover tightly."
    				,
    				"Clean the duck breast and marinate with ginger garlic paste and turmeric powder. Boil and keep aside.\n"+
    				"Take a thick bottomed pan, pour coconut oil, saut? the sliced onion and curry leaves. When they become golden brown, add ginger garlic paste, cashew nut, raisins and the ground masalas. Cook well to a thick texture.\n"+
    				"Add the boiled duck breast; saut? well. Finish with coconut milk and salt. Garnish with cherry tomatoes."
    				,
    				"Take the vessel add oil.\n"+
    				"Add Ginger Garlic Paste.\n"+
    				"Add Onion (slice), Curry leaves and cook till it becomes brown.\n"+
    				"Add Coriander Powder, Chille Powder, Curry Masala And Turmeric Powder.\n"+
    				"Make tomato paste and add lamb and cook well.\n"+
    				"Add salt and water (you can add coconut paste and cashew paste also)"
    				,
    				"Cut and clean mutton in big pieces.\n"+
    				"Slice the muttons; grind green chillies, ginger and garlic. \n"+
    				"Grind poppy seeds and fresh coconut and keep aside. \n"+
    				"Chop coriander leaves and mint leaves. \n"+
    				"Heat a pressure cooker and add oil and 3/4 of sliced onion and fry. \n"+
    				"Add ginger, garlic and green chillies and fry for 2-3 minutes \n"+
    				"Add the coriander powder, chilli powder, turmeric powder, garam masala and saute for some time and add the chopped tomatoes and fry for some time. \n"+
    				"Add mutton and fry for a few minutes and add curd and salt. \n"+
    				"Cover the cooker and cook on slow fire for 15-20 minutes. \n"+
    				"When mutton is cooked, add the ground poppy seeds and coconut and heat for few minutes and keep aside. \n"+
    				"Wash and drain the water from the rice. \n"+
    				"Heat ghee and add rice and fry for 4-5 minutes. \n"+
    				"Add salt and double quantity of water and boil till the rice is cooked. \n"+
    				"Remove from fire. \n"+
    				"Heat heavy-bottomed vessel and fry onions, cashew nuts and raisins and keep aside. \n"+
    				"Take a vessel and pour some rice and spread little coriander, mint leaves, limejuice, fried onions, cashew nuts and raisins. \n"+
    				"Put one layer of mutton over that and repeat the process till all rice and mutton are over.\n"+
    				"Cover with heavy lid and put dish in oven or place some coals on top for 10 minutes.\n"+
    				"Serve with curd and raita and papad"
    				,
    				"Peel onions and slice.\n"+
    				"Scrape ginger, peel garlic and wash green chillies. Crush them slightly with a pestle.\n"+
    				"Heat little coconut oil in a saucepan.\n"+
    				"Add onions, crushed ginger, green chillies, garlic, curry leaves and sauté till the onions are pink in colour.\n"+
    				"Add the prawn shells and sauté till shells start changing in colour.\n"+
    				"Add black pepper, garam masala and turmeric powders.\n"+
    				"Add water and bring to boil. Cook till the water content in the pan is almost reduced to half. \n"+
    				"Bring the mixture to simmer. Scum off the dirty forth collected on top.\n"+
    				"Now add the second extract of coconut milk along with the freshly chopped mint.\n"+
    				"Reduce the flame and add the first extract of coconut milk. \n"+
    				"Add the limejuice, salt and cooked shrimps.\n"+
    				"Serve hot, garnished with a boiled medium prawn hanging down from the soup bowl"
    				,
    				"Oil is for frying and chilly powder and turmeric powder for marination. Marinate the fish with salt, chilly powder, fry it and keep it aside. Heat the coconut oil. Put mustard seeds, fenugreek seeds. Put onion. Saute it with chilly powder, little coriander powder, turmeric powder, curry leaves and again saute after putting tamarind pulp (10 gm) and coconut milk. Add quartered tomatoes, cook for 3 minutes and mix with fish. Check the seasonings"
    				,
    				"After cutting the fish, immerse into water with salt and vinegar for half an hour.\n"+
    				"Prepare a thick masala with crushed peppercorn, ginger, garlic, green chillies, curry leaves, turmeric, chilli powder, limejuice, beaten egg, salt and a little coconut oil.\n"+
    				"Smear the batter all over the fish and keep it for half an hour and shallow fry in coconut oil.\n"+
    				"Serve hot in a bed of banana leaf decorated with carved vegetables and lemon wedge"
    				,
    				"Marinate the prawns with little chilly, coriander, turmeric powder and salt.\n"+
    				"Heat the coconut oil, fry the prawns and keep aside.\n"+
    				"In the rest of the oil, saute the ginger, green chilly, curry leaf and onions till golden brown colour. Add the rest of the masala and salt. Put the prawns and coconut milk and then cook and fry"
    				,
    				"Mix the pork with all the ingredients except coconut oil. Keep aside for half an hour.\n"+
    				"On a grill plate, sprinkle coconut oil and put the marinated pork and grill till well done.\n"+
    				"Arrange neatly on a platter or plate, garnish with turned carrots, broccoli etc."
    				,
    				"Clean, and wash the sardines. Apply a little salt and keep aside.\n"+
    				"Coarsely grind the onions, chillies, green pepper corns, garlic, ginger & curry leaves.\n"+
    				"Soak the cocum in lukewarm water and break into small pieces.\n"+
    				"Place the marinated fish with ground masala & cocum; and cover with water.\n"+
    				"Simmer uncovered on a slow flame till done and the sauce thickens.\n"+
    				"Add a tempering of mustard, garlic & curry leaves in coconut oil."
    				,
    				"Clean the fish.\n"+
    				"cut fish and drum stick into small pieces.\n"+
    				"Fry grated coconut, coriander seeds, red chilli, turmeric powder, fennel seeds and peppercorn.\n"+
    				"Grind the above mixture to smooth paste.\n"+
    				"Soak cocum in little water.\n"+
    				"Slice onions, slit green chillies.\n"+
    				"Heat oil, saut? mustard seeds, curry leaves, onion green chilli and drum stick.\n"+
    				"Add ginger garlic paste, powdered masala and saut? well.\n"+
    				"Add the ground masala, cocum, fish, water and cook on a slow fire.\n"+
    				"Add tomato pieces.\n"+
    				"Cook on a slow fire till the gravy becomes thick.\n"+
    				"Serve hot, garnished with fried curry leaves."
    				,
    				"Boil one glass of water with salt. \n"+
    				"Grind the onion and aniseed together. Add this to the water    and let the mixture boil. \n"+
    				"Sprinkle rice flour onto the boiling mixture.  Cover and cook till the water boils again. Stir occasionally.\n"+
    				"Pour this in a pan and knead well. \n"+
    				"Clean the fish. Mix chilli powder, turmeric powder and salt and apply the paste on the fish. \n"+
    				"Fry the fish in oil. \n"+
    				"To the oil remaining after frying, add big onions, ginger-garlic paste, chilli and salt and then saute it.\n"+
    				"Add curry leaves, fish fry and saute for a minute. Remove from stove. \n"+
    				"Make small balls out of the earlier prepared rice dough and then make small puris or pathiris from them. \n"+
    				"Put a tbsp of the fish filling on a pathiri and then cover it with another. Seal the sides. \n"+
    				"Make similar pathiris. Cover each pathiri in a plantain leaf and steam it in an idli cooker"
    				,
    				"Fry the coriander seeds, red chillies and pepper together and keep aside. \n"+
    				"Fry the grated coconut till it turns light brown and add small onions and curry leaves. \n"+
    				"Grind both these fried items separately. \n"+
    				"Mix the chicken, potato and onion with the coriander seeds, chilli and pepper mixture \n"+
    				"Add salt and pressure cook till the chicken becomes soft. \n"+
    				"Once the chicken is tender, add the coconut mixture and let it boil once. \n"+
    				"Temper it with small onions and curry leaves in coconut oil"
    				,
    				"Clean fish. Keep them whole if they are too small. If not cut them into half.\n"+
    				"Grate coconut finely.\n"+
    				"Grind together turmeric, a few onions and garlic and mix with coconut.\n"+
    				"Finely chop green chillies and ginger; add sliced onions.\n"+
    				"Soak cocum.\n"+
    				"In a stainless steel pan, first put in the curry leaves and half cocum broken into pieces.\n"+
    				"Mix together coconut mixture, fish, remaining cocum and chopped and sliced ingredients.\n"+
    				"Set into the pan.\n"+
    				"Add water to three fourth level of fish mixture.\n"+
    				"Add salt. Bring to boil. Quickly reduce heat and simmer till fish is cooked and moisture evaporated.\n"+
    				"Pour fresh coconut oil over.\n"+
    				"Test for seasoning and remove. Cool and cover. This can be kept for two days"
    				,
    				"Clean the Pomfret & marinate it with lemon juice, ginger garlic paste& salt \n"+
    				"Make a coarse paste of small onion, red chilly, tomatoes & curry leaves. \n"+
    				"Apply this masala on both sides of the fish & wrap it in a banana leaf.Grill it on the tawa till done & serve hot with onion rings & lemon wedges"
    				,
    				"Fillet the fish half an inch thick and marinate it with lime juice and  salt. Keep aside for 10 mts.\n"+
    				"Make a batter with egg, onion, ginger garlic paste and powdered masala.\n"+
    				"Apply it on the fish and then keep it on the plantain leaf for half an hour.\n"+
    				"Heat a thava or non-stick pan , brush a little oil and then spread the fish on to it. Simultaneously sprinkle some oil to get both sides of the fish cooked.\n"+
    				"Finally, arrange the fish, garnished with onion rings and lemon wedges, on the plaintain leaf"
    				,
    				"Heat oil. \n"+
    				"Saute curry leaves.\n"+
    				"Add string beans.\n"+
    				"Put chilli powder, salt and pepper. Close the pan with a lid.\n"+
    				"Stir gently with the handle of a ladle till it is cooked"
    				,
    				"Cut the mutton in to curry cut size. Wash it. Heat 150 gm oil and fry half of the sliced onion to golden brown. Remove oil from the pan and put half of the ghee to little oil in the pan. Put remaining sliced onion, saute. Put chopped ginger, garlic, chilly powder, coriander powder, turmeric powder, garam masala powder, chopped pineapple, chopped tomatoes and saute. Add cashew nut paste and fry it for few minutes. Put the salt, mutton and little fried onion. Cook till tender. Put double quantity of water for the rice (1/2 tsp) boil it along with whole garam masala, little ghee, lime and salt. Put the drained rice to the boiled water. Make it half cooked. Drain it. Take a heavy bottomed pot and spray the mutton masala in the bottom. Spray some fried onion and chopped coriander and mint leaves. Then spread the rice. Sprinkle rose water and saffron solution on the rice, put some fried onion and chopped coriander and mint leaves. Close tightly with a lid and keep the pot on a tawa or in the oven for another 20 min. Then open it, mix masala and rice, garnish with cashew nuts. Serve it along with raitha, pickle and pappad"
    				,
    				"Clean mutton and cut them into cubes\n"+
    				"Cook the mutton with ginger garlic paste and whole garam masala, till soft and tender.\n"+
    				"Slice the coconut kernel into small pieces and fry till golden brown (in coconut oil)\n"+
    				"Chop the onions and sauté in oil along with mustard seeds & curry leaves. Add chilli powder, turmeric powder and coriander powder and fry, till oil leaves the masala.\n"+
    				"Add the cooked mutton cubes to the sautéed masala and cook for about 10 minutes on slow fire.\n"+
    				"Add fried coconut slices and salt to taste.\n"+
    				"Garnish with chopped coriander leaves and serve piping hot"
    				,
    				"Gravy\n"+
    				"Fry the coconut in coconut oil with whole garam masala, sonf and onion. Fry till golden brown colour. Add some chopped tomato, cook well and make it a paste. Cook the sauce with salt for few minutes.\n"+
    				"Balls\n"+
    				"Put all the powdered spices, half of the ginger-garlic paste, salt and lime juice to the minced meat and knead well to make it tight. Make four even-sized balls. Put the balls to the boiling gravy and let it boil for twenty minutes.\n"+
    				"Temper the curry with mustard, chilli and curry leaf. Serve hot with rice."
    				,
    				"Cut the chicken into medium pieces and marinate it with a little chilli powder and salt for a while. \n"+
    				"Make the first and second extract of coconut milk. \n"+
    				"Heat kadai (pan), add coconut oil and saut? sliced onions, green chilli, ginger, garlic and curry leaves. \n"+
    				"Then add chilli powder, coriander powder, turmeric powder and chicken masala powder. Put the chicken pieces in the kadai till it is half done. \n"+
    				"Add the second extract of coconut milk and get it cooked gently in slow fire. \n"+
    				"Finally add the first extract of coconut milk and serve hot."
    				,
    				"Heat oil in kadai and put the fenugreek seed. \n"+
    				"After the fenugreek seed get browned add onion rings, ginger, garlic, curry leaf and green chilli. Saut? for some time. \n"+
    				"Add little flour to make the gravy thickened. \n"+
    				"Add turmeric powder, fish, lime juice and little coconut milk, allow to cook the fish with some water.\n"+
    				"Finally put the sliced tomato and capsicum rings and finish it with the rest of coconut milk"
    				,
    				"Make a fish stock with fish bones, crushed ginger and pepper corns and strain it in a muslin cloth.\n"+
    				"Cut fish into small cubes\n"+
    				"Heat the oil in a sauce pan and add chopped garlic, onion, green chilli and saute well, along with cubes of fish for 5 minutes.\n"+
    				"Add the fish stock and allow to boil it for 15 minutes.\n"+
    				"Check the seasoning, add tomato and coriander leaves and serve hot"
    				,
    				"Soak tamarind in little water. \n"+
    				"Also soak chilli powder in a 4 tsp of water.\n"+
    				"Heat oil and fry fenugreek and then add onion.\n"+
    				"Sauté and add ginger.\n"+
    				"Add the soaked chilli powder and when it is browned add the tamarind water and one cup more of water, sufficient to cook the fish.\n"+
    				"Put fish,tamarind and salt and cook covered.  When it boils add garlic. \n"+
    				"Allow simmering and when the gravy has desired thickness remove from fire."
    				,
    				"Cook ada in water. As soon as ada is cooked, wash it in cold water and drain. \n"+
    				"Put the butter and ada together and stir on slow fire taking care that the ada does not break or gets soggy. \n"+
    				"Add milk, condensed milk and sugar. Mix the rice flour. Allow it to simmer till it thicken\n"+
    				"Remove from fire and add the fried cashew nuts and cardamom powder. \n"+
    				"Stir continuously for sometime so as to prevent the payasam from curdling"
    				,
    				"Pound the grated coconut with the green chillies, curry leaves and small onions in a mixer bowl. \n"+
    				"Fry the pappadams lightly – the usual way – and then crumble them.\n"+
    				"Now add salt and the coconut mixture to it and mix.\n"+
    				"Crackle the mustard seeds in coconut oil and then sauté the dry red chillies, chopped small onions and curry leaves. \n"+
    				"Add the pappadam-coconut mixture and stir well. \n"+
    				"Lower the flame and cook till done.\n"+
    				"Serve hot."
    				,
    				"Basic Dough\n"+
    				"Bring water to a boil. Add salt. Add the flour into the water and cook over a simmering flame. Allow the mixture to cool. Knead to a smooth dough, free of lumps.\n"+
    				"Ari Pathiri\n"+
    				"Make 30-35 g balls from the basic dough. Roll out as thin as possible (1mm). Cut the pathiri using cutter into rounds of 5 inches diameter. Cook on a hot griddle with out changing the colour. Serve hot.\n"+
    				"Vachchu Pathiri\n"+
    				"Make balls weighing 110-125 g from the basic dough. Roll out into pathiris of 5 inches diameter. Place between two banana leaves and cook on a medium hot griddle. Remove the banana leaf before serving.\n"+
    				"Kunji Pathiri\n"+
    				"Make small pellets of 1 cm diameter from the basic dough. Press between the thumb and forefinger into small circles of 1.5 cm diameter. Steam for 3-4 minutes. Serve hot with fish or chicken curry."
    				,
    				"Beat the eggs with sugar, heat one table spoon ghee, add the egg and stir well to scrambled egg consistency. \n"+
    				"Add cashew nuts, raisins and cardamom powder. Remove from the fire. \n"+
    				"Peel the banana and slit into four without cutting ends. Stuff the banana with the scrambled eggs. \n"+
    				"Make a paste with flour, salt and water. Apply the paste on the stuffing. \n"+
    				"Heat the oil slowly and put the banana in it. Deep fry to a golden brown and remove."
    				,
    				"Peel ripped banana and cut it into long pieces. \n"+
    				"Prepare a batter with flour, sugar, cumin seeds and yellow colour. \n"+
    				"Dip the slices of banana in batter and fry it in the refined oil. \n"+
    				"Serve hot in a dish"
    				,
    				"Wash and clean the pork. Cut into small (1 inch) cubes and then boil it.\n"+
    				"Remove the skin of raw banana. After cutting the banana into two (length wise), make it into thick sheets and boil it. While boiling the pork & raw banana, add little turmeric powder and salt.\n"+
    				"Heat oil in a pan and add the sliced ginger, garlic, green chilli, onion and curry leaves. Saut? well and then add the masalas and fry well.\n"+
    				"Add the pork and raw banana into the pan and fry it nicely. Squeeze little lime and add salt"
    				,
    				"Appam batter\n"+
    				"For the appam batter, grind the soaked rice with very little water. Add fermented cococnut water, sugar, salt and cooked rice powder.\n"+
    				"Keep the batter at room temperature for 8 hours\n"+
    				"Prawn Masala\n"+
    				"Fry chopped onion ginger garlic paste, add curry powder and tomato. Cook the prawns….add salt, curry leaf and make it dry. Finally, add coconut milk\n"+
    				"Appam\n"+
    				"Heat the appam pan, put one spoon of batter and make it thin. Cover the pan for 10 seconds. Open the pan and put 3 prawns in the centre with the thick gravy. Cover it again and cook for little more time. Serve hot"
    				,
    				"Wash, drain and add ingredients numbered 2 to 5, half a teaspoon of turmeric powder,  half a teaspoon of chilly powder, salt and 1 tablespoon coconut oil.  Cook it for only a minute.\n"+
    				"Saute the sliced onions in the remaining coconut oil till it becomes light brown.\n"+
    				"Add the remaining chilli powder, turmeric powder and coriander powder and saute for few seconds.\n"+
    				"Wash, drain and add ingredients numbered 2 to 5, half a teaspoon of turmeric powder,  half a teaspoon of chilly powder, salt and 1 tablespoon coconut oil.  Cook it for only a minute. \n"+
    				"Add the cooked prawns, green chilli, ginger, curry leaves and sliced tomato. Stir fry. \n"+
    				"Remove from the fire; add lime juice and sprinkle garam masala."
    				,
    				"Brush a little oil in the bottom of an earthen pot.\n"+
    				"Mix onion, curry leaves, crushed peppercorn, salt, lemon juice, ginger and garlic paste together with washed fresh prawns.\n"+
    				"Sprinkle a little hot prawn stock and cook in the pot till the prawn is tender and dry.\n"+
    				"Serve with rice, boiled vegetables and wedge of lime."
    				,
    				"Add salt and water to the flour, mix well so that there are no lumps.\n"+
    				"Fill the mixture in puttu maker. First make a layer of grated coconut, then flour. Like this make alternative layers.\n"+
    				"Steam till cooked."
    				,
    				"Boil black channa in salt.  \n"+
    				"Sauté grated coconut, shallots, red chillies, coriander, curry leaves and garlic in a little coconut oil till golden brown. \n"+
    				"After that grind them together to a coarse paste. \n"+
    				"Sauté the mustard seeds, sliced onions, coriander powder, chilli powder, and garam masala powder. \n"+
    				"Add the garam masala to this and fry well. \n"+
    				"Add water and the boiled channa. Cook well. \n"+
    				"Add a little salt and serve hot"
    				,
    				"Tuna\n"+
    				"Mix all the marinades together. Marinate the fish for 10 minutes. Grill it on a tawa in coconut oil.\n"+
    				"Tiger Prawns\n"+
    				"Mix all the ingredients and apply on the tiger prawns. Grill them. \n"+
    				"Pomfret\n"+
    				"Mix all the ingredients and apply on the fish. Grill the fish in coconut oil.\n"+
    				"Accompaniments and Suaces\n"+
    				"Take a thick bottomed pan. Pour coconut oil. Crackle mustard seeds. Add all other ingredients. Saute for one minute.\n"+
    				"Red spinach rice\n"+
    				"Shred red spinach leaves	\n"+
    				"Saute the rice with red spinach and garlic and season it.	\n"+
    				"Boiled Vegetables\n"+
    				"Temper boil the vegetables with salt and pepper. Crackle mustard seeds in coconut oil and Saute the boiled vegetables along with curry leaves.\n"+
    				"Sauce\n"+
    				"Heat coconut oil. Saute onion until golden brown. Add ginger, garlic, turmeric powder, curry leaves. When it is browned, add coconut milk, cocum and salt to taste"
    				,
    				"Half boil the potatoes in salted water. Drain and keep aside. Make a paste out of shallots, ginger and garlic paste, chilly powder, turmeric and limejuice. Season well. Mix with the drained potatoes.\n"+
    				"Heat a dosa plate or non-stick pan on a slow flame. Pour two spoons of oil and grill the marinated potatoes. Continue the process till the potatoes are well done. Adjust seasoning. Serve hot the spicy potato with salad.\n"+
    				"To vary you can add Kashmir chilly powder instead of the other chilly powder. That will give your dish a good appearance."
    				,
    				"Saute the green chilly, ginger, garlic, onion with coconut oil. Add pepper powder, chilly powder, coriander powder, turmeric powder and salt. Add boiled roundels of squid. Add tomato and curry leaves. \n"+
    				"Presentation\n"+
    				"Serve in a curry bowl garnished with onion slices."
    				,
    				"Mix ingredients for marinade. Marinate fish for 15 minutes. Pour oil into a flat-bottomed pan and heat. Before oil starts to smoke, add onions and fry. Add the grated coconut and fry for a minute making sure that if does not turn brown.\n"+
    				"Add chillies, ginger, garlic, powdered spices, sugar, salt and vegetables. Mix thoroughly and then, add 2 cups water. Cover and cook on low heat till vegetables are almost done.\n"+
    				"Add the marinated prawns.\n"+
    				"Cover and cook for 5 minutes till vegetables are almost dry. Remove from heat, add garam masala and cover for 2 minutes. Garnish with chopped coriander.\n"+
    				"May use small or medium and fresh or dried prawns. If using dried prawns, soak in cold water for 10 minutes.\n"+
    				"The vegetables that may be used individually with prawns are chopped cabbage, cubed aubergines, cubed raw skinned jackfruit, cubed raw skinned papaya, cubed turnip, skinned baby potatoes, cauliflower florets and beans"
    				,
    				"Finely chopped chicken liver, mashed potato, Ginger-garlic paste, chopped onion, green chilly, curry leaves and sauté fine. \n"+
    				"Add the powders. Garam masala, curd and salt to make a thick stuffing (Use coconut oil for stuffing mixture) \n"+
    				"Place the boiled egg fully in to the breast and over the chicken, place behind the stuffing mixture tight and neat by grilling in any desired style and serve hot"
    				,
    				"Boil water with little vinegar. Put the Kallummekaya (Mussels shells) and allow the same to dry.\n"+
    				"SautE the ingredients from 1-9 until light golden brown. Add salt, pepper and lime juice; mix well and check the seasonings.\n"+
    				"In a pan heat coconut oil and make white sauce with coconut milk and maida. Make a smooth sauce. Add pre prepared seafood masala into it and mix well.\n"+
    				"Stuff this masala in the Kallummekaya shells.\n"+
    				"Put little grated cheese or cottage cheese on top of it and make in a preheated oven at 1800C for 15 minutes.\n"+
    				"Arrange on the plates and decorate with tomato flowers, lime wedges and cucumber slices\n"+
    				"Serve hot."
    				,
    				"Mix cream sugar with half the egg white and corn flour. Add boiled milk gradually. Cook in double boiler until the custard is thick. Add gelatine dissolved in warm water strain and cool.\n"+
    				"Add coconut extract, essence, cream, tender coconut and stiffly beaten white of egg.  Put into a mould and set in refrigerator."
    				,
    				"Grate the coconuts. Peel the shallots. Clean, wash & cut green chilli & ginger.\n"+
    				"Heat little coconut oil in an urli. Add the grated coconut, ginger, garlic, shallots & green chilli and fennel seeds. Saute till slightly golden. \n"+
    				"Put the above mixture in to a grinder and make a fine paste. \n"+
    				"Clean, wash and cut chicken into curry cut pieces. \n"+
    				"In a Kodhai / Urli heat some coconut oil. Add mustard seeds. Wait till it crackles. Now add red chillies and chicken and sauté for some time. \n"+
    				"Add the above made paste and little water, ensuring that the gravy is not too watery. Add salt and cook till the fat starts leaving from the sides of the urli & chicken pieces are tender. \n"+
    				"Serve with hot appams or ghee rice."
    				,
    				"Soak the yeast in warm water and powder the sugar 2.Make a thick batter using flour, sugar, yeast and coconut milk.\n"+
    				"Keep it aside for 6 hours for fermentation.\n"+
    				"Steam the batter in a Idli steamer and serve hot with pork kaya ulathiyathu."
    				,
    				"Grind the coconut into a very fine paste. Scoop the potato into a small ball by using a scoopper. \n"+
    				"Chop half of the ginger, green chilly and onion and mix with the mutton kheema. Add a little salt. Mix thoroughly and make into small balls and keep it aside. \n"+
    				"Slice the onion, ginger, green chilly and tomato. \n"+
    				"Heat the oil, sauté the ginger, green chilly, onion and finally tomato adding all the masalas and fry well. \n"+
    				"Add the coconut paste into the pan and cook well. Add the mutton and potato halls into it and cook until the mutton is tender. \n"+
    				"Garnish with fried curry leaves and chopped coriander leaves."
    				,
    				"Cut the chicken into large cuts and clean.\n"+
    				"Make a marination with all the ingredients and marinate the chicken for 15 minutes.\n"+
    				"Heat the oil and fry the chicken till golden red and drain the pieces from excess oil.\n"+
    				"Serve the chicken garnished with mixed salad dressed with lemon juice"
    				,
    				" Make a fine smooth paste of grated coconut, coriander seeds, red chilli, pepper corns, cumin seed, aniseeds and garlic.\n"+
    				"Saute the peeled sliced shallots in coconut oil till it becomes brown.\n"+
    				"Add chilli powder, coriander powder, tamarind pulp and cook for about 4 minutes.\n"+
    				"Add the curry paste to the mixture and cook for further 4 minutes.\n"+
    				"Check for seasoning.\n"+
    				"Garnish with curry leaves and serve piping hot"
    				,
    				"Heat oil in a frying pan. Add the tempering ingredient, sauteed onion and coconut slices. Add sun dried beef sauteed in a slow fire around 3 min. Add garam masala, seasoning and lime juice. Saut?ed well for about 8 min. in a slow fire until the meat is well cooked. Serve with onion slice"
    				,
    				"Caramelise the sugar in a pan over slow flame. Spread this caramelised sugar over a tray.\n"+
    				"Now mix the eggs, milk & coconut milk in a basin with a whisk. \n"+
    				"Pour the mixture over a tray and cover it with a silver foil. \n"+
    				"Add melted jaggery to this mixture along with the cardamom powder.\n"+
    				"Cook this mixture in a steamer till it acquires a consistency of caramel custard. \n"+
    				"Serve cold."
    				,
    				"Clean and wash, string the beans, peel the carrots and potato. \n"+
    				"Cut the cauliflower into small florets. Cut the beans, carrots & potatoes into one-inch dices. Boil & strain.\n"+
    				"In a saucepan heat coconut oil. Add mustard seeds and wait till they crackle. \n"+
    				"Add cardamom, cinnamon & cloves. \n"+
    				"Add slices onions, slit green chillies, chopped ginger & garlic saut? till onions become pink in colour.\n"+
    				"Add curry leaves, red chilli powder and turmeric powder.\n"+
    				"Now add the second extract of coconut milk with the boiled vegetables. Then add the peeled diced mango.\n"+
    				"Reduce the flame and add the first extract of coconut milk and cook till the gravy thickens. \n"+
    				"Add salt to taste and adjust the seasonings and serve hot.\n"
    };

    // Selection of the spinner
    final Spinner spinner = (Spinner) findViewById(R.id.spinner3);
    final EditText txt_Ingredients3 = (EditText) findViewById(R.id.ingredients3);
    final EditText txt_Instructions3 = (EditText) findViewById(R.id.instructions3);
    txt_Ingredients3.setFocusable(false);
    txt_Instructions3.setFocusable(false);
    // Application of the Array to the Spinner
    ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this,   android.R.layout.simple_spinner_item, KeralaSpecialityList);
    spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down vieww
    spinner.setAdapter(spinnerArrayAdapter);
    
    
		spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
		          mp1.start();    	

				// TODO Auto-generated method stub
				//Log.d("gil", Ingredients[spinner.getSelectedItemPosition()]);
				txt_Ingredients3.setText(KeralaSpecialityIngredients[spinner.getSelectedItemPosition()]);
				txt_Instructions3.setText(KeralaSpecialityInstructions[spinner.getSelectedItemPosition()]);
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
  
}
 
} // end class
