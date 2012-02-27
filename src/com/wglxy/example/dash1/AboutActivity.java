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
import android.widget.TextView;

/**
 * This is the About activity in the dashboard application.
 * It displays some text and provides a way to get back to the home activity.
 *
 */

public class AboutActivity extends DashboardActivity 
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

    setContentView (R.layout.activity_about);
    setTitleFromActivityLabel (R.id.title_text);
    /*   final TextView t1 = (TextView) findViewById(R.id.abouttextview);
t1.setText(
		"Main Ingredients in kerala cusinie\n"+
        "~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"+
				"Coconuts grow in abundance in Kerala, and consequently, coconut kernel, (sliced or grated) coconut cream and coconut milk are widely used in dishes for thickening and flavoring. Kerala's long coastline, numerous rivers and backwater networks, and strong fishing industry have contributed to many sea and river food based dishes. Rice and cassava (Tapioca) form the staple food of Kerala. \nAll main dishes are made with them and served along with Kootan; the side dishes which may be made from vegetables, meat, fish or a mix of all of them.\nThe main dish for lunch and dinner is boiled rice. The Kerala breakfast shows a rich variety; the main dishes for which are made from rice flour, or fresh or dried cassava. Owing to the weather and the availability of spices, the Kerala cuisine is richly spicy especially the hot ones -chilly, black pepper, cardamom, cloves, ginger, and cinnamon.\n"+

				"\n\nHistorical and cultural influences\n"+
				     "~~~~~~~~~~~~~~~~~~~~~~~~~~\n"+

				"For over 2000 years, Kerala has been visited by ocean-goers, including traders from Greece, Rome, the eastern Mediterranean, Arab countries, and Europe (see History of Kerala). Thus, Kerala cuisine is a blend of indigenous dishes and foreign dishes adapted to Kerala tastes.\n"+
				"Pre-independence Kerala was basically split into the princely states of Travancore & Kochi in the south, and Malabar district in the north; the erstwhile split is reflected in the recipes and cooking style of each area. Both Travancore and northern Malabar cuisine consists of a variety of vegetarian dishes using many vegetables and fruits that are not commonly used in curries elsewhere in India including plantains ('vazha-ppazham' or 'ethaykka'), bitter gourd ('pavaykka' in Travancore and 'kyppakka' in northern Malabar), Yam ('chena'), Colocasia ('chembu'), Ash gourd ('kumbalanga'), etc. However, their style of preparation and names of the prepares dishes may vary. Northern Malabar has an array of vegetarian and non-vegetarian dishes such as pathiri (a sort of rice-based pancake, at times paired with a meat curry), porotta (a layered flatbread, said to come from South-East Asia), and the Kerala variant of the popular biriyani, probably from Arab lands. Central Travancore region boasts of a parade of dishes that is largely identified with the Christians of the region.\n"+
				"In addition to historical diversity, the cultural influences, particularly the large percentages of Muslims and Syrian Christians have also contributed unique dishes and styles to Kerala cuisine, especially non-vegetarian dishes. The meat eating habit of the people have been historically limited by religious taboos. Brahmins eschew non vegetarian items. However, most of modern day Hindus do not observe any dietary taboos, except a few of those belonging to upper caste.[1] Muslims do not eat pork and other items forbidden by Islamic law.\n"+
				"Historically, Kerala was part of the Tamil-speaking area, and Tamilian influence is seen in the popularity of sambar, idli and dosa. European influence is reflected in the numerous bakeries selling cakes, cream horns, and Western-style yeast-leavened bread, and in Anglo-Indian cuisine. The import of potatoes, tomatoes, and chili peppers from the Americas led to their enthusiastic use in Kerala, although except for the ubiquitous peppers, the other ingredients are used more sparingly.\n"+
				"\n\nsource : wikipedia"
		);*/
}
    
} // end class
