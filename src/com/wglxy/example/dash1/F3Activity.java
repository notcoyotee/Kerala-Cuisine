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
import android.widget.ArrayAdapter;
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
    
    String KeralaSpecialityList[] = {
    		   "Aattirachi (Mutton) Ularthiyathu",
    		    "Ada Pradhaman ",
    		    "Alleppey fish curry",
    		    "Appam ",
    		    "Appam & Mutton Stew",
    		    "Arikkadukka ",
    		    "Avial",
    		    "Beef Ularthiyathu ",
    		    "Chemmeen Moile",
    		    "Chemmeen Thullichathu ",
    		    "Chemmeen Varuthathu",
    		    "Chicken Pepper Fry ",
    		    "Chilli Garlic Prawns",
    		    "Chiratta Puttu ",
    		    "Chuttirachi",
    		    "Cochin Attin Soup ",
    		    "Dry Fish Curry",
    		    "Duck Mappas ",
    		    "Duck Roast",
    		    "Erachi Vada ",
    		    "Finger Prawns",
    		    "Ginger feathered tiger prawns ",
    		    "Golden Fried Prawns",
    		    "Green Masala Fried Karimeen ",
    		    "Kallappam (10Nos.)",
    		    "Kallummakaya Ularthiyathu ",
    		    "Kappa & Meen Mulakittathu",
    		    "Kappa (Tapioca) Biriyani ",
    		    "Karimeen Mappas",
    		    "Karimeen pollichathu ",
    		    "Kaya Attirachi Curry",
    		    "Kerala Fish Curry ",
    		    "Kerala Mutton Soup (for two portions)",
    		    "Konchu (Prawn) Fry ",
    		    "Konchu Pollichathu",
    		    "Kozhi Peralan ",
    		    "Kozhuva (Anchovies) Varuthathu",
    		    "Lamb with Kappa (Tapioca) Ularthiathu ",
    		    "Madhura Kizhangu Uppumavu",
    		    "Malabar Chicken Biriyani. ",
    		    "Malabar Duck Roast",
    		    "Malabar Lamb Curry ",
    		    "Malabar Mutton Biriyani",
    		    "Malabari Chemmeen Soup ",
    		    "Malabari Fish Roast",
    		    "Masala Fried Fish ",
    		    "Masala Fried Prawns",
    		    "Masala Grilled Pork (Serves 2) ",
    		    "Meen Moleshyam",
    		    "Meen Muringakka Curry ",
    		    "Meen Pathiri",
    		    "Meen Peera ",
    		    "Meen Pollichathu (Pomfret)",
    		    "Meen Thavayil Pollichathu ",
    		    "Mezhukkupuratty",
    		    "Mutton Biriyani (2 Plates) ",
    		    "Mutton Coconut Fry",
    		    "Mutton Urunda Kulambu ",
    		    "Nadan Kozhi Curry",
    		    "Naimeen Molee (Sear Fish) ",
    		    "Naimeen Soup",
    		    "Naimeen Vevichathu ",
    		    "Palada Pradhaman",
    		    "Pappadam Thoran ",
    		    "Pathiri",
    		    "Pazham Nirachathu ",
    		    "Pazhampori",
    		    "Pork With Kaya Ularthiyathu ",
    		    "Prawns Appam",
    		    "Prawns Chilly Fry ",
    		    "Prawns in Country Style",
    		    "Puttu and Kadala Curry ",
    		    "Seafood Grill",
    		    "South Indian Potatoes ",
    		    "Squid Ularthiyathu",
    		    "Stewed Vegetables With Prawns ",
    		    "Stuffed Chicken 'Kerala Style'",
    		    "Stuffed Kallummekaya (Mussels) with seafood ",
    		    "Tender Coconut Souffle",
    		    "Thalassery Kozhicurry ",
    		    "Travancore Appam (for 4 persons)",
    		    "Travancore Chicken Fry (4 Portion) ",
    		    "Ulli Theeyal",
    		    "Varuttirachi ",
    		    "Vathalappam",
    		    "Vegetable Manga Mappas"
    		};

    // Selection of the spinner
    Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);

    // Application of the Array to the Spinner
    ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this,   android.R.layout.simple_spinner_item, KeralaSpecialityList);
    spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down vieww
    spinner3.setAdapter(spinnerArrayAdapter);
    
 }
    
} // end class
