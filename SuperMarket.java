class SuperMarket{
  public static String[] searchBrandByProduct(String productName){
     
	if(productName=="shampoo"){
    String shampooBrands[]={"Clinic Plus","Sunsilk","Head & Shoulders","Pantene","Dove","Tresemme","Loreal","Garnier","Himalaya",
	"Biotique","Meera","Chik","Indulekha","Kesh King","Vatika","WOW","Mamaearth","Khadi","Park Avenue","Fiama","Nyle","Matrix",
	"Schwarzkopf","Herbal Essences","Sebamed","Santoor","Johnson's Baby","Dabur","Ayush","Rejoice","Clear","Love Beauty & Planet"
	,"Arata","Minimalist","Plum","Streax","Set Wet"};
	return shampooBrands;
	}

    if(productName=="biscuit"){
    String biscuitBrands[]= {"Britannia Good Day","Britannia Marie Gold","Parle G","Hide & Seek","Sunfeast Dark Fantasy","Oreo",
	"Bourbon","Monaco","Tiger","Milk Bikis","Little Hearts","Treat Croissant","Krackjack","Jim Jam","50-50","Nice Time",
	"Marie Light","Unibic Cookies","McVitie's Digestive","Digestive Sugar Free","NutriChoice","Sunfeast Mom's Magic",
	"Dark Fantasy Vanilla","Britannia Milk Cream","Good Day Butter","Parle 20-20","Anmol Marie","Priyagold Butter Bite",
	"Cremica Bourbon","Maliban Cream","Dukes Cream","Bisk Farm","Dukes Waffy","Happy Happy","Britannia Bourbon",
	"Parle Hide & Seek Fab","Sunfeast Dream Cream"};
	return biscuitBrands;
	}
	 
	 if(productName == "soap"){
	 String soapBrands[] = {"Lux","Dove","Pears","Santoor","Cinthol","Lifebuoy","Dettol","Medimix","Mysore Sandal","Hamam","Fiama","Vivel","Godrej No.1","Himalaya",
     "Patanjali","Nivea","Johnson Baby","Chandrika","Margo","Liril", "Breeze","Yardley","Khadi Natural","Biotique","Park Avenue",
     "Wild Stone","Aramusk","Rexona","Neem Guard","Tetmosol","Savlon","Ayur","Palmolive","Sebamed","Forest Essentials",
     "Mamaearth","Dove Sensitive"};
	 return soapBrands ;
	 }
	 
	 if(productName == "toothpaste"){
	 String toothPasteBrands[] = { "Colgate","Closeup","Pepsodent","Sensodyne","Dabur Red","Meswak",
     "Patanjali Dant Kanti","Himalaya Complete Care","Vicco Vajradanti", "Oral B","Anchor","Babool","Colgate MaxFresh","Colgate Visible White",
     "Sensodyne Rapid Relief","Pepsodent Germicheck","Closeup Red Hot", "Dabur Meswak","Himalaya Sparkling White","Patanjali Herbal",
     "Aquafresh","Arm & Hammer","Colgate Active Salt","Colgate Strong Teeth","Colgate Kids","Sensodyne Fresh Mint","Closeup Deep Action",
     "Pepsodent Complete Care","Oral B Pro Health","Anchor White","Dabur Herbal","Himalaya Active Fresh","Patanjali Advanced",
     "Vicco Turmeric","Meswak Herbal","Sensodyne Repair","Colgate Total"};
	 return toothPasteBrands ;
	 }
	 
	 if(productName == "oil"){
	 String oilBrands[] = {"Fortune","Saffola","Dhara","Freedom","Gold Winner","Gemini",
     "Sundrop","Emami Healthy","Patanjali Oil","Oleev", "Borges","Figaro","Leonardo","Del Monte","Nature Fresh",
     "Aadhar Oil","Fortune Rice Bran","Sundrop Heart","Saffola Gold","Saffola Active","Freedom Sunflower",
     "Gemini Refined","Gold Winner Sunflower","Dhara Mustard","Patanjali Mustard","Emami Mustard","Fortune Mustard",
     "Saffola Tasty","Sundrop Lite","Oleev Smart","Borges Extra Virgin","Figaro Olive Oil","Del Monte Olive Oil",
     "Leonardo Olive Oil","Freedom Rice Bran","Gemini Sunflower","Gold Drop"};
	 return oilBrands ;
	 }
	 
	 if(productName == "rice"){
	 String  riceBrands[] = { "India Gate","Daawat","Kohinoor","Lal Qilla","Fortune Rice","Aashirvaad Rice","Patanjali Rice","24 Mantra","BB Royal",
     "Tilda","Crown","Unity","Aeroplane","Heritage","Royal","Annapurna","Shakti Bhog","Gautam","HMT Rice",
     "Utsav","Mother Dairy Rice","Sona Masoori Gold","India Gate Classic","Daawat Rozana","Kohinoor Gold",
      "Lal Qilla Basmati","Fortune Biryani","Aashirvaad Select","Patanjali Basmati","BB Royal Organic","Tilda Pure",
     "Crown Deluxe","Unity Basmati","Royal Chef Secret","Annapurna Premium","Shakti Bhog Basmati","Gautam Gold" };
	 return  riceBrands ;
	 }
	 
	 if(productName == "wheatFlour"){
	 String wheatFlourBrands[] = {"Aashirvaad Atta","Patanjali Atta","Annapurna Atta","Shakti Bhog Atta", "Fortune Atta","Nature Fresh Atta","Pillsbury Atta",
    "24 Mantra Atta","BB Royal Atta","Organic Tattva","Rajdhani Atta","Ganesh Atta","Samrat Atta",
    "Golden Harvest Atta","Healthy Choice Atta","Natureland Atta","Pro Nature Atta","Farm2Home Atta","Double Horse Atta",
    "Sharbati Gold Atta","MP Sharbati Atta","Aashirvaad Select Atta","Fortune Chakki Fresh","Patanjali Whole Wheat",
    "Annapurna Sharbati","Shakti Bhog Sharbati","Rajdhani Besan","Pillsbury Multigrain","24 Mantra Organic Atta","BB Royal Chakki Atta",
     "Organic India Atta","Pro Nature Whole Wheat","Healthy Earth Atta","Golden Harvest Chakki",
    "Nature Fresh Sampoorna","Samrat Chakki Atta","Farm Fresh Atta"};
	 return wheatFlourBrands ;
	 }
	 
	 if(productName == "sugar"){
	 String sugarBrands[] = {"Madhur","Trust","Dhampure","Parry","Uttam","Dalmia","EID Parry","Mawana","Bajaj Sugar","Rajshree",
     "Balrampur","Shree Renuka","Dhampur Green","Triveni","Shakti Sugar","Uttam Crystal","Madhur Pure","Trust White Sugar","Parry Crystal","Dalmia Gold",
     "Mawana Refined","Bajaj Crystal","Rajshree Crystal","Balrampur Chini","Renuka Crystal","Dhampur Sulphurless","Triveni Crystal","Shakti Refined","Uttam Premium",
     "Madhur Sulphurless","Trust Premium","Parry Refined","Dalmia Crystal","Mawana Premium","Bajaj Refined","Rajshree White","Balrampur Premium"};
	 return sugarBrands ;
	 }
	 
	 if(productName == "salt"){
	 String saltBrands[] = {"Tata Salt","Aashirvaad Salt","Catch Salt","Captain Cook","Annapurna Salt","Patanjali Salt",
	 "Nirma Salt","Saffola Salt","BB Royal Salt","Organic Tattva Salt","Tata Salt Lite","Tata Rock Salt","Catch Black Salt",
	 "Captain Cook Iodized","Annapurna Crystal","Patanjali Sendha Namak","Nirma Shudh Salt","Saffola Active Salt",
	 "BB Royal Rock Salt","Organic India Salt","Tata Salt Crystal","Catch Table Salt","Captain Cook Crystal",
	 "Annapurna Iodized","Patanjali Iodized","Nirma Iodized","Saffola Table Salt","BB Royal Iodized","Tata Himalayan Salt",
	 "Catch Pink Salt","Captain Cook Pink","Annapurna Pink Salt","Patanjali Rock Salt","Nirma Table Salt","Saffola Lite Salt",
	 "Organic Tattva Pink","Tata Salt Premium"};
	 return saltBrands ;
	 }
	 
	 if(productName == "tea"){
	 String teaBrands[] = {"Tata Tea","Taj Mahal","Red Label","Brooke Bond","Tetley","Society Tea","Wagh Bakri","Girnar","Lipton","3 Roses","AVT","Tata Gold",
     "Tata Agni","Taj Mahal Gold","Red Label Natural","Brooke Bond Taaza","Tetley Green Tea","Society Masala Tea","Wagh Bakri Premium",
     "Girnar Masala","Lipton Yellow Label","3 Roses Natural","AVT Premium","Tata Tea Chakra Gold","Tata Kanan Devan","Taj Mahal Classic","Red Label Strong",
     "Brooke Bond 3 Roses","Tetley Premium","Society Leaf Tea","Wagh Bakri Leaf","Girnar Green Tea","Lipton Green Tea","AVT Assam Tea","Tata Elaichi Tea","Taj Mahal Masala","Red Label Elaichi"};
	 return teaBrands ;
	 }
	 
    if(productName.equals("coffee"))
        return new String[]{"Bru","Nescafe","Tata Coffee","Continental","Levista","Colombian Brew","Sleepy Owl","Blue Tokai",
	"Rage Coffee","Country Bean","Davidoff","Starbucks","Costa Coffee","McCafe","Cafe Coffee Day","Bevzilla","Narasu's",
	"Leo Coffee","Cothas","Malgudi Coffee","Bayar's","Seven Beans","Third Wave Coffee","Slay Coffee","Araku Coffee","Black Baza",
	"ID Filter Coffee","Tata Grand Coffee","Nescafe Gold","Bru Gold","Continental Xtra","Levista Classic","Colombian Instant",
	"Sleepy Owl Instant","Rage Instant","Country Bean Vanilla","Blue Tokai Instant"};

    if(productName=="milk")
        return new String[]{"Amul","Nandini","Mother Dairy","Arokya","Heritage","Milky Mist","Dodla","Akshayakalpa","Nestle Milk"
	,"Britannia Milk","Gokul","Vijaya","Kwality","Jersey","Paras","Verka","Sanchi","Warana","Gowardhan","Prabhat","Hatsun",
	"Thirumala","Ksheera","Sudha","Saras","Namdhari's","Country Delight","Farm Fresh","Organic India Milk","Pride of Cows",
	"Ananda","Happy Milk","Daily Fresh","Pure & Sure","BB Royal Milk","Aavin","Nilgiris Milk"};

    if(productName=="curd")
        return new String[]{"Amul Curd","Nandini Curd","Mother Dairy Curd","Arokya Curd","Heritage Curd","Milky Mist Curd",
	"Dodla Curd","Akshayakalpa Curd","Nestle Curd","Britannia Curd","Gokul Curd","Vijaya Curd","Kwality Curd","Jersey Curd",
	"Paras Curd","Verka Curd","Sanchi Curd","Warana Curd","Gowardhan Curd","Prabhat Curd","Hatsun Curd","Thirumala Curd",
	"Ksheera Curd","Sudha Curd","Saras Curd","Namdhari's Curd","Country Delight Curd","Farm Fresh Curd","Organic India Curd",
	"Ananda Curd","Happy Milk Curd","Daily Fresh Curd","Pure & Sure Curd","BB Royal Curd","Aavin Curd","Nilgiris Curd",
	"Milma Curd"};

    if(productName=="butter")
        return new String[]{"Amul Butter","Nandini Butter","Mother Dairy Butter","Britannia Butter","Milky Mist Butter",
	"Heritage Butter","Dodla Butter","Gowardhan Butter","Paras Butter","Verka Butter","Sanchi Butter","Warana Butter",
	"Hatsun Butter","Thirumala Butter","Sudha Butter","Saras Butter","Akshayakalpa Butter","Nestle Butter","Arokya Butter",
	"Prabhat Butter","Jersey Butter","Kwality Butter","Nilgiris Butter","Ananda Butter","Milma Butter","President Butter",
	"Organic India Butter","BB Royal Butter","Farm Fresh Butter","Daily Fresh Butter","Country Delight Butter",
	"Pure & Sure Butter","Aavin Butter","Vijaya Butter","Gokul Butter","Pride of Cows Butter","Namdhari's Butter"};

    if(productName=="cheese")
        return new String[]{"Amul Cheese","Britannia Cheese","Milky Mist Cheese","Go Cheese","Mother Dairy Cheese",
	"Gowardhan Cheese","Heritage Cheese","Dodla Cheese","Verka Cheese","Sanchi Cheese","Warana Cheese","Hatsun Cheese",
	"Thirumala Cheese","Sudha Cheese","Saras Cheese","Akshayakalpa Cheese","Nestle Cheese","President Cheese",
	"Organic India Cheese","BB Royal Cheese","Farm Fresh Cheese","Daily Fresh Cheese","Country Delight Cheese",
	"Pure & Sure Cheese","Aavin Cheese","Vijaya Cheese","Gokul Cheese","Nilgiris Cheese","Parmesan Cheese","Cheddar Cheese",
	"Mozzarella Cheese","Processed Cheese","Cream Cheese","Slice Cheese","Cube Cheese","Spread Cheese","Smoked Cheese"};

     if(productName == "bread"){
          String breadBrands[] = {
               "Britannia Bread","Harvest Gold","Modern Bread","English Oven","Fresho Bread","Nilgiris Bread","Spencer's Bread","Wibs Bread","Kitty Bread","Bonn Bread",
               "La Americana Bread","Oroweat Bread","Wonder Bread","Nature Fresh Bread","Perfect Bread","Vibhor Bread","Bakers Dozen","Country Oven Bread","Kalory Bread","Daily Bread"
          };
          return breadBrands;
     }

     if(productName == "jam"){
          String jamBrands[] = {
               "Kissan Jam","Mapro Jam","Tops Jam","Urban Platter Jam","Mala's Jam","Nutty Yogi Jam","24 Mantra Jam","Organic Tattva Jam","BB Royal Jam","Natureland Jam",
               "Sundrop Jam","Hershey's Spread","Del Monte Jam","Bhuira Jam","Saffola Spread","Captain Cook Jam","Rasna Jam","MTR Jam","Chitale Jam","Mother's Recipe Jam"
          };
          return jamBrands;
     }

     if(productName == "honey"){
          String honeyBrands[] = {
               "Dabur Honey","Patanjali Honey","Saffola Honey","Himalaya Honey","Zandu Honey","Lion Honey","Apis Himalaya Honey","24 Mantra Honey","Organic India Honey","BB Royal Honey",
               "Natureland Honey","Indigenous Honey","Under The Mango Tree Honey","Hitkari Honey","Baidyanath Honey","Kapiva Honey","Forever Living Honey","Society Honey","Farm Honey","Pure & Sure Honey"
          };
          return honeyBrands;
     }

     if(productName == "noodles"){
          String noodlesBrands[] = {
               "Maggi","Yippee","Top Ramen","Ching's Secret","Knorr","Sunfeast Noodles","Nissin Noodles","Patanjali Noodles","Smith & Jones","Wai Wai",
               "Indomie","Koka Noodles","Samyang Noodles","Nongshim Noodles","Maggi Atta Noodles","Yippee Magic Masala","Top Ramen Curry","Ching's Hakka","Knorr Soupy","Nissin Cup Noodles"
          };
          return noodlesBrands;
     }

     if(productName == "pasta"){
          String pastaBrands[] = {
               "Del Monte Pasta","Borges Pasta","Weikfield Pasta","Disano Pasta","MTR Pasta","Tata Sampann Pasta","BB Royal Pasta","Organic Tattva Pasta","24 Mantra Pasta","Natureland Pasta",
               "Barilla Pasta","Colavita Pasta","De Cecco Pasta","San Remo Pasta","Urban Platter Pasta","Keya Pasta","Ching's Pasta","Sunfeast Pasta","Maggi Pasta","Yippee Pasta"
          };
          return pastaBrands;
     }

     if(productName == "sauce"){
          String sauceBrands[] = {
               "Del Monte Sauce","Tops Sauce","Kissan Sauce","Ching's Sauce","Maggi Sauce","Heinz Sauce","Veeba Sauce","Smith & Jones Sauce","Urban Platter Sauce","Keya Sauce",
               "BB Royal Sauce","Organic Tattva Sauce","24 Mantra Sauce","Natureland Sauce","Knorr Sauce","Funfoods Sauce","Dr. Oetker Sauce","Patanjali Sauce","MTR Sauce","Wingreens Sauce"
          };
          return sauceBrands;
     }

     if(productName == "ketchup"){
          String ketchupBrands[] = {
               "Kissan Ketchup","Maggi Ketchup","Heinz Ketchup","Tops Ketchup","Del Monte Ketchup","Veeba Ketchup","Smith & Jones Ketchup","BB Royal Ketchup","Organic Tattva Ketchup","24 Mantra Ketchup",
               "Natureland Ketchup","Funfoods Ketchup","Dr. Oetker Ketchup","Patanjali Ketchup","MTR Ketchup","American Garden Ketchup","Kissan Fresh Tomato","Maggi Rich Tomato","Heinz Classic Tomato","Tops Tomato Ketchup"
          };
          return ketchupBrands;
     }

     if(productName == "chips"){
          String chipsBrands[] = {
               "Lays","Kurkure","Bingo","Haldiram's Chips","Pringles","Uncle Chips","Balaji Chips","Too Yumm","Yellow Diamond","TagZ",
               "Cornitos","Doritos","Cheetos","Ruffles","Happilo Chips","Garden Chips","Kettle Studio","Lay's Magic Masala","Kurkure Masala Munch","Bingo Mad Angles"
          };
          return chipsBrands;
     }

     if(productName == "chocolate"){
          String chocolateBrands[] = {
               "Dairy Milk","KitKat","5 Star","Perk","Munch","Silk","Ferrero Rocher","Galaxy","Snickers","Mars",
               "Bounty","Toblerone","Lindt","Amul Chocolate","Nestle Classic","Milkybar","Fuse","Temptations","Cadbury Gems","Hershey's Chocolate"
          };
          return chocolateBrands;
     }

     if(productName == "icecream"){
          String icecreamBrands[] = {
               "Amul Icecream","Kwality Walls","Arun Icecream","Vadilal Icecream","Mother Dairy Icecream","Havmor Icecream","Naturals Icecream","Baskin Robbins","Cream Bell","Top N Town",
               "Scoops Icecream","Milky Mist Icecream","Giani's Icecream","Polar Bear Icecream","London Dairy","Haagen Dazs","Amul Vanilla","Kwality Walls Cornetto","Arun Butterscotch","Naturals Mango"
          };
          return icecreamBrands;
     }

     if(productName == "softDrink"){
          String softDrinkBrands[] = {
               "Coca Cola","Pepsi","Thums Up","Sprite","Fanta","7 Up","Mountain Dew","Mirinda","Limca","Maaza",
               "Slice","Appy Fizz","Schweppes","Red Bull","Monster","Sting","Gatorade","Paper Boat Sparkling","Bovonto","Campacola"
          };
          return softDrinkBrands;
     }
	 
	 
	      if(productName == "juice"){
          String juiceBrands[] = {
               "Tropicana","Real Juice","B Natural","Minute Maid","Paper Boat","Frooti","Maaza","Slice","24 Mantra Juice","Organic India Juice",
               "BB Royal Juice","Del Monte Juice","Urban Platter Juice","Mapro Juice","Mother Dairy Juice","Dabur Juice","Tropicana Mixed Fruit","Real Orange","B Natural Mango","Minute Maid Apple"
          };
          return juiceBrands;
     }

     if(productName == "waterBottle"){
          String waterBottleBrands[] = {
               "Bisleri","Kinley","Aquafina","Bailley","Himalayan Water","Tata Copper Plus","Rail Neer","Kingfisher Water","Qua Water","Bluefin Water",
               "Oxyrich","Vedica","Aquaplus","Everest Water","AquaSure","Bisleri Mineral","Kinley Mineral","Aquafina Mineral","Bailley Premium","Himalayan Natural"
          };
          return waterBottleBrands;
     }

     if(productName == "detergent"){
          String detergentBrands[] = {
               "Surf Excel","Ariel","Tide","Rin","Ghadi","Wheel","Nirma","Henko","Fena","Mr White",
               "Patanjali Detergent","Godrej Ezee","Vanish","Ujala","Surf Excel Matic","Ariel Matic","Tide Plus","Rin Matic","Ghadi Powder","Wheel Green"
          };
          return detergentBrands;
     }

     if(productName == "dishwashLiquid"){
          String dishwashLiquidBrands[] = {
               "Vim Liquid","Pril","Exo Liquid","Vim Bar","Pril Lime","Exo Touch & Shine","Genteel","Patanjali Dishwash","Godrej Protekt","Henko Dishwash",
               "Fena Dishwash","BB Royal Dishwash","Vim Gel","Pril Active","Exo Antibacterial","Genteel Liquid","Patanjali Herbal Dishwash","Godrej Dishwash Bar","Henko Liquid","Fena Liquid"
          };
          return dishwashLiquidBrands;
     }

     if(productName == "handwash"){
          String handwashBrands[] = {
               "Dettol Handwash","Savlon Handwash","Lifebuoy Handwash","Dove Handwash","Godrej Protekt Handwash","Palmolive Handwash","Himalaya Handwash","Patanjali Handwash","Fiama Handwash","Lux Handwash",
               "Santoor Handwash","Medimix Handwash","Boroline Handwash","Khadi Handwash","BB Royal Handwash","Organic Tattva Handwash","Dettol Original","Savlon Moisture Shield","Lifebuoy Total","Dove Sensitive"
          };
          return handwashBrands;
     }

     if(productName == "sanitizer"){
          String sanitizerBrands[] = {
               "Dettol Sanitizer","Savlon Sanitizer","Lifebuoy Sanitizer","Himalaya Sanitizer","Patanjali Sanitizer","Godrej Protekt Sanitizer","Sterillium","BoroPlus Sanitizer","Dabur Sanitizer","ITC Savlon Gel",
               "BB Royal Sanitizer","Pure Hands Sanitizer","CleanMate Sanitizer","Shield Sanitizer","Dettol Aloe Sanitizer","Savlon Spray","Lifebuoy Gel","Himalaya Pure Sanitizer","Patanjali Herbal Sanitizer","Godrej Lemon Sanitizer"
          };
          return sanitizerBrands;
     }
	      if(productName == "facewash"){
          String facewashBrands[] = {
               "Himalaya Facewash","Garnier Facewash","Ponds Facewash","Lakme Facewash","Clean & Clear","Mamaearth Facewash","Plum Facewash","Biotique Facewash","Lotus Facewash","Neutrogena Facewash",
               "Minimalist Facewash","WOW Facewash","Cetaphil Cleanser","Nivea Facewash","Patanjali Facewash","Khadi Facewash","Dove Facewash","Olay Cleanser","Garnier Men","Himalaya Neem"
          };
          return facewashBrands;
     }

     if(productName == "faceCream"){
          String faceCreamBrands[] = {
               "Ponds Cream","Nivea Cream","Lakme Cream","Olay Cream","Himalaya Cream","Lotus Cream","Biotique Cream","Mamaearth Cream","Plum Cream","Garnier Cream",
               "WOW Cream","Minimalist Cream","Cetaphil Cream","Dove Cream","Patanjali Cream","Khadi Cream","Forest Essentials Cream","Nivea Soft","Lakme Peach Milk","Olay Total Effects"
          };
          return faceCreamBrands;
     }

     if(productName == "lotion"){
          String lotionBrands[] = {
               "Nivea Lotion","Vaseline Lotion","Ponds Lotion","Parachute Lotion","Himalaya Lotion","Mamaearth Lotion","WOW Lotion","Cetaphil Lotion","Dove Lotion","Patanjali Lotion",
               "Biotique Lotion","Lotus Lotion","Plum Lotion","Minimalist Lotion","Olay Lotion","Lakme Lotion","Johnson Baby Lotion","Forest Essentials Lotion","Vaseline Aloe Lotion","Nivea Cocoa Lotion"
          };
          return lotionBrands;
     }

     if(productName == "talcumPowder"){
          String talcumPowderBrands[] = {
               "Ponds Powder","Nycil Powder","Cinthol Powder","Cuticura Powder","Dermi Cool Powder","Navratna Powder","Himalaya Powder","Johnson Baby Powder","Nivea Powder","Yardley Powder",
               "Eva Powder","Spinz Powder","Mysore Sandal Powder","Medimix Powder","Wild Stone Powder","Park Avenue Powder","Denver Powder","Patanjali Powder","Khadi Powder","Ponds Dreamflower"
          };
          return talcumPowderBrands;
     }

     if(productName == "deodorant"){
          String deodorantBrands[] = {
               "Fogg","Nivea Deo","Axe","Wild Stone","Denver","Park Avenue","Engage","Layer'r Shot","Bella Vita","Rexona",
               "Spinz","Yardley Deo","Adidas Deo","Nike Deo","Brut Deo","Old Spice","Dove Deo","Set Wet Deo","Ustraa Deo","Beardo Deo"
          };
          return deodorantBrands;
     }
	 
	 if(productName == "razor"){
	 String razorBrands[] = {"Gillette Razor","Gillette Fusion",
"Gillette Mach3","Gillette Guard",
"Bombay Shaving Razor",
"Beardo Razor","Ustraa Razor",
"The Man Company Razor",
"Syska Razor","SuperMax Razor",
"Laser Razor","Feather Razor",
"Schick Razor","Wilkinson Sword",
"Bic Razor","Kai Razor",
"Gillette Blue","Gillette Vector",
"Bombay Shaving Precision",
"Beardo Defender",
"Ustraa Chrome Razor",
"The Man Company Edge",
"Syska Flexi Razor",
"SuperMax Triple Blade",
"Laser Stainless Razor",
"Feather Double Edge",
"Schick Hydro",
"Wilkinson Classic",
"Bic Comfort Razor",
"Kai Captain Razor",
"Gillette Power Razor",
"Gillette Sensitive",
"Bombay Shaving Premium",
"Beardo Safety Razor",
"Ustraa Safety Razor",
"Schick Exacta",
"Wilkinson Quattro"};
	 return razorBrands ;
	 }
	 
	 if(productName == "shavingCream"){
	 String shavingCreamBrands[] = {"Gillette Shaving Cream","Old Spice Shaving Cream",
"Bombay Shaving Cream","Beardo Shaving Cream",
"Ustraa Shaving Cream","The Man Company Cream",
"Park Avenue Shaving Cream",
"Wild Stone Shaving Cream",
"Denver Shaving Cream","Godrej Shaving Cream",
"Vi-John Shaving Cream","Dettol Shaving Cream",
"SuperMax Shaving Cream",
"Laser Shaving Cream",
"Gillette Sensitive Cream",
"Old Spice Musk Cream",
"Bombay Shaving Charcoal",
"Beardo Aloe Cream",
"Ustraa Lime Cream",
"The Man Company Charcoal",
"Park Avenue Good Morning",
"Wild Stone Hydra Cream",
"Denver Hamilton Cream",
"Godrej Cool Menthol",
"Vi-John Classic Cream",
"Dettol Cool Cream",
"SuperMax Menthol",
"Laser Cool Cream",
"Gillette Foamy",
"Old Spice Fresh Lime",
"Bombay Shaving Foam",
"Beardo Beard Softener",
"Ustraa Beard Cream",
"The Man Company Foam",
"Park Avenue Foam",
"Wild Stone Foam",
"Denver Shaving Foam"};
	 return shavingCreamBrands ;
	 }
	 
	 if(productName == "hairOil"){
	 String hairOilBrands[] = {"Parachute Oil","Dabur Amla Oil","Indulekha Oil",
"Bajaj Almond Oil","Navratna Oil",
"Himalaya Hair Oil","Patanjali Hair Oil",
"Khadi Hair Oil","WOW Hair Oil",
"Mamaearth Hair Oil","Kesh King Oil",
"Emami 7 Oils","Dove Hair Oil",
"Livon Oil","Garnier Oil",
"Biotique Oil","Forest Essentials Oil",
"Parachute Advansed","Dabur Vatika Oil",
"Bajaj Brahmi Oil",
"Navratna Cool Oil",
"Himalaya Anti Hairfall Oil",
"Patanjali Kesh Kanti Oil",
"Khadi Amla Oil",
"WOW Onion Oil",
"Mamaearth Onion Oil",
"Kesh King Ayurvedic Oil",
"Emami Almond Oil",
"Dove Elixir Oil",
"Livon Serum Oil",
"Garnier Fructis Oil",
"Biotique Bhringraj Oil",
"Forest Essentials Bhringraj",
"Parachute Coconut Oil",
"Dabur Coconut Oil",
"Bajaj Coconut Oil",
"Indulekha Bringha Oil"};
	 return hairOilBrands ;
	 }
	 
	 if(productName == "conditioner"){
	 String conditionerBrands[] = {"Dove Conditioner","Pantene Conditioner",
"Sunsilk Conditioner","Tresemme Conditioner",
"Loreal Conditioner","Garnier Conditioner",
"Himalaya Conditioner","Patanjali Conditioner",
"Khadi Conditioner","WOW Conditioner",
"Mamaearth Conditioner","Biotique Conditioner",
"Plum Conditioner","Minimalist Conditioner",
"Matrix Conditioner","Schwarzkopf Conditioner",
"Herbal Essences Conditioner",
"Dove Intense Repair",
"Pantene Smooth & Silky",
"Sunsilk Black Shine",
"Tresemme Keratin Smooth",
"Loreal Total Repair",
"Garnier Fructis Conditioner",
"Himalaya Protein Conditioner",
"Patanjali Kesh Kanti Conditioner",
"Khadi Herbal Conditioner",
"WOW Apple Cider Conditioner",
"Mamaearth Onion Conditioner",
"Biotique Thyme Conditioner",
"Plum Olive Conditioner",
"Minimalist Bond Repair",
"Matrix Opti Care",
"Schwarzkopf Smooth Perfect",
"Herbal Essences Bio Renew",
"Dove Hairfall Rescue",
"Pantene Advanced Care",
"Sunsilk Thick & Long"};
	 return conditionerBrands ;
	 }
	 
	 if(productName == "hairColor"){
	 String hairColorBrands[] = {"Loreal Hair Color","Garnier Hair Color",
"Godrej Expert","Bblunt Hair Color",
"Streax Hair Color","Indica Hair Color",
"Revlon Hair Color","Schwarzkopf Hair Color",
"Clairol Hair Color","Biotique Hair Color",
"Khadi Hair Color","WOW Hair Color",
"Mamaearth Hair Color","Patanjali Hair Color",
"Indus Valley Hair Color",
"Loreal Casting Creme",
"Garnier Color Naturals",
"Godrej Nupur","Bblunt Salon Secret",
"Streax Cream Hair Color",
"Indica Natural Black",
"Revlon Colorsilk",
"Schwarzkopf Palette",
"Clairol Natural Instincts",
"Biotique Henna",
"Khadi Natural Black",
"WOW Ammonia Free",
"Mamaearth Plant Based",
"Patanjali Herbal Color",
"Indus Valley Gel Color",
"Loreal Excellence",
"Garnier Burgundy",
"Godrej Rich Creme",
"Bblunt Chocolate Brown",
"Streax Walnut Brown",
"Revlon Burgundy",
"Schwarzkopf Dark Brown"};
	 return hairColorBrands ;
	 }
	 
	 if(productName == "bodyWash"){
	 String bodyWashBrands[] = {"Dove Body Wash","Nivea Body Wash",
"Lux Body Wash","Fiama Body Wash",
"Palmolive Body Wash","Pears Body Wash",
"Dettol Body Wash","Lifebuoy Body Wash",
"Himalaya Body Wash","Patanjali Body Wash",
"Khadi Body Wash","Mamaearth Body Wash",
"WOW Body Wash","Biotique Body Wash",
"Plum Body Wash","Minimalist Body Wash",
"Forest Essentials Body Wash",
"Dove Deep Moisture",
"Nivea Fresh Power",
"Lux Soft Touch",
"Fiama Gel Bar",
"Palmolive Aroma",
"Pears Pure & Gentle",
"Dettol Cool",
"Lifebuoy Care",
"Himalaya Neem Wash",
"Patanjali Herbal Wash",
"Khadi Rose Wash",
"Mamaearth Ubtan Wash","WOW Aloe Wash",
"Biotique Bio Apricot",
"Plum Shower Gel",
"Minimalist Salicylic Wash",
"Forest Essentials Shower Gel",
"Dove Sensitive Wash",
"Nivea Men Wash",
"Lux Lavender Wash"};
	 return bodyWashBrands ;
	 }
	 
	 if(productName == "scrub"){
	 String scrubBrands[] = {"St Ives Scrub","Himalaya Scrub",
"Lotus Scrub","Biotique Scrub",
"Mamaearth Scrub","WOW Scrub",
"Plum Scrub","Minimalist Scrub",
"Khadi Scrub","Patanjali Scrub",
"Neutrogena Scrub","Garnier Scrub",
"Lakme Scrub","Clean & Clear Scrub",
"Forest Essentials Scrub",
"St Ives Apricot",
"Himalaya Walnut Scrub",
"Lotus Apriscrub",
"Biotique Walnut Scrub",
"Mamaearth Coffee Scrub",
"WOW Coffee Scrub",
"Plum Green Tea Scrub",
"Minimalist AHA Scrub",
"Khadi Neem Scrub",
"Patanjali Orange Scrub",
"Neutrogena Deep Clean",
"Garnier Bright Scrub",
"Lakme Blush Scrub",
"Clean & Clear Blackhead",
"Forest Essentials Sugar Scrub",
"St Ives Oatmeal",
"Himalaya Gentle Exfoliating",
"Lotus White Glow Scrub",
"Biotique Papaya Scrub",
"Mamaearth Ubtan Scrub",
"WOW Vitamin C Scrub",
"Plum Chamomile Scrub"
};
	 return scrubBrands ;
	 }
	 
	 if(productName == "makeupKit"){
	 String makeupKitBrands[] = {"Lakme Makeup Kit","Maybelline Makeup Kit","L'Oreal Makeup Kit",
"Swiss Beauty Kit","Sugar Cosmetics Kit","Faces Canada Kit",
"Colorbar Makeup Kit","Blue Heaven Kit","Insight Makeup Kit",
"Elle 18 Kit","Revlon Makeup Kit","MAC Makeup Kit",
"Huda Beauty Kit","NYX Makeup Kit","Wet n Wild Kit",
"Plum Makeup Kit","Mamaearth Makeup Kit","Lotus Makeup Kit",
"Kay Beauty Kit","Chambor Kit","Kiro Beauty Kit",
"Milani Kit","LA Girl Kit","Bobbi Brown Kit",
"Estee Lauder Kit","Clinique Kit","Smashbox Kit",
"Charlotte Tilbury Kit","Anastasia Beverly Hills Kit",
"Sephora Collection Kit","Makeup Revolution Kit",
"PAC Cosmetics Kit","Forever52 Kit","Mars Cosmetics Kit",
"Color Essence Kit","Oriflame Kit","Avon Makeup Kit"};
	 return makeupKitBrands ;
	 }
	 
	 if(productName == "lipstick"){
	 String lipstickBrands[] = {"Lakme Lipstick","Maybelline Lipstick","L'Oreal Lipstick",
"MAC Lipstick","Huda Beauty Lipstick","Sugar Lipstick",
"Faces Canada Lipstick","Colorbar Lipstick","Swiss Beauty Lipstick",
"Insight Lipstick","Elle 18 Lipstick","Revlon Lipstick",
"NYX Lipstick","Wet n Wild Lipstick","Plum Lipstick",
"Mamaearth Lipstick","Kay Beauty Lipstick","Chambor Lipstick",
"Kiro Lipstick","Milani Lipstick","LA Girl Lipstick",
"Bobbi Brown Lipstick","Estee Lauder Lipstick",
"Clinique Lipstick","Smashbox Lipstick",
"Charlotte Tilbury Lipstick","Anastasia Lipstick",
"Sephora Lipstick","Makeup Revolution Lipstick",
"PAC Lipstick","Forever52 Lipstick","Mars Lipstick",
"Blue Heaven Lipstick","Color Essence Lipstick",
"Oriflame Lipstick","Avon Lipstick","Lakme 9to5 Lipstick"};
	 return lipstickBrands ;
	 }
	 
	 if(productName == "kajal"){
	 String kajalBrands[] = {"Lakme Kajal","Maybelline Kajal","L'Oreal Kajal",
"MAC Kajal","Huda Beauty Kajal","Sugar Kajal",
"Faces Canada Kajal","Colorbar Kajal","Swiss Beauty Kajal",
"Insight Kajal","Elle 18 Kajal","Revlon Kajal",
"NYX Kajal","Plum Kajal","Mamaearth Kajal",
"Kay Beauty Kajal","Chambor Kajal","Kiro Kajal",
"Lotus Kajal","Biotique Kajal","Himalaya Kajal",
"Patanjali Kajal","Blue Heaven Kajal",
"Color Essence Kajal","Oriflame Kajal","Avon Kajal",
"PAC Kajal","Forever52 Kajal","Mars Kajal",
"Makeup Revolution Kajal","Estee Lauder Kajal",
"Clinique Kajal","Smashbox Kajal",
"Charlotte Tilbury Kajal","Anastasia Kajal",
"Lakme Eyeconic Kajal","Maybelline Colossal Kajal"};
	 return kajalBrands ;
	 }
	 
	 if(productName == "nailPolish"){
	 String nailPolishBrands[] = {"Lakme Nail Polish","Maybelline Nail Polish","L'Oreal Nail Polish",
"Colorbar Nail Polish","Faces Canada Nail Polish",
"Swiss Beauty Nail Polish","Insight Nail Polish",
"Elle 18 Nail Polish","Revlon Nail Polish",
"Nykaa Nail Polish","Sugar Nail Polish",
"Plum Nail Polish","Mamaearth Nail Polish",
"Kay Beauty Nail Polish","Chambor Nail Polish",
"Kiro Nail Polish","Blue Heaven Nail Polish",
"Color Essence Nail Polish","Oriflame Nail Polish",
"Avon Nail Polish","PAC Nail Polish",
"Forever52 Nail Polish","Mars Nail Polish",
"Makeup Revolution Nail Polish",
"Estee Lauder Nail Polish","Clinique Nail Polish",
"Smashbox Nail Polish","Charlotte Tilbury Nail Polish",
"Anastasia Nail Polish","Nykaa Matte Nail Polish",
"Lakme 9to5 Nail Color","Maybelline Color Show",
"Revlon Gel Envy","Colorbar Quick Finish",
"Faces Splash Nail Color","Swiss Beauty Gel",
"Insight Gel Nail Paint"};
	 return nailPolishBrands ;
	 }
	 
	 if(productName == "babyDiaper"){
	 String babyDiaperBrands[] = {"Pampers","Huggies","MamyPoko Pants",
"Little Angel","Supples Baby Diapers",
"Snuggy Baby","Babeehive Diapers",
"Chicco Diapers","Mee Mee Diapers",
"Teddyy Baby Diapers","Himalaya Diapers",
"Patanjali Baby Diapers","Johnson Baby Diapers",
"BB Royal Baby Diapers","MommyPoko",
"Pampers Premium Care","Huggies Wonder Pants",
"MamyPoko Extra Absorb",
"Little Angel Premium",
"Supples Active Baby",
"Snuggy Comfort","Babeehive Premium",
"Chicco Soft Care","Mee Mee Premium",
"Teddyy Soft Pants",
"Himalaya Gentle Baby",
"Pampers All Round",
"Huggies Dry Pants",
"MamyPoko Air Fit",
"Little Angel Soft",
"Supples Super Dry",
"Snuggy Pants","Babeehive Dry Care",
"Chicco Total Protection",
"Mee Mee Dry Care",
"Teddyy Premium","BB Royal Soft Diapers"};
	 return babyDiaperBrands ;
	 }
	 
	 if(productName == "babySoap"){
	 String babySoapBrands[] = {"Johnson Baby Soap","Himalaya Baby Soap","Pigeon Baby Soap",
"Chicco Baby Soap","Mee Mee Baby Soap",
"Dove Baby Soap","Sebamed Baby Soap",
"Baby Dove Soap","Patanjali Baby Soap",
"Mothercare Baby Soap","Cetaphil Baby Soap",
"Biotique Baby Soap","Mamaearth Baby Soap",
"Khadi Baby Soap","BB Royal Baby Soap",
"Little Angel Baby Soap","Supples Baby Soap",
"Snuggy Baby Soap","Babeehive Baby Soap",
"Johnson Milk Soap","Himalaya Gentle Baby",
"Chicco Pure Soap","Mee Mee Mild Soap",
"Dove Rich Baby Soap","Sebamed Gentle Soap",
"Baby Dove Sensitive","Patanjali Shishu Soap",
"Mothercare Mild Soap","Cetaphil Gentle Baby",
"Biotique Bio Baby Soap",
"Mamaearth Moisturizing Soap",
"Khadi Herbal Baby Soap",
"Little Angel Soft Soap",
"Supples Gentle Soap",
"Snuggy Soft Baby Soap",
"Babeehive Mild Soap",
"BB Royal Gentle Soap"};
	 return babySoapBrands ;
	 }
	 
	 if(productName == "babyShampoo"){
	 String babyShampooBrands[] = {"Johnson Baby Shampoo","Himalaya Baby Shampoo",
"Chicco Baby Shampoo","Mee Mee Baby Shampoo",
"Dove Baby Shampoo","Sebamed Baby Shampoo",
"Patanjali Baby Shampoo","Mothercare Baby Shampoo",
"Cetaphil Baby Shampoo","Biotique Baby Shampoo",
"Mamaearth Baby Shampoo","Khadi Baby Shampoo",
"Little Angel Baby Shampoo","Supples Baby Shampoo",
"Snuggy Baby Shampoo","Babeehive Baby Shampoo",
"BB Royal Baby Shampoo","Johnson No More Tears",
"Himalaya Gentle Baby Shampoo",
"Chicco No Tears Shampoo",
"Mee Mee Mild Shampoo",
"Dove Rich Baby Shampoo",
"Sebamed Gentle Wash",
"Patanjali Shishu Shampoo",
"Mothercare Mild Shampoo",
"Cetaphil Gentle Baby Wash",
"Biotique Bio Apple Shampoo",
"Mamaearth Gentle Cleansing",
"Khadi Herbal Baby Shampoo",
"Little Angel Soft Shampoo",
"Supples Gentle Shampoo",
"Snuggy Soft Baby Shampoo",
"Babeehive Mild Shampoo",
"BB Royal Gentle Shampoo",
"Johnson Active Kids",
"Himalaya Extra Mild",
"Dove Sensitive Baby Shampoo"};
	 return babyShampooBrands ;
	 }
	 
	 if(productName == "babyLotion"){
	 String babyLotionBrands[] = {"Johnson Baby Lotion","Himalaya Baby Lotion",
"Chicco Baby Lotion","Mee Mee Baby Lotion",
"Dove Baby Lotion","Sebamed Baby Lotion",
"Patanjali Baby Lotion","Mothercare Baby Lotion",
"Cetaphil Baby Lotion","Biotique Baby Lotion",
"Mamaearth Baby Lotion","Khadi Baby Lotion",
"Little Angel Baby Lotion","Supples Baby Lotion",
"Snuggy Baby Lotion","Babeehive Baby Lotion",
"BB Royal Baby Lotion","Johnson Milk Lotion",
"Himalaya Gentle Baby Lotion",
"Chicco Moisturizing Lotion",
"Mee Mee Mild Lotion",
"Dove Rich Baby Lotion",
"Sebamed Moisturizing Lotion",
"Patanjali Shishu Lotion",
"Mothercare Soft Lotion",
"Cetaphil Gentle Baby Lotion",
"Biotique Bio Almond Lotion",
"Mamaearth Nourishing Lotion",
"Khadi Herbal Baby Lotion",
"Little Angel Soft Lotion",
"Supples Gentle Lotion",
"Snuggy Soft Baby Lotion",
"Babeehive Mild Lotion",
"BB Royal Gentle Lotion",
"Johnson Active Kids Lotion",
"Himalaya Extra Soft",
"Dove Sensitive Baby Lotion"};
	 return babyLotionBrands ;
	 }
	 
	  if(productName == "tissuePaper"){
	 String tissuePaperBrands[] = {"Origami Tissue","Premier Tissue","Selpak Tissue",
"Fresh Ones Tissue","Bella Tissue",
"Soft n Cool Tissue","Kleenex Tissue",
"Presto Tissue","Pee Safe Tissue",
"BB Royal Tissue","Origami Soft Tissue",
"Premier Ultra Soft","Selpak Premium",
"Fresh Ones Ultra","Bella Soft Tissue",
"Soft n Cool Premium",
"Kleenex Ultra Soft",
"Presto Kitchen Tissue",
"Pee Safe Pocket Tissue",
"BB Royal Premium Tissue",
"Origami Toilet Tissue",
"Premier Toilet Roll",
"Selpak Toilet Roll",
"Fresh Ones Toilet Roll",
"Bella Toilet Tissue",
"Soft n Cool Toilet Roll",
"Kleenex Toilet Roll",
"Presto Toilet Paper",
"Pee Safe Hygiene Tissue",
"BB Royal Toilet Paper",
"Origami Facial Tissue",
"Premier Facial Tissue",
"Selpak Facial Tissue",
"Fresh Ones Facial Tissue",
"Bella Facial Tissue",
"Soft n Cool Facial Tissue",
"Kleenex Facial Tissue"};
	 return tissuePaperBrands ;
	 }
	 
	 if(productName == "napkin"){
	 String napkinBrands[] = {"Origami Napkin","Premier Napkin","Selpak Napkin",
"Fresh Ones Napkin","Bella Napkin",
"Soft n Cool Napkin","Kleenex Napkin",
"Presto Napkin","Pee Safe Napkin",
"BB Royal Napkin","Origami Table Napkin",
"Premier Paper Napkin","Selpak Table Napkin",
"Fresh Ones Dinner Napkin",
"Bella Soft Napkin",
"Soft n Cool Table Napkin",
"Kleenex Dinner Napkin",
"Presto Kitchen Napkin",
"Pee Safe Hygiene Napkin",
"BB Royal Table Napkin",
"Origami Tissue Napkin",
"Premier Disposable Napkin",
"Selpak Disposable Napkin",
"Fresh Ones Party Napkin",
"Bella Party Napkin",
"Soft n Cool Party Napkin",
"Kleenex Party Napkin",
"Presto Party Napkin",
"Pee Safe Disposable Napkin",
"BB Royal Disposable Napkin",
"Origami Premium Napkin",
"Premier Premium Napkin",
"Selpak Premium Napkin",
"Fresh Ones Premium Napkin",
"Bella Premium Napkin",
"Soft n Cool Premium Napkin",
"Kleenex Premium Napkin"};
	 return napkinBrands ;
	 }
	 
	 if(productName == "sanitaryPad"){
	 String sanitaryPadBrands[] = {"Whisper","Stayfree","Sofyx","Bella Pads","Nua Pads",
"Paree Pads","Carmesi Pads","Azah Pads","Everteen Pads",
"SheCup Pads","Pee Safe Pads","Plush Pads",
"Sofy Bodyfit","Whisper Ultra","Stayfree Secure",
"Stayfree Dry Max","Sofyx XL","Bella Cotton Pads",
"Nua Ultra Thin","Paree Super Soft",
"Carmesi Natural Pads","Azah Herbal Pads",
"Everteen Cotton Pads","Pee Safe Organic Pads",
"Plush Organic Pads","Whisper Choice",
"Stayfree All Night","Sofy Antibacteria",
"Bella Maxi Pads","Nua Overnight Pads",
"Paree Overnight","Carmesi XL",
"Azah Overnight","Everteen XL",
"Pee Safe XL","Whisper XL Plus",
"Stayfree XL Secure"};
	 return sanitaryPadBrands ;
	 }
	 
	 if(productName == "energyDrink"){
	 String energyDrinkBrands[] = {"Red Bull","Monster Energy","Sting",
"Gatorade","Glucon D","Enerzal",
"Cloud 9","Tzinga","XLR8",
"Fast&Up","Paper Boat Energy",
"Power Horse","Hell Energy",
"Red Bull Sugarfree","Monster Ultra",
"Sting Gold","Gatorade Orange",
"Glucon D Tangy","Enerzal Electrolyte",
"Cloud 9 Sparkling","Tzinga Classic",
"XLR8 Energy Shot","Fast&Up Reload",
"Power Horse Classic","Hell Classic",
"Red Bull Blue Edition",
"Monster Mango Loco",
"Sting Berry Blast",
"Gatorade Lemon",
"Glucon D Orange",
"Enerzal Orange",
"Cloud 9 Lemon",
"Tzinga Lime",
"XLR8 Power Drink",
"Fast&Up Energy",
"Power Horse Gold",
"Hell Red Grape"};
	 return energyDrinkBrands ;
	 }
	 
	 if(productName == "cornflakes"){
	 String cornflakesBrands[] = {"Kellogg's Cornflakes","Bagrry's Cornflakes",
"Nestle Cornflakes","Patanjali Cornflakes",
"Yoga Bar Cornflakes","MTR Cornflakes",
"24 Mantra Cornflakes","BB Royal Cornflakes",
"Natureland Cornflakes","Quaker Cornflakes",
"Kellogg's Original","Kellogg's Honey",
"Bagrry's Crunchy","Nestle Gold",
"Patanjali Honey Cornflakes",
"Yoga Bar Multigrain",
"MTR Classic Cornflakes",
"24 Mantra Organic",
"BB Royal Classic",
"Natureland Organic",
"Quaker Honey Cornflakes",
"Kellogg's Chocos",
"Kellogg's Special K",
"Bagrry's Oats & Corn",
"Nestle Honey Gold",
"Patanjali Crunchy",
"Yoga Bar Superfood",
"MTR Honey Cornflakes",
"24 Mantra Multigrain",
"BB Royal Honey",
"Natureland Honey",
"Quaker Classic",
"Kellogg's Strawberry",
"Bagrry's Nutty",
"Nestle Cornflakes Gold",
"Patanjali Multigrain",
"Yoga Bar Crunchy"};
	 return cornflakesBrands ;
	 }
	 
	 if(productName == "oats"){
	 String oatsBrands[] = {"Quaker Oats","Saffola Oats",
"Bagrry's Oats","Kellogg's Oats",
"Patanjali Oats","Yoga Bar Oats",
"24 Mantra Oats","BB Royal Oats",
"Natureland Oats","MTR Oats",
"Quaker Quick Oats","Saffola Masala Oats",
"Bagrry's White Oats","Kellogg's Quick Oats",
"Patanjali Rolled Oats",
"Yoga Bar Steel Cut",
"24 Mantra Organic Oats",
"BB Royal Rolled Oats",
"Natureland Organic Oats",
"MTR Instant Oats",
"Quaker Multigrain Oats",
"Saffola Plain Oats",
"Bagrry's Multigrain",
"Kellogg's Steel Cut",
"Patanjali Multigrain Oats",
"Yoga Bar Instant Oats",
"24 Mantra Steel Cut",
"BB Royal Quick Oats",
"Natureland Steel Cut",
"MTR Masala Oats",
"Quaker Instant Oats",
"Saffola Classic Oats",
"Bagrry's Oats Bran",
"Kellogg's Oats Bran",
"Patanjali Oats Bran",
"Yoga Bar Rolled Oats",
"24 Mantra Oats Bran"};
	 return oatsBrands ;
	 }
	 
	 if(productName == "peanutButter"){
	 String peanutButterBrands[] = {"Pintola Peanut Butter","Alpino Peanut Butter",
"Dr Oetker Peanut Butter","Sundrop Peanut Butter",
"MyFitness Peanut Butter","Yoga Bar Peanut Butter",
"Happy Jars Peanut Butter","Butternut Co Peanut Butter",
"MuscleBlaze Peanut Butter","AS IT IS Peanut Butter",
"Pintola Crunchy","Alpino Crunchy",
"Dr Oetker Funfoods","Sundrop Crunchy",
"MyFitness Chocolate Peanut Butter",
"Yoga Bar Crunchy",
"Happy Jars Classic",
"Butternut Co Classic",
"MuscleBlaze High Protein",
"AS IT IS Natural",
"Pintola Creamy",
"Alpino Creamy",
"Dr Oetker Creamy",
"Sundrop Creamy",
"MyFitness Natural",
"Yoga Bar Natural",
"Happy Jars Chocolate",
"Butternut Co Crunchy",
"MuscleBlaze Natural",
"AS IT IS Crunchy",
"Pintola Unsweetened",
"Alpino Unsweetened",
"Sundrop Natural",
"MyFitness Unsweetened",
"Yoga Bar Dark Chocolate",
"Happy Jars Unsweetened",
"Butternut Co Dark Chocolate"};
	 return peanutButterBrands ;
	 }
	 
	 if(productName == "pickle"){
	 String pickleBrands[] = {"Mother's Recipe Pickle","Priya Pickle","Aachi Pickle",
"MTR Pickle","Patanjali Pickle","Eastern Pickle",
"Nilons Pickle","Bedekar Pickle","Double Horse Pickle",
"Udupi Pickle","Vadu Mango Pickle","Annapurna Pickle",
"24 Mantra Pickle","BB Royal Pickle","Natureland Pickle",
"Mother's Recipe Mango","Priya Lime Pickle",
"Aachi Mango Pickle","MTR Mixed Pickle",
"Patanjali Mango Pickle","Eastern Lime Pickle",
"Nilons Mixed Pickle","Bedekar Mango Pickle",
"Double Horse Lime Pickle","Udupi Garlic Pickle",
"Vadu Mango Special","Annapurna Lime Pickle",
"24 Mantra Organic Pickle","BB Royal Mango Pickle",
"Natureland Organic Pickle","Mother's Recipe Garlic",
"Priya Gongura Pickle","Aachi Lemon Pickle",
"MTR Avakai","Patanjali Lemon Pickle",
"Eastern Mango Pickle","Nilons Lemon Pickle"};
	 return pickleBrands ;
	 }
	 
	 if(productName == "papad"){
	 String papadBrands[] = {"Lijjat Papad","Aashirvaad Papad","Haldiram's Papad",
"Shri Mahila Papad","Patanjali Papad","MTR Papad",
"Annapurna Papad","BB Royal Papad","24 Mantra Papad",
"Natureland Papad","Double Horse Papad",
"Urad Papad Lijjat","Aashirvaad Urad Papad",
"Haldiram's Moong Papad",
"Shri Mahila Jeera Papad",
"Patanjali Moong Papad",
"MTR Appalam","Annapurna Moong Papad",
"BB Royal Urad Papad",
"24 Mantra Organic Papad",
"Natureland Organic Papad",
"Double Horse Appalam",
"Lijjat Punjabi Papad",
"Aashirvaad Punjabi Papad",
"Haldiram's Masala Papad",
"Shri Mahila Masala Papad",
"Patanjali Punjabi Papad",
"MTR Punjabi Papad",
"Annapurna Masala Papad",
"BB Royal Masala Papad",
"24 Mantra Masala Papad",
"Natureland Masala Papad",
"Double Horse Urad Papad",
"Lijjat Garlic Papad",
"Aashirvaad Garlic Papad",
"Haldiram's Garlic Papad",
"Patanjali Garlic Papad"};
	 return papadBrands ;
	 }
	 
	 if(productName == "vermicelli"){
	 String vermicelliBrands[] = {"Bambino Vermicelli","MTR Vermicelli",
"Double Horse Vermicelli","Annapurna Vermicelli",
"BB Royal Vermicelli","24 Mantra Vermicelli",
"Natureland Vermicelli","Aashirvaad Vermicelli",
"Patanjali Vermicelli","Roopak Vermicelli",
"Bambino Roasted Vermicelli",
"MTR Roasted Vermicelli",
"Double Horse Roasted",
"Annapurna Roasted",
"BB Royal Roasted",
"24 Mantra Organic Vermicelli",
"Natureland Organic Vermicelli",
"Aashirvaad Roasted",
"Patanjali Roasted",
"Roopak Roasted",
"Bambino Thin Vermicelli",
"MTR Thin Vermicelli",
"Double Horse Thin",
"Annapurna Thin",
"BB Royal Thin",
"24 Mantra Thin",
"Natureland Thin",
"Aashirvaad Thin",
"Patanjali Thin",
"Bambino Semiya",
"MTR Semiya",
"Double Horse Semiya",
"Annapurna Semiya",
"BB Royal Semiya",
"24 Mantra Semiya",
"Natureland Semiya",
"Aashirvaad Semiya"};
	 return vermicelliBrands ;
	 }
	 
	 if(productName == "suji"){
	 String sujiBrands[] = {"Aashirvaad Suji","Annapurna Suji","BB Royal Suji",
"24 Mantra Suji","Natureland Suji",
"Patanjali Suji","MTR Suji",
"Double Horse Suji","Shakti Bhog Suji",
"Rajdhani Suji","Golden Harvest Suji",
"Aashirvaad Roasted Suji",
"Annapurna Roasted Suji",
"BB Royal Roasted Suji",
"24 Mantra Organic Suji",
"Natureland Organic Suji",
"Patanjali Roasted Suji",
"MTR Roasted Suji",
"Double Horse Roasted",
"Shakti Bhog Roasted",
"Rajdhani Roasted",
"Golden Harvest Roasted",
"Aashirvaad Fine Suji",
"Annapurna Fine Suji",
"BB Royal Fine Suji",
"24 Mantra Fine Suji",
"Natureland Fine Suji",
"Patanjali Fine Suji",
"MTR Fine Suji",
"Double Horse Fine",
"Shakti Bhog Fine",
"Rajdhani Fine",
"Golden Harvest Fine",
"Aashirvaad Premium Suji",
"Annapurna Premium",
"BB Royal Premium",
"24 Mantra Premium"};
	 return sujiBrands ;
	 }
	 
	 if(productName == "besan"){
	 String besanBrands[] = {"Aashirvaad Besan","Annapurna Besan",
"BB Royal Besan","24 Mantra Besan",
"Natureland Besan","Patanjali Besan",
"MTR Besan","Shakti Bhog Besan",
"Rajdhani Besan","Golden Harvest Besan",
"Organic Tattva Besan",
"Aashirvaad Premium Besan",
"Annapurna Premium Besan",
"BB Royal Premium Besan",
"24 Mantra Organic Besan",
"Natureland Organic Besan",
"Patanjali Premium Besan",
"MTR Premium Besan",
"Shakti Bhog Premium Besan",
"Rajdhani Premium Besan",
"Golden Harvest Premium Besan",
"Organic Tattva Premium",
"Aashirvaad Fine Besan",
"Annapurna Fine Besan",
"BB Royal Fine Besan",
"24 Mantra Fine Besan",
"Natureland Fine Besan",
"Patanjali Fine Besan",
"MTR Fine Besan",
"Shakti Bhog Fine Besan",
"Rajdhani Fine Besan",
"Golden Harvest Fine Besan",
"Organic Tattva Fine",
"Aashirvaad Gram Flour",
"Annapurna Gram Flour",
"BB Royal Gram Flour",
"Patanjali Gram Flour"
};
	 return besanBrands ;
	 }
	 
	 if(productName == "turmeric"){
	 String turmericBrands[] = {"Everest Turmeric","MDH Turmeric","Catch Turmeric",
"Ramdev Turmeric","Aashirvaad Turmeric",
"Patanjali Turmeric","Eastern Turmeric",
"MTR Turmeric","Badshah Turmeric",
"24 Mantra Turmeric","BB Royal Turmeric",
"Natureland Turmeric","Organic Tattva Turmeric",
"Everest Haldi Powder","MDH Haldi",
"Catch Haldi","Ramdev Haldi",
"Aashirvaad Haldi","Patanjali Haldi",
"Eastern Haldi","MTR Haldi",
"Badshah Haldi","24 Mantra Organic Haldi",
"BB Royal Organic Haldi",
"Natureland Organic Haldi",
"Organic Tattva Haldi",
"Everest Lakadong Haldi",
"MDH Premium Haldi",
"Catch Premium Haldi",
"Ramdev Premium Haldi",
"Aashirvaad Premium Haldi",
"Patanjali Premium Haldi",
"Eastern Premium Haldi",
"MTR Premium Haldi",
"Badshah Premium Haldi",
"24 Mantra Lakadong",
"BB Royal Lakadong"};
	 return turmericBrands ;
	 }
	 
	 if(productName == "chilliPowder"){
	 String chilliPowderBrands[] = {"Everest Chilli Powder","MDH Chilli Powder",
"Catch Chilli Powder","Ramdev Chilli Powder",
"Aashirvaad Chilli Powder","Patanjali Chilli Powder",
"Eastern Chilli Powder","MTR Chilli Powder",
"Badshah Chilli Powder","24 Mantra Chilli Powder",
"BB Royal Chilli Powder","Natureland Chilli Powder",
"Organic Tattva Chilli Powder",
"Everest Red Chilli","MDH Lal Mirch",
"Catch Lal Mirch","Ramdev Lal Mirch",
"Aashirvaad Lal Mirch","Patanjali Lal Mirch",
"Eastern Lal Mirch","MTR Lal Mirch",
"Badshah Lal Mirch",
"24 Mantra Organic Chilli",
"BB Royal Organic Chilli",
"Natureland Organic Chilli",
"Organic Tattva Organic Chilli",
"Everest Kashmiri Mirch",
"MDH Kashmiri Mirch",
"Catch Kashmiri Mirch",
"Ramdev Kashmiri Mirch",
"Aashirvaad Kashmiri Mirch",
"Patanjali Kashmiri Mirch",
"Eastern Kashmiri Mirch",
"MTR Kashmiri Mirch",
"Badshah Kashmiri Mirch",
"24 Mantra Kashmiri",
"BB Royal Kashmiri"};
	 return chilliPowderBrands ;
	 }
	 
	 if(productName == "garamMasala"){
	 String garamMasalaBrands[] = {"Everest Garam Masala","MDH Garam Masala",
"Catch Garam Masala","Ramdev Garam Masala",
"Aashirvaad Garam Masala","Patanjali Garam Masala",
"Eastern Garam Masala","MTR Garam Masala",
"Badshah Garam Masala","24 Mantra Garam Masala",
"BB Royal Garam Masala","Natureland Garam Masala",
"Organic Tattva Garam Masala",
"Everest Shahi Garam Masala",
"MDH Shahi Garam Masala",
"Catch Shahi Garam Masala",
"Ramdev Shahi Garam Masala",
"Aashirvaad Shahi Garam Masala",
"Patanjali Shahi Garam Masala",
"Eastern Shahi Garam Masala",
"MTR Shahi Garam Masala",
"Badshah Shahi Garam Masala",
"24 Mantra Organic Garam Masala",
"BB Royal Organic Garam Masala",
"Natureland Organic Garam Masala",
"Organic Tattva Organic Garam Masala",
"Everest Premium Garam Masala",
"MDH Premium Garam Masala",
"Catch Premium Garam Masala",
"Ramdev Premium Garam Masala",
"Aashirvaad Premium Garam Masala",
"Patanjali Premium Garam Masala",
"Eastern Premium Garam Masala",
"MTR Premium Garam Masala",
"Badshah Premium Garam Masala",
"24 Mantra Premium",
"BB Royal Premium"};
	 return garamMasalaBrands ;
	 }
	 
	 if(productName == "corianderPowder"){
	 String corianderPowderBrands[] = {"Everest Coriander Powder","MDH Coriander Powder",
"Catch Coriander Powder","Ramdev Coriander Powder",
"Aashirvaad Coriander Powder","Patanjali Coriander Powder",
"Eastern Coriander Powder","MTR Coriander Powder",
"Badshah Coriander Powder","24 Mantra Coriander Powder",
"BB Royal Coriander Powder","Natureland Coriander Powder",
"Organic Tattva Coriander Powder",
"Everest Dhania Powder","MDH Dhania Powder",
"Catch Dhania Powder","Ramdev Dhania Powder",
"Aashirvaad Dhania Powder","Patanjali Dhania Powder",
"Eastern Dhania Powder","MTR Dhania Powder",
"Badshah Dhania Powder",
"24 Mantra Organic Dhania",
"BB Royal Organic Dhania",
"Natureland Organic Dhania",
"Organic Tattva Organic Dhania",
"Everest Premium Dhania",
"MDH Premium Dhania",
"Catch Premium Dhania",
"Ramdev Premium Dhania",
"Aashirvaad Premium Dhania",
"Patanjali Premium Dhania",
"Eastern Premium Dhania",
"MTR Premium Dhania",
"Badshah Premium Dhania",
"24 Mantra Premium Dhania",
"BB Royal Premium Dhania"};
	 return corianderPowderBrands ;
	 }
	 
	 if(productName == "cuminSeeds"){
	 String cuminSeedsBrands[] = {"Everest Cumin","MDH Cumin",
"Catch Cumin","Ramdev Cumin",
"Aashirvaad Cumin","Patanjali Cumin",
"Eastern Cumin","MTR Cumin",
"Badshah Cumin","24 Mantra Cumin",
"BB Royal Cumin","Natureland Cumin",
"Organic Tattva Cumin",
"Everest Jeera","MDH Jeera",
"Catch Jeera","Ramdev Jeera",
"Aashirvaad Jeera","Patanjali Jeera",
"Eastern Jeera","MTR Jeera",
"Badshah Jeera",
"24 Mantra Organic Jeera",
"BB Royal Organic Jeera",
"Natureland Organic Jeera",
"Organic Tattva Organic Jeera",
"Everest Premium Jeera",
"MDH Premium Jeera",
"Catch Premium Jeera",
"Ramdev Premium Jeera",
"Aashirvaad Premium Jeera",
"Patanjali Premium Jeera",
"Eastern Premium Jeera",
"MTR Premium Jeera",
"Badshah Premium Jeera",
"24 Mantra Premium Jeera",
"BB Royal Premium Jeera"};
	 return cuminSeedsBrands ;
	 }
	 
	 if(productName == "mustardSeeds"){
	 String mustardSeedsBrands[] = {"Everest Mustard","MDH Mustard",
"Catch Mustard","Ramdev Mustard",
"Aashirvaad Mustard","Patanjali Mustard",
"Eastern Mustard","MTR Mustard",
"Badshah Mustard","24 Mantra Mustard",
"BB Royal Mustard","Natureland Mustard",
"Organic Tattva Mustard",
"Everest Rai","MDH Rai",
"Catch Rai","Ramdev Rai",
"Aashirvaad Rai","Patanjali Rai",
"Eastern Rai","MTR Rai",
"Badshah Rai",
"24 Mantra Organic Rai",
"BB Royal Organic Rai",
"Natureland Organic Rai",
"Organic Tattva Organic Rai",
"Everest Premium Rai",
"MDH Premium Rai",
"Catch Premium Rai",
"Ramdev Premium Rai",
"Aashirvaad Premium Rai",
"Patanjali Premium Rai",
"Eastern Premium Rai",
"MTR Premium Rai",
"Badshah Premium Rai",
"24 Mantra Premium Rai",
"BB Royal Premium Rai"};
	 return mustardSeedsBrands ;
	 }
	 
	 if(productName == "ghee"){
	 String gheeBrands[] = {"Amul Ghee","Nandini Ghee",
"Mother Dairy Ghee","Patanjali Ghee",
"Aashirvaad Ghee","Gowardhan Ghee",
"Annapurna Ghee","BB Royal Ghee",
"24 Mantra Ghee","Natureland Ghee",
"Organic Tattva Ghee","Heritage Ghee",
"Milky Mist Ghee","Dodla Ghee",
"Verka Ghee","Sanchi Ghee",
"Warana Ghee","Hatsun Ghee",
"Sudha Ghee","Saras Ghee",
"Akshayakalpa Ghee","Nestle Ghee",
"Prabhat Ghee","Jersey Ghee",
"Nilgiris Ghee","Ananda Ghee",
"Milma Ghee","President Ghee",
"Farm Fresh Ghee","Country Delight Ghee",
"Pure & Sure Ghee","Aavin Ghee",
"Vijaya Ghee","Gokul Ghee",
"Namdhari's Ghee","BB Royal Organic Ghee",
"24 Mantra Organic Ghee"};
	 return gheeBrands ;
	 }
	 
	 if(productName == "paneer"){
	 String paneerBrands[] = {"Amul Paneer","Nandini Paneer",
"Mother Dairy Paneer","Milky Mist Paneer",
"Heritage Paneer","Dodla Paneer",
"Gowardhan Paneer","Annapurna Paneer",
"BB Royal Paneer","24 Mantra Paneer",
"Natureland Paneer","Organic Tattva Paneer",
"Verka Paneer","Sanchi Paneer",
"Warana Paneer","Hatsun Paneer",
"Sudha Paneer","Saras Paneer",
"Akshayakalpa Paneer","Nestle Paneer",
"Prabhat Paneer","Jersey Paneer",
"Nilgiris Paneer","Ananda Paneer",
"Milma Paneer","President Paneer",
"Farm Fresh Paneer","Country Delight Paneer",
"Pure & Sure Paneer","Aavin Paneer",
"Vijaya Paneer","Gokul Paneer",
"Namdhari's Paneer","BB Royal Organic Paneer",
"24 Mantra Organic Paneer",
"Amul Fresh Paneer","Milky Mist Fresh Paneer"};
	 return paneerBrands ;
	 }
	 
	 if(productName == "yogurt"){
	 String yogurtBrands[] = {"Amul Yogurt","Nandini Yogurt",
"Mother Dairy Yogurt","Milky Mist Yogurt",
"Heritage Yogurt","Dodla Yogurt",
"Gowardhan Yogurt","Annapurna Yogurt",
"BB Royal Yogurt","24 Mantra Yogurt",
"Natureland Yogurt","Organic Tattva Yogurt",
"Verka Yogurt","Sanchi Yogurt",
"Warana Yogurt","Hatsun Yogurt",
"Sudha Yogurt","Saras Yogurt",
"Akshayakalpa Yogurt","Nestle Yogurt",
"Prabhat Yogurt","Jersey Yogurt",
"Nilgiris Yogurt","Ananda Yogurt",
"Milma Yogurt","President Yogurt",
"Farm Fresh Yogurt","Country Delight Yogurt",
"Pure & Sure Yogurt","Aavin Yogurt",
"Vijaya Yogurt","Gokul Yogurt",
"Namdhari's Yogurt","Epigamia Yogurt",
"Danone Yogurt","Amul Greek Yogurt",
"Epigamia Greek Yogurt"};
	 return yogurtBrands ;
	 }
	 
	 if(productName == "frozenPeas"){
	 String frozenPeasBrands[] = {"Safal Frozen Peas","McCain Frozen Peas",
"ITC Master Chef Peas","Godrej Yummiez Peas",
"Al Kabeer Peas","Venky's Peas",
"Amul Frozen Peas","Mother Dairy Peas",
"Heritage Frozen Peas","Milky Mist Peas",
"BB Royal Frozen Peas","24 Mantra Frozen Peas",
"Natureland Frozen Peas","Organic Tattva Frozen Peas",
"Sumeru Peas","Ardo Peas",
"Al Kabeer Green Peas","McCain Green Peas",
"Safal Green Peas","ITC Green Peas",
"Godrej Green Peas","Venky's Green Peas",
"Amul Green Peas","Mother Dairy Green Peas",
"BB Royal Green Peas","24 Mantra Organic Peas",
"Natureland Organic Peas","Organic Tattva Organic Peas",
"Sumeru Green Peas","Ardo Green Peas",
"Safal Premium Peas","McCain Premium Peas",
"ITC Premium Peas","Godrej Premium Peas",
"Venky's Premium Peas","Amul Premium Peas",
"Mother Dairy Premium Peas"};
	 return frozenPeasBrands ;
	 }
	 
	 if(productName == "frozenCorn"){
	 String frozenCornBrands[] = {"Safal Frozen Corn","McCain Frozen Corn",
"ITC Master Chef Corn","Godrej Yummiez Corn",
"Al Kabeer Corn","Venky's Corn",
"Amul Frozen Corn","Mother Dairy Corn",
"Heritage Frozen Corn","Milky Mist Corn",
"BB Royal Frozen Corn","24 Mantra Frozen Corn",
"Natureland Frozen Corn","Organic Tattva Frozen Corn",
"Sumeru Corn","Ardo Corn",
"Al Kabeer Sweet Corn","McCain Sweet Corn",
"Safal Sweet Corn","ITC Sweet Corn",
"Godrej Sweet Corn","Venky's Sweet Corn",
"Amul Sweet Corn","Mother Dairy Sweet Corn",
"BB Royal Sweet Corn","24 Mantra Organic Corn",
"Natureland Organic Corn","Organic Tattva Organic Corn",
"Sumeru Sweet Corn","Ardo Sweet Corn",
"Safal Premium Corn","McCain Premium Corn",
"ITC Premium Corn","Godrej Premium Corn",
"Venky's Premium Corn","Amul Premium Corn",
"Mother Dairy Premium Corn"};
	 return frozenCornBrands ;
	 }
	 
	 if(productName == "pizzaBase"){
	 String pizzaBaseBrands[] = {"Britannia Pizza Base","English Oven Pizza Base",
"Harvest Gold Pizza Base","Modern Pizza Base",
"Fresho Pizza Base","Nilgiris Pizza Base",
"Spencer's Pizza Base","Bonn Pizza Base",
"La Americana Pizza Base","Oroweat Pizza Base",
"BB Royal Pizza Base","24 Mantra Pizza Base",
"Natureland Pizza Base","Organic Tattva Pizza Base",
"Britannia Multigrain Base","English Oven Whole Wheat",
"Harvest Gold Brown Base","Modern Whole Wheat",
"Fresho Thin Crust","Nilgiris Multigrain",
"Bonn Thin Crust","La Americana Brown",
"Oroweat Multigrain Base","BB Royal Thin Base",
"24 Mantra Organic Base","Natureland Organic Base",
"Organic Tattva Whole Wheat",
"Britannia Classic Base","English Oven Classic",
"Harvest Gold Classic","Modern Classic",
"Fresho Classic","Nilgiris Classic",
"Bonn Classic","La Americana Classic",
"Oroweat Classic","BB Royal Classic"};
	 return pizzaBaseBrands ;
	 }
	 
	 if(productName == "mayonnaise"){
	 String mayonnaiseBrands[] = {"Veeba Mayonnaise","Del Monte Mayonnaise",
"Dr Oetker Mayonnaise","Funfoods Mayonnaise",
"American Garden Mayonnaise","Heinz Mayonnaise",
"Urban Platter Mayonnaise","Wingreens Mayonnaise",
"BB Royal Mayonnaise","24 Mantra Mayonnaise",
"Natureland Mayonnaise","Organic Tattva Mayonnaise",
"Veeba Eggless Mayo","Del Monte Eggless",
"Dr Oetker Veg Mayo","Funfoods Veg Mayo",
"American Garden Classic",
"Heinz Classic Mayo",
"Urban Platter Garlic Mayo",
"Wingreens Mint Mayo",
"BB Royal Classic Mayo",
"24 Mantra Organic Mayo",
"Natureland Organic Mayo",
"Organic Tattva Organic Mayo",
"Veeba Tandoori Mayo",
"Del Monte Mint Mayo",
"Dr Oetker Chipotle Mayo",
"Funfoods Sandwich Spread",
"American Garden Garlic Mayo",
"Heinz Garlic Mayo",
"Urban Platter Classic",
"Wingreens Classic Mayo",
"BB Royal Eggless Mayo",
"Veeba Cheese Mayo",
"Del Monte Cheese Mayo",
"Dr Oetker Cheese Mayo",
"Funfoods Cheese Spread"};
	 return mayonnaiseBrands ;
	 }
	 
	 if(productName == "vinegar"){
	 String vinegarBrands[] = {"American Garden Vinegar","Del Monte Vinegar",
"Weikfield Vinegar","Urban Platter Vinegar",
"BB Royal Vinegar","24 Mantra Vinegar",
"Natureland Vinegar","Organic Tattva Vinegar",
"Keya Vinegar","Veeba Vinegar",
"American Garden White Vinegar",
"Del Monte White Vinegar",
"Weikfield White Vinegar",
"Urban Platter Apple Cider",
"BB Royal Apple Cider",
"24 Mantra Apple Cider",
"Natureland Apple Cider",
"Organic Tattva Apple Cider",
"Keya Apple Cider",
"Veeba Apple Cider",
"American Garden Malt Vinegar",
"Del Monte Malt Vinegar",
"Weikfield Malt Vinegar",
"Urban Platter Balsamic",
"BB Royal Balsamic",
"24 Mantra Balsamic",
"Natureland Balsamic",
"Organic Tattva Balsamic",
"Keya Balsamic",
"Veeba Balsamic",
"American Garden Synthetic Vinegar",
"Del Monte Synthetic Vinegar",
"Weikfield Synthetic Vinegar",
"Urban Platter Synthetic",
"BB Royal Synthetic",
"24 Mantra Synthetic",
"Natureland Synthetic"};
	 return vinegarBrands ;
	 }
	 
	 if(productName == "bakingPowder"){
	 String bakingPowderBrands[] = {"Weikfield Baking Powder","Urban Platter Baking Powder",
"BB Royal Baking Powder","24 Mantra Baking Powder",
"Natureland Baking Powder","Organic Tattva Baking Powder",
"Keya Baking Powder","Del Monte Baking Powder",
"American Garden Baking Powder",
"Dr Oetker Baking Powder",
"Blue Bird Baking Powder",
"MTR Baking Powder",
"Rajdhani Baking Powder",
"Shakti Bhog Baking Powder",
"Weikfield Premium",
"Urban Platter Premium",
"BB Royal Premium",
"24 Mantra Organic",
"Natureland Organic",
"Organic Tattva Organic",
"Keya Premium",
"Del Monte Premium",
"American Garden Premium",
"Dr Oetker Premium",
"Blue Bird Premium",
"MTR Premium",
"Rajdhani Premium",
"Shakti Bhog Premium",
"Weikfield Double Action",
"Urban Platter Double Action",
"BB Royal Double Action",
"24 Mantra Double Action",
"Natureland Double Action",
"Organic Tattva Double Action",
"Keya Double Action",
"Del Monte Double Action",
"Blue Bird Double Action"};
	 return bakingPowderBrands ;
	 }
	 
	 if(productName == "custardPowder"){
	 String custardPowderBrands[] = {"Weikfield Custard Powder","Brown & Polson Custard",
"Blue Bird Custard Powder","BB Royal Custard",
"24 Mantra Custard Powder","Natureland Custard",
"Organic Tattva Custard Powder","Keya Custard",
"Del Monte Custard Powder","Urban Platter Custard",
"Dr Oetker Custard Powder","MTR Custard Powder",
"Rajdhani Custard Powder","Shakti Bhog Custard",
"Weikfield Vanilla Custard","Brown & Polson Vanilla",
"Blue Bird Vanilla Custard","BB Royal Vanilla",
"24 Mantra Vanilla Custard","Natureland Vanilla",
"Organic Tattva Vanilla","Keya Vanilla Custard",
"Del Monte Vanilla","Urban Platter Vanilla",
"Dr Oetker Vanilla","MTR Vanilla",
"Rajdhani Vanilla","Shakti Bhog Vanilla",
"Weikfield Strawberry Custard",
"Brown & Polson Strawberry",
"Blue Bird Strawberry",
"BB Royal Strawberry",
"24 Mantra Strawberry",
"Natureland Strawberry",
"Organic Tattva Strawberry",
"Keya Strawberry",
"Del Monte Strawberry"};
	 return custardPowderBrands ;
	 }
	 
	 if(productName == "cakeMix"){
	 String cakeMixBrands[] = {"Betty Crocker Cake Mix","Pillsbury Cake Mix",
"Dr Oetker Cake Mix","Weikfield Cake Mix",
"Urban Platter Cake Mix","BB Royal Cake Mix",
"24 Mantra Cake Mix","Natureland Cake Mix",
"Organic Tattva Cake Mix","MTR Cake Mix",
"Rajdhani Cake Mix","Shakti Bhog Cake Mix",
"Betty Crocker Chocolate",
"Pillsbury Chocolate",
"Dr Oetker Chocolate",
"Weikfield Chocolate",
"Urban Platter Chocolate",
"BB Royal Chocolate",
"24 Mantra Chocolate",
"Natureland Chocolate",
"Organic Tattva Chocolate",
"MTR Chocolate",
"Rajdhani Chocolate",
"Shakti Bhog Chocolate",
"Betty Crocker Vanilla",
"Pillsbury Vanilla",
"Dr Oetker Vanilla",
"Weikfield Vanilla",
"Urban Platter Vanilla",
"BB Royal Vanilla",
"24 Mantra Vanilla",
"Natureland Vanilla",
"Organic Tattva Vanilla",
"MTR Vanilla",
"Rajdhani Vanilla",
"Shakti Bhog Vanilla",
"Pillsbury Red Velvet"};
	 return cakeMixBrands ;
	 }
	 
	 if(productName == "greenTea"){
	 String greenTeaBrands[] = {"Tetley Green Tea","Lipton Green Tea",
"Tata Green Tea","Organic India Green Tea",
"24 Mantra Green Tea","Girnar Green Tea",
"Wagh Bakri Green Tea","Society Green Tea",
"Typhoo Green Tea","VAHDAM Green Tea",
"Teabox Green Tea","Twinings Green Tea",
"Tetley Lemon Green","Lipton Honey Green",
"Tata Tulsi Green Tea",
"Organic India Tulsi Green",
"24 Mantra Organic Green",
"Girnar Detox Green",
"Wagh Bakri Honey Green",
"Society Natural Green",
"Typhoo Pure Green",
"VAHDAM Himalayan Green",
"Teabox Classic Green",
"Twinings Pure Green",
"Tetley Mint Green",
"Lipton Mint Green",
"Tata Jasmine Green",
"Organic India Lemon Green",
"24 Mantra Tulsi Green",
"Girnar Mint Green",
"Wagh Bakri Mint Green",
"Society Tulsi Green",
"Typhoo Mint Green",
"VAHDAM Detox Green",
"Teabox Mint Green",
"Twinings Jasmine Green",
"Tata Premium Green Tea"};
	 return greenTeaBrands ;
	 }
	 
	 if(productName == "proteinPowder"){
	 String proteinPowderBrands[] = {"MuscleBlaze Protein","Optimum Nutrition Protein",
"AS IT IS Protein","MyProtein Powder",
"BigMuscles Protein","Labrada Protein",
"Dymatize Protein","Ultimate Nutrition Protein",
"Fast&Up Protein","Herbalife Protein",
"Pintola Protein Powder","Oziva Protein",
"MuscleBlaze Whey","Optimum Nutrition Gold",
"AS IT IS Whey","MyProtein Whey",
"BigMuscles Whey","Labrada Whey",
"Dymatize ISO100","Ultimate Nutrition Whey",
"Fast&Up Whey","Herbalife Formula 1",
"Pintola High Protein",
"Oziva Plant Protein",
"MuscleBlaze Biozyme",
"Optimum Nutrition Serious Mass",
"AS IT IS Mass Gainer",
"MyProtein Mass Gainer",
"BigMuscles Mass Gainer",
"Labrada Mass Gainer",
"Dymatize Elite Whey",
"Ultimate Nutrition Prostar",
"Fast&Up Plant Protein",
"Herbalife Protein Mix",
"Pintola Vegan Protein",
"Oziva Superfood Protein",
"MuscleBlaze Beginner Protein"};
	 return proteinPowderBrands ;
	 }
	 
	 if(productName == "dryFruits"){
	 String dryFruitsBrands[] = {"Happilo Dry Fruits","Nutraj Dry Fruits",
"Vedaka Dry Fruits","Tulsi Dry Fruits",
"BB Royal Dry Fruits","24 Mantra Dry Fruits",
"Natureland Dry Fruits","Organic Tattva Dry Fruits",
"Rostaa Dry Fruits","Farmley Dry Fruits",
"Naturoz Dry Fruits","Urban Platter Dry Fruits",
"Happilo Almonds","Nutraj Almonds",
"Vedaka Almonds","Tulsi Almonds",
"BB Royal Almonds","24 Mantra Almonds",
"Natureland Almonds","Organic Tattva Almonds",
"Rostaa Almonds","Farmley Almonds",
"Naturoz Almonds","Urban Platter Almonds",
"Happilo Cashews","Nutraj Cashews",
"Vedaka Cashews","Tulsi Cashews",
"BB Royal Cashews","24 Mantra Cashews",
"Natureland Cashews","Organic Tattva Cashews",
"Rostaa Cashews","Farmley Cashews",
"Naturoz Cashews","Urban Platter Cashews",
"Happilo Premium Mix"};
	 return dryFruitsBrands ;
	 }
	 
	 if(productName == "almonds"){
	 String almondsBrands[] = {"Happilo Almonds","Nutraj Almonds","Vedaka Almonds",
"Tulsi Almonds","BB Royal Almonds","24 Mantra Almonds",
"Natureland Almonds","Organic Tattva Almonds",
"Rostaa Almonds","Farmley Almonds",
"Naturoz Almonds","Urban Platter Almonds",
"Solimo Almonds","ProV Almonds","Wonderland Almonds",
"True Elements Almonds","SFT Almonds",
"Rostaa California Almonds",
"Happilo California Almonds",
"Nutraj California Almonds",
"Vedaka California Almonds",
"BB Royal Premium Almonds",
"24 Mantra Organic Almonds",
"Natureland Organic Almonds",
"Organic Tattva Organic Almonds",
"Farmley Premium Almonds",
"Naturoz Premium Almonds",
"Urban Platter Premium Almonds",
"Solimo Premium Almonds",
"ProV Premium Almonds",
"True Elements Premium Almonds",
"SFT Premium Almonds",
"Happilo Roasted Almonds",
"Nutraj Roasted Almonds",
"Vedaka Roasted Almonds",
"BB Royal Roasted Almonds",
"Farmley Roasted Almonds"};
	 return almondsBrands ;
	 }
	 
	 if(productName == "cashews"){
	 String cashewsBrands[] = {"Happilo Cashews","Nutraj Cashews","Vedaka Cashews",
"Tulsi Cashews","BB Royal Cashews","24 Mantra Cashews",
"Natureland Cashews","Organic Tattva Cashews",
"Rostaa Cashews","Farmley Cashews",
"Naturoz Cashews","Urban Platter Cashews",
"Solimo Cashews","ProV Cashews","Wonderland Cashews",
"True Elements Cashews","SFT Cashews",
"Rostaa W320 Cashews",
"Happilo W320 Cashews",
"Nutraj W320 Cashews",
"Vedaka W320 Cashews",
"BB Royal Premium Cashews",
"24 Mantra Organic Cashews",
"Natureland Organic Cashews",
"Organic Tattva Organic Cashews",
"Farmley Premium Cashews",
"Naturoz Premium Cashews",
"Urban Platter Premium Cashews",
"Solimo Premium Cashews",
"ProV Premium Cashews",
"True Elements Premium Cashews",
"SFT Premium Cashews",
"Happilo Roasted Cashews",
"Nutraj Roasted Cashews",
"Vedaka Roasted Cashews",
"BB Royal Roasted Cashews",
"Farmley Roasted Cashews"};
	 return cashewsBrands ;
	 }
	 
	 if(productName == "raisins"){
	 String raisinsBrands[] = {"Happilo Raisins","Nutraj Raisins","Vedaka Raisins",
"Tulsi Raisins","BB Royal Raisins","24 Mantra Raisins",
"Natureland Raisins","Organic Tattva Raisins",
"Rostaa Raisins","Farmley Raisins",
"Naturoz Raisins","Urban Platter Raisins",
"Solimo Raisins","ProV Raisins","Wonderland Raisins",
"True Elements Raisins","SFT Raisins",
"Happilo Black Raisins",
"Nutraj Black Raisins",
"Vedaka Black Raisins",
"BB Royal Premium Raisins",
"24 Mantra Organic Raisins",
"Natureland Organic Raisins",
"Organic Tattva Organic Raisins",
"Farmley Premium Raisins",
"Naturoz Premium Raisins",
"Urban Platter Premium Raisins",
"Solimo Premium Raisins",
"ProV Premium Raisins",
"True Elements Premium Raisins",
"SFT Premium Raisins",
"Happilo Golden Raisins",
"Nutraj Golden Raisins",
"Vedaka Golden Raisins",
"BB Royal Golden Raisins",
"Farmley Golden Raisins",
"Naturoz Golden Raisins"};
	 return raisinsBrands ;
	 }
	 
	 if(productName == "dates"){
	 String datesBrands[] = {"Happilo Dates","Nutraj Dates","Vedaka Dates",
"Tulsi Dates","BB Royal Dates","24 Mantra Dates",
"Natureland Dates","Organic Tattva Dates",
"Rostaa Dates","Farmley Dates",
"Naturoz Dates","Urban Platter Dates",
"Solimo Dates","ProV Dates","Wonderland Dates",
"True Elements Dates","SFT Dates",
"Happilo Premium Dates",
"Nutraj Premium Dates",
"Vedaka Premium Dates",
"BB Royal Premium Dates",
"24 Mantra Organic Dates",
"Natureland Organic Dates",
"Organic Tattva Organic Dates",
"Farmley Premium Dates",
"Naturoz Premium Dates",
"Urban Platter Premium Dates",
"Solimo Premium Dates",
"ProV Premium Dates",
"True Elements Premium Dates",
"SFT Premium Dates",
"Happilo Medjool Dates",
"Nutraj Medjool Dates",
"Vedaka Medjool Dates",
"BB Royal Medjool Dates",
"Farmley Medjool Dates",
"Naturoz Medjool Dates"};
	 return datesBrands ;
	 }
	 
	 if(productName == "popcorn"){
	 String popcornBrands[] = {"Act II Popcorn","Weikfield Popcorn",
"Urban Platter Popcorn","BB Royal Popcorn",
"24 Mantra Popcorn","Natureland Popcorn",
"Organic Tattva Popcorn","Pee Safe Popcorn",
"Too Yumm Popcorn","Cornitos Popcorn",
"Act II Butter Popcorn",
"Act II Salted Popcorn",
"Weikfield Butter Popcorn",
"Urban Platter Butter Popcorn",
"BB Royal Butter Popcorn",
"24 Mantra Organic Popcorn",
"Natureland Organic Popcorn",
"Organic Tattva Organic Popcorn",
"Too Yumm Butter Popcorn",
"Cornitos Butter Popcorn",
"Act II Cheese Popcorn",
"Weikfield Cheese Popcorn",
"Urban Platter Cheese Popcorn",
"BB Royal Cheese Popcorn",
"24 Mantra Cheese Popcorn",
"Natureland Cheese Popcorn",
"Organic Tattva Cheese Popcorn",
"Too Yumm Cheese Popcorn",
"Cornitos Cheese Popcorn",
"Act II Microwave Popcorn",
"Weikfield Microwave Popcorn",
"Urban Platter Microwave Popcorn",
"BB Royal Microwave Popcorn",
"24 Mantra Microwave Popcorn",
"Natureland Microwave Popcorn",
"Organic Tattva Microwave Popcorn",
"Too Yumm Microwave Popcorn"};
	 return popcornBrands ;
	 }
	 
	 if(productName == "muesli"){
	 String muesliBrands[] = {"Kellogg's Muesli","Bagrry's Muesli","Yoga Bar Muesli",
"True Elements Muesli","Saffola Muesli",
"24 Mantra Muesli","Natureland Muesli",
"Organic Tattva Muesli","BB Royal Muesli",
"Tata Soulfull Muesli","Nutriorg Muesli",
"RiteBite Muesli","Kellogg's Fruit & Nut",
"Bagrry's Crunchy Muesli",
"Yoga Bar Super Muesli",
"True Elements Fruit Muesli",
"Saffola Crunchy Muesli",
"24 Mantra Organic Muesli",
"Natureland Organic Muesli",
"Organic Tattva Organic Muesli",
"BB Royal Fruit Muesli",
"Tata Soulfull Millet Muesli",
"Nutriorg Premium Muesli",
"RiteBite Protein Muesli",
"Kellogg's Almond & Honey",
"Bagrry's Nut Delight",
"Yoga Bar Dark Chocolate",
"True Elements Chocolate Muesli",
"Saffola No Added Sugar",
"24 Mantra Fruit Muesli",
"Natureland Fruit Muesli",
"Organic Tattva Fruit Muesli",
"BB Royal Premium Muesli",
"Tata Soulfull Fruit Muesli",
"Nutriorg Fruit Muesli",
"RiteBite Crunchy Muesli",
"Kellogg's Mixed Fruit"};
	 return muesliBrands ;
	 }
	 
	 if(productName == "soySauce"){
	 String soySauceBrands[] = {"Ching's Soy Sauce","Maggi Soy Sauce",
"Kikkoman Soy Sauce","Lee Kum Kee Soy Sauce",
"Del Monte Soy Sauce","Veeba Soy Sauce",
"Smith & Jones Soy Sauce","Urban Platter Soy Sauce",
"BB Royal Soy Sauce","24 Mantra Soy Sauce",
"Natureland Soy Sauce","Organic Tattva Soy Sauce",
"Ching's Dark Soy","Maggi Rich Soy",
"Kikkoman Naturally Brewed",
"Lee Kum Kee Premium",
"Del Monte Dark Soy",
"Veeba Dark Soy",
"Smith & Jones Dark Soy",
"Urban Platter Dark Soy",
"BB Royal Dark Soy",
"24 Mantra Organic Soy",
"Natureland Organic Soy",
"Organic Tattva Organic Soy",
"Ching's Light Soy",
"Maggi Light Soy",
"Kikkoman Light Soy",
"Lee Kum Kee Light Soy",
"Del Monte Light Soy",
"Veeba Light Soy",
"Smith & Jones Light Soy",
"Urban Platter Light Soy",
"BB Royal Light Soy",
"24 Mantra Light Soy",
"Natureland Light Soy",
"Organic Tattva Light Soy",
"Ching's Premium Soy"};
	 return soySauceBrands ;
	 }
	 
	 if(productName == "chocolateSyrup"){
	 String chocolateSyrupBrands[] = {"Hershey's Syrup","Nestle Syrup","Mapro Syrup",
"Urban Platter Syrup","BB Royal Syrup",
"24 Mantra Syrup","Natureland Syrup",
"Organic Tattva Syrup","Veeba Syrup",
"Del Monte Syrup","Hershey's Chocolate",
"Nestle Chocolate Syrup",
"Mapro Chocolate Syrup",
"Urban Platter Chocolate",
"BB Royal Chocolate",
"24 Mantra Organic Syrup",
"Natureland Organic Syrup",
"Organic Tattva Organic Syrup",
"Veeba Chocolate Syrup",
"Del Monte Chocolate",
"Hershey's Dark Syrup",
"Nestle Rich Syrup",
"Mapro Rich Chocolate",
"Urban Platter Dark",
"BB Royal Dark",
"24 Mantra Dark",
"Natureland Dark",
"Organic Tattva Dark",
"Veeba Dark Chocolate",
"Del Monte Dark",
"Hershey's Classic Syrup",
"Nestle Classic Syrup",
"Mapro Classic",
"Urban Platter Classic",
"BB Royal Classic",
"24 Mantra Classic",
"Natureland Classic"};
	 return chocolateSyrupBrands ;
	 }
	 
	 if(productName == "glucose"){
	 String glucoseBrands[] = {"Glucon D","Enerzal Glucose",
"Dabur Glucose","Protinex Glucose",
"BB Royal Glucose","24 Mantra Glucose",
"Natureland Glucose","Organic Tattva Glucose",
"Glucon D Orange","Glucon D Lemon",
"Enerzal Orange","Enerzal Lemon",
"Dabur Glucose D","Protinex Energy",
"BB Royal Energy Drink",
"24 Mantra Energy",
"Natureland Energy",
"Organic Tattva Energy",
"Glucon D Tangy Orange",
"Glucon D Mango",
"Enerzal Electrolyte",
"Dabur Energy Drink",
"Protinex Health Drink",
"BB Royal Health Drink",
"24 Mantra Health Drink",
"Natureland Health Drink",
"Organic Tattva Health Drink",
"Glucon D Regular",
"Enerzal Regular",
"Dabur Regular",
"Protinex Regular",
"BB Royal Regular",
"24 Mantra Regular",
"Natureland Regular",
"Organic Tattva Regular",
"Glucon D Instant Energy",
"Enerzal Instant Energy"};
	 return glucoseBrands ;
	 }
	 
	 if(productName == "biscuitsCream"){
	 String biscuitsCreamBrands[] = {"Oreo","Bourbon","Jim Jam",
"Britannia Milk Cream","Sunfeast Dream Cream",
"Treat Croissant","Hide & Seek Cream",
"Parle Cream Biscuit","Good Day Cream",
"Dark Fantasy Cream",
"Oreo Vanilla","Oreo Chocolate",
"Bourbon Chocolate",
"Jim Jam Cream",
"Milk Bikis Cream",
"Sunfeast Vanilla Cream",
"Treat Strawberry Cream",
"Hide & Seek Fab",
"Parle 20-20 Cream",
"Good Day Cashew Cream",
"Dark Fantasy Vanilla Cream",
"Oreo Strawberry",
"Bourbon Vanilla",
"Jim Jam Strawberry",
"Milk Bikis Strawberry",
"Sunfeast Orange Cream",
"Treat Pineapple Cream",
"Hide & Seek Vanilla",
"Parle Chocolate Cream",
"Good Day Butter Cream",
"Dark Fantasy Choco Fills",
"Oreo Double Cream",
"Bourbon Double Cream",
"Jim Jam Double Cream",
"Milk Bikis Double Cream",
"Sunfeast Double Cream",
"Treat Double Cream"};
	 return biscuitsCreamBrands ;
	 }
	 
	 if(productName == "wafer"){
	 String waferBrands[] = {"KitKat Wafer","Munch Wafer","Perk Wafer",
"Timba Wafer","Loacker Wafer",
"Knoppers Wafer","Hershey's Wafer",
"Sunfeast Wafer Rolls","Dukes Waffy Rolls",
"Britannia Treat Wafer","Parle Wafer Rolls",
"Oreo Wafer Rolls","Bingo Wafer Bites",
"KitKat Dark Wafer","Munch Max Wafer",
"Perk Double Wafer","Loacker Quadratini",
"Knoppers Milk Wafer","Hershey's Chocolate Wafer",
"Sunfeast Chocolate Rolls",
"Dukes Chocolate Waffy",
"Britannia Vanilla Wafer",
"Parle Chocolate Wafer",
"Oreo Chocolate Rolls",
"Bingo Chocolate Wafer",
"KitKat White Wafer",
"Munch Crunch Wafer",
"Perk Chocolate Wafer",
"Loacker Vanilla Wafer",
"Knoppers Peanut Wafer",
"Hershey's Cookies Wafer",
"Sunfeast Strawberry Rolls",
"Dukes Strawberry Waffy",
"Britannia Strawberry Wafer",
"Parle Strawberry Wafer",
"Oreo Strawberry Rolls",
"Bingo Strawberry Wafer"};
	 return waferBrands ;
	 }
	 
	 if(productName == "lollipop"){
	 String lollipopBrands[] = {"Alpenliebe Lollipop","Chupa Chups",
"Pulse Lollipop","LuvIt Lollipop",
"Parle Kismi Pop","Candyman Lollipop",
"Fini Lollipop","Hershey's Pop",
"Mentos Lollipop","Center Fresh Pop",
"Alpenliebe Cream Pop",
"Chupa Chups Strawberry",
"Pulse Kaccha Aam Pop",
"LuvIt Fruity Pop",
"Parle Mango Pop",
"Candyman Orange Pop",
"Fini Cola Pop",
"Hershey's Chocolate Pop",
"Mentos Fruit Pop",
"Center Fresh Mint Pop",
"Alpenliebe Mango Pop",
"Chupa Chups Cola",
"Pulse Guava Pop",
"LuvIt Cola Pop",
"Parle Strawberry Pop",
"Candyman Mango Pop",
"Fini Rainbow Pop",
"Hershey's Caramel Pop",
"Mentos Strawberry Pop",
"Center Fresh Bubble Pop",
"Alpenliebe Strawberry Pop",
"Chupa Chups Bubblegum",
"Pulse Pineapple Pop",
"LuvIt Mango Pop",
"Parle Orange Pop",
"Candyman Pineapple Pop",
"Fini Strawberry Pop"};
	 return lollipopBrands ;
	 }
	 
	 if(productName == "chewingGum"){
	 String chewingGumBrands[] = {"Center Fresh","Center Fruit","Happydent",
"Orbit","Wrigley's Doublemint",
"Boomer","Big Babol","Mentos Gum",
"Trident Gum","Chiclets Gum",
"Center Fresh Mint",
"Center Fruit Strawberry",
"Happydent White",
"Orbit Spearmint",
"Doublemint Peppermint",
"Boomer Strawberry",
"Big Babol Cola",
"Mentos Pure Fresh",
"Trident Minty Fresh",
"Chiclets Fruit",
"Center Fresh Sugarfree",
"Center Fruit Orange",
"Happydent Sparkle",
"Orbit Peppermint",
"Doublemint Spearmint",
"Boomer Bubblegum",
"Big Babol Tutti Frutti",
"Mentos Mint",
"Trident Watermelon",
"Chiclets Mint",
"Center Fresh Strong Mint",
"Center Fruit Mango",
"Happydent Ice",
"Orbit Lime Mint",
"Doublemint Winterfresh",
"Boomer Cola",
"Big Babol Strawberry"};
	 return chewingGumBrands ;
	 }
	 
	 if(productName == "instantSoup"){
	 String instantSoupBrands[] = {"Knorr Soup","Maggi Soup","Ching's Soup",
"MTR Soup","Patanjali Soup",
"24 Mantra Soup","BB Royal Soup",
"Natureland Soup","Organic Tattva Soup",
"Urban Platter Soup","Del Monte Soup",
"Knorr Tomato Soup",
"Maggi Tomato Soup",
"Ching's Manchow Soup",
"MTR Sweet Corn Soup",
"Patanjali Tomato Soup",
"24 Mantra Tomato Soup",
"BB Royal Tomato Soup",
"Natureland Tomato Soup",
"Organic Tattva Tomato Soup",
"Urban Platter Tomato Soup",
"Del Monte Tomato Soup",
"Knorr Sweet Corn",
"Maggi Sweet Corn",
"Ching's Hot & Sour",
"MTR Manchow Soup",
"Patanjali Veg Soup",
"24 Mantra Veg Soup",
"BB Royal Veg Soup",
"Natureland Veg Soup",
"Organic Tattva Veg Soup",
"Urban Platter Veg Soup",
"Del Monte Sweet Corn",
"Knorr Chicken Soup",
"Maggi Chicken Soup",
"Ching's Veg Soup",
"MTR Veg Clear Soup"};
	 return instantSoupBrands ;
	 }
	 
	 if(productName == "readyMix"){
	 String readyMixBrands[] = {"MTR Ready Mix","Gits Ready Mix",
"Aashirvaad Ready Mix","Patanjali Ready Mix",
"24 Mantra Ready Mix","BB Royal Ready Mix",
"Natureland Ready Mix","Organic Tattva Ready Mix",
"Rajdhani Ready Mix","Shakti Bhog Ready Mix",
"MTR Gulab Jamun Mix",
"Gits Gulab Jamun Mix",
"Aashirvaad Dhokla Mix",
"Patanjali Idli Mix",
"24 Mantra Idli Mix",
"BB Royal Idli Mix",
"Natureland Idli Mix",
"Organic Tattva Idli Mix",
"Rajdhani Rava Dosa Mix",
"Shakti Bhog Dosa Mix",
"MTR Upma Mix",
"Gits Upma Mix",
"Aashirvaad Rava Idli Mix",
"Patanjali Dosa Mix",
"24 Mantra Dosa Mix",
"BB Royal Dosa Mix",
"Natureland Dosa Mix",
"Organic Tattva Dosa Mix",
"Rajdhani Uttapam Mix",
"Shakti Bhog Uttapam Mix",
"MTR Pongal Mix",
"Gits Pongal Mix",
"Aashirvaad Khaman Mix",
"Patanjali Khaman Mix",
"24 Mantra Pongal Mix",
"BB Royal Pongal Mix",
"Natureland Pongal Mix"};
	 return readyMixBrands ;
	 }
	 
	 if(productName == "poha"){
	 String pohaBrands[] = {"Aashirvaad Poha","Annapurna Poha","BB Royal Poha",
"24 Mantra Poha","Natureland Poha",
"Organic Tattva Poha","Patanjali Poha",
"MTR Poha","Rajdhani Poha",
"Shakti Bhog Poha","Double Horse Poha",
"Uttam Poha","Vedaka Poha",
"Fortune Poha","Tata Sampann Poha",
"Aashirvaad Thick Poha",
"Annapurna Thick Poha",
"BB Royal Thick Poha",
"24 Mantra Organic Poha",
"Natureland Organic Poha",
"Organic Tattva Organic Poha",
"Patanjali Thick Poha",
"MTR Thick Poha",
"Rajdhani Thick Poha",
"Shakti Bhog Thick Poha",
"Double Horse Thick Poha",
"Uttam Thick Poha",
"Vedaka Thick Poha",
"Fortune Thick Poha",
"Tata Sampann Thick Poha",
"Aashirvaad Thin Poha",
"Annapurna Thin Poha",
"BB Royal Thin Poha",
"24 Mantra Thin Poha",
"Natureland Thin Poha",
"Patanjali Thin Poha",
"MTR Thin Poha"};
	 return pohaBrands ;
	 }
	 
	 if(productName == "rava"){
	 String ravaBrands[] = {"Aashirvaad Rava","Annapurna Rava","BB Royal Rava",
"24 Mantra Rava","Natureland Rava",
"Organic Tattva Rava","Patanjali Rava",
"MTR Rava","Rajdhani Rava",
"Shakti Bhog Rava","Double Horse Rava",
"Uttam Rava","Vedaka Rava",
"Fortune Rava","Tata Sampann Rava",
"Aashirvaad Roasted Rava",
"Annapurna Roasted Rava",
"BB Royal Roasted Rava",
"24 Mantra Organic Rava",
"Natureland Organic Rava",
"Organic Tattva Organic Rava",
"Patanjali Roasted Rava",
"MTR Roasted Rava",
"Rajdhani Roasted Rava",
"Shakti Bhog Roasted Rava",
"Double Horse Roasted Rava",
"Uttam Roasted Rava",
"Vedaka Roasted Rava",
"Fortune Roasted Rava",
"Tata Sampann Roasted Rava",
"Aashirvaad Fine Rava",
"Annapurna Fine Rava",
"BB Royal Fine Rava",
"24 Mantra Fine Rava",
"Natureland Fine Rava",
"Patanjali Fine Rava",
"MTR Fine Rava"};
	 return ravaBrands ;
	 }
	 
	 if(productName == "ketchupSpicy"){
	 String ketchupSpicyBrands[] = {"Kissan Spicy Ketchup","Maggi Spicy Ketchup",
"Heinz Spicy Ketchup","Tops Spicy Ketchup",
"Del Monte Spicy Ketchup","Veeba Spicy Ketchup",
"Smith & Jones Spicy","BB Royal Spicy Ketchup",
"24 Mantra Spicy Ketchup","Natureland Spicy Ketchup",
"Funfoods Spicy Ketchup","Patanjali Spicy Ketchup",
"Kissan Hot & Sweet","Maggi Hot & Sweet",
"Heinz Chilli Ketchup","Tops Chilli Ketchup",
"Del Monte Chilli Tomato",
"Veeba Chilli Tomato",
"Smith & Jones Chilli",
"BB Royal Chilli Tomato",
"24 Mantra Organic Chilli",
"Natureland Organic Chilli",
"Funfoods Chilli Tomato",
"Patanjali Chilli Tomato",
"Kissan Extra Spicy",
"Maggi Extra Spicy",
"Heinz Extra Spicy",
"Tops Extra Spicy",
"Del Monte Extra Spicy",
"Veeba Extra Spicy",
"Smith & Jones Extra",
"BB Royal Extra Spicy",
"24 Mantra Extra Spicy",
"Natureland Extra Spicy",
"Kissan Fire Ketchup",
"Maggi Fire Ketchup",
"Heinz Fire Ketchup"};
	 return ketchupSpicyBrands ;
	 }
	 
	 if(productName == "fruitJam"){
	 String fruitJamBrands[] = {"Kissan Jam","Mapro Jam","Tops Jam",
"Urban Platter Jam","Mala's Jam",
"24 Mantra Jam","BB Royal Jam",
"Natureland Jam","Organic Tattva Jam",
"Captain Cook Jam","Del Monte Jam",
"Kissan Mixed Fruit",
"Kissan Strawberry",
"Mapro Strawberry",
"Tops Pineapple",
"Urban Platter Blueberry",
"Mala's Mango",
"24 Mantra Organic Jam",
"BB Royal Mixed Fruit",
"Natureland Strawberry",
"Organic Tattva Strawberry",
"Captain Cook Mango",
"Del Monte Pineapple",
"Kissan Mango Jam",
"Mapro Mixed Fruit",
"Tops Mango Jam",
"Urban Platter Raspberry",
"Mala's Pineapple",
"24 Mantra Strawberry",
"BB Royal Mango",
"Natureland Mixed Fruit",
"Organic Tattva Mixed Fruit",
"Captain Cook Strawberry",
"Del Monte Mixed Fruit",
"Kissan Pineapple",
"Mapro Pineapple",
"Tops Strawberry"};
	 return fruitJamBrands ;
	 }
	 
	 if(productName == "peanutSnack"){
	 String peanutSnackBrands[] = {"Haldiram's Peanuts","Bikaji Peanuts",
"Balaji Peanuts","Too Yumm Peanuts",
"Yellow Diamond Peanuts","Cornitos Peanuts",
"BB Royal Peanuts","24 Mantra Peanuts",
"Natureland Peanuts","Organic Tattva Peanuts",
"Rostaa Peanuts","Farmley Peanuts",
"Haldiram's Salted Peanuts",
"Bikaji Masala Peanuts",
"Balaji Salted Peanuts",
"Too Yumm Roasted Peanuts",
"Yellow Diamond Masala",
"Cornitos Salted Peanuts",
"BB Royal Salted Peanuts",
"24 Mantra Organic Peanuts",
"Natureland Organic Peanuts",
"Organic Tattva Organic Peanuts",
"Rostaa Roasted Peanuts",
"Farmley Roasted Peanuts",
"Haldiram's Spicy Peanuts",
"Bikaji Spicy Peanuts",
"Balaji Masala Peanuts",
"Too Yumm Spicy Peanuts",
"Yellow Diamond Spicy",
"Cornitos Spicy Peanuts",
"BB Royal Masala Peanuts",
"24 Mantra Spicy Peanuts",
"Natureland Spicy Peanuts",
"Organic Tattva Spicy Peanuts",
"Rostaa Salted Peanuts",
"Farmley Salted Peanuts",
"Haldiram's Crunchy Peanuts"};
	 return peanutSnackBrands ;
	 }
	 
	  if(productName == "cookingSpray"){
	 String cookingSprayBrands[] = {"PAM Cooking Spray","Figaro Cooking Spray","Borges Cooking Spray",
"Del Monte Cooking Spray","Saffola Cooking Spray",
"Sundrop Cooking Spray","Oleev Cooking Spray",
"Urban Platter Cooking Spray","BB Royal Cooking Spray",
"24 Mantra Cooking Spray","Natureland Cooking Spray",
"Organic Tattva Cooking Spray","Disano Cooking Spray",
"Leonardo Cooking Spray","Weikfield Cooking Spray",
"PAM Olive Oil Spray","Figaro Olive Spray",
"Borges Olive Spray","Del Monte Olive Spray",
"Saffola Olive Spray","Sundrop Olive Spray",
"Oleev Olive Spray","Urban Platter Olive Spray",
"BB Royal Olive Spray","24 Mantra Olive Spray",
"Natureland Olive Spray","Organic Tattva Olive Spray",
"Disano Olive Spray","Leonardo Olive Spray",
"PAM Butter Spray","Figaro Butter Spray",
"Borges Butter Spray","Del Monte Butter Spray",
"Saffola Butter Spray","Sundrop Butter Spray",
"Oleev Butter Spray","Urban Platter Butter Spray"};
	 return cookingSprayBrands ;
	 }
	 
	 if(productName == "mineralWater"){
	 String mineralWaterBrands[] = {"Bisleri","Kinley","Aquafina",
"Bailley","Himalayan Water","Tata Copper Plus",
"Rail Neer","Kingfisher Water","Qua Water",
"Bluefin Water","Oxyrich","Vedica",
"Aquaplus","Everest Water","AquaSure",
"Bisleri Vedica","Kinley Soda",
"Aquafina Sparkling","Bailley Premium",
"Himalayan Sparkling","Tata Himalayan",
"Rail Neer Premium","Kingfisher Premium",
"Qua Sparkling","Bluefin Premium",
"Oxyrich Alkaline","Vedica Natural",
"Aquaplus Mineral","Everest Mineral",
"AquaSure Mineral","Bisleri Mineral",
"Kinley Mineral","Aquafina Mineral",
"Bailley Mineral","Himalayan Natural",
"Tata Copper Water","Vedica Sparkling"};
	 return mineralWaterBrands ;
	 }
	 
	 if(productName == "bathTowel"){
	 String bathTowelBrands[] = {"Bombay Dyeing Towel","Spaces Towel","Trident Towel",
"Welspun Towel","D'Decor Towel",
"Portico Towel","Raymond Home Towel",
"Marks & Spencer Towel","Amazon Basics Towel",
"BB Home Towel","Home Centre Towel",
"Ikea Towel","Story@Home Towel",
"Cotton Craft Towel","Classic Towel",
"Bombay Dyeing Premium",
"Spaces Cotton Towel",
"Trident Soft Towel",
"Welspun Cotton Towel",
"D'Decor Premium Towel",
"Portico Soft Towel",
"Raymond Luxury Towel",
"Marks & Spencer Cotton",
"Amazon Basics Cotton",
"BB Home Cotton Towel",
"Home Centre Cotton",
"Ikea Cotton Towel",
"Story@Home Premium",
"Cotton Craft Premium",
"Classic Soft Towel",
"Bombay Dyeing Large",
"Spaces Large Towel",
"Trident Large Towel",
"Welspun Large Towel",
"D'Decor Large Towel",
"Portico Large Towel",
"Raymond Large Towel"};
	 return bathTowelBrands ;
	 }
	 
	 if(productName == "toothbrush"){
	 String toothbrushBrands[] = {"Colgate Toothbrush","Oral B Toothbrush",
"Pepsodent Toothbrush","Sensodyne Toothbrush",
"Closeup Toothbrush","Dabur Toothbrush",
"Patanjali Toothbrush","Himalaya Toothbrush",
"Anchor Toothbrush","Aquafresh Toothbrush",
"Colgate ZigZag","Oral B CrossAction",
"Pepsodent Soft Brush",
"Sensodyne Sensitive Brush",
"Closeup Deep Clean",
"Dabur Herbal Brush",
"Patanjali Soft Brush",
"Himalaya Complete Care",
"Anchor Active",
"Aquafresh Clean & Flex",
"Colgate Extra Clean",
"Oral B Pro Health",
"Pepsodent Germicheck",
"Sensodyne Precision",
"Closeup Comfort",
"Dabur Kids Brush",
"Patanjali Kids Brush",
"Himalaya Kids Brush",
"Anchor Kids Brush",
"Aquafresh Kids",
"Colgate Slim Soft",
"Oral B Indicator",
"Pepsodent Indicator",
"Sensodyne Advanced",
"Closeup Advanced",
"Dabur Premium",
"Colgate Super Flexi"};
	 return toothbrushBrands ;
	 }
	 
	 if(productName == "mouthwash"){
	 String mouthwashBrands[] = {"Listerine","Colgate Plax",
"Closeup Mouthwash","Pepsodent Mouthwash",
"Oral B Mouthwash","Himalaya Mouthwash",
"Patanjali Mouthwash","Dabur Mouthwash",
"Senquel Mouthwash","Clohex Mouthwash",
"Listerine Cool Mint",
"Colgate Plax Ice",
"Closeup Fresh Mint",
"Pepsodent Germicheck",
"Oral B Pro Health",
"Himalaya Active Fresh",
"Patanjali Herbal",
"Dabur Fresh Mint",
"Senquel Chlorhexidine",
"Clohex Plus",
"Listerine Zero",
"Colgate Plax Fresh Mint",
"Closeup Antibacterial",
"Pepsodent Fresh Mint",
"Oral B Fresh Breath",
"Himalaya Complete Care",
"Patanjali Aloe Vera",
"Dabur Herbal",
"Listerine Green Tea",
"Colgate Plax Peppermint",
"Closeup Cool Breeze",
"Pepsodent Whitening",
"Oral B Gum Care",
"Himalaya Mint Fresh",
"Patanjali Mint Fresh",
"Dabur Mint Fresh",
"Listerine Advanced"};
	 return mouthwashBrands ;
	 }
	 
	 if(productName == "liquidSoap"){
	 String liquidSoapBrands[] = {"Dettol Liquid Soap","Savlon Liquid Soap","Lifebuoy Liquid Soap",
"Dove Liquid Soap","Godrej Protekt Liquid Soap",
"Palmolive Liquid Soap","Himalaya Liquid Soap",
"Patanjali Liquid Soap","Fiama Liquid Soap",
"Lux Liquid Soap","Santoor Liquid Soap",
"Medimix Liquid Soap","Khadi Liquid Soap",
"BB Royal Liquid Soap","Organic Tattva Liquid Soap",
"Dettol Skincare","Savlon Moisture Shield",
"Lifebuoy Total","Dove Deep Moisture",
"Godrej Lime Aloe","Palmolive Aroma",
"Himalaya Pure Hands","Patanjali Herbal Wash",
"Fiama Fresh","Lux Soft Touch",
"Santoor Gentle","Medimix Ayurvedic",
"Khadi Neem Liquid Soap",
"BB Royal Lemon Soap",
"Organic Aloe Liquid Soap",
"Dettol Aloe Vera",
"Savlon Herbal","Lifebuoy Care",
"Dove Sensitive","Palmolive Milk",
"Himalaya Neem Soap",
"Patanjali Aloe Soap",
"Godrej Advanced"};
	 return liquidSoapBrands ;
	 }
	 
	 if(productName == "agarbatti"){
	 String agarbattiBrands[] = {"Cycle Agarbatti","Mangaldeep Agarbatti",
"Zed Black Agarbatti","Mysore Deep Perfumery",
"Moksh Agarbatti","Hem Agarbatti",
"Darshan Agarbatti","Flute Agarbatti",
"Balaji Agarbatti","Patanjali Agarbatti",
"Cycle Three in One",
"Mangaldeep Sandal",
"Zed Black Premium",
"Mysore Sandal Agarbatti",
"Moksh Flora","Hem Sandal",
"Darshan Flora","Flute Sandal",
"Balaji Chandan","Patanjali Chandan",
"Cycle Lavender",
"Mangaldeep Rose",
"Zed Black Rose",
"Mysore Rose","Moksh Rose",
"Hem Rose","Darshan Rose",
"Flute Rose","Balaji Rose",
"Patanjali Rose",
"Cycle Jasmine","Mangaldeep Jasmine",
"Zed Black Jasmine",
"Mysore Jasmine","Moksh Jasmine",
"Hem Jasmine","Darshan Jasmine"};
	 return agarbattiBrands ;
	 }
	 
	 if(productName == "matchBox"){
	 String matchBoxBrands[] = {"Ship Matchbox","Cycle Matchbox","Three Mangoes Matchbox",
"Homelite Matchbox","Royal Matchbox",
"Cheetah Matchbox","Elephant Matchbox",
"Ship Deluxe","Cycle Deluxe",
"Three Mangoes Deluxe","Homelite Deluxe",
"Royal Deluxe","Cheetah Deluxe",
"Elephant Deluxe","Ship Premium",
"Cycle Premium","Three Mangoes Premium",
"Homelite Premium","Royal Premium",
"Cheetah Premium","Elephant Premium",
"Ship Safety","Cycle Safety",
"Three Mangoes Safety","Homelite Safety",
"Royal Safety","Cheetah Safety",
"Elephant Safety","Ship Classic",
"Cycle Classic","Three Mangoes Classic",
"Homelite Classic","Royal Classic",
"Cheetah Classic","Elephant Classic",
"Ship Super","Cycle Super"};
	 return matchBoxBrands ;
	 }
	 
	 if(productName == "candle"){
	 String candleBrands[] = {"Cycle Candle","Mangaldeep Candle",
"Zed Black Candle","Mysore Candle",
"Moksh Candle","Hem Candle",
"Darshan Candle","Flute Candle",
"Balaji Candle","Patanjali Candle",
"Cycle White Candle","Mangaldeep White",
"Zed Black White","Mysore White",
"Moksh White","Hem White",
"Darshan White","Flute White",
"Balaji White","Patanjali White",
"Cycle Scented Candle",
"Mangaldeep Scented",
"Zed Black Scented",
"Mysore Scented","Moksh Scented",
"Hem Scented","Darshan Scented",
"Flute Scented","Balaji Scented",
"Patanjali Scented",
"Cycle Decorative Candle",
"Mangaldeep Decorative",
"Zed Black Decorative",
"Mysore Decorative","Moksh Decorative",
"Hem Decorative","Darshan Decorative"};
	 return candleBrands ;
	 }
	 
	 if(productName == "mosquitoRepellent"){
	 String mosquitoRepellentBrands[] = {"All Out","Good Knight","Mortein",
"Odomos","Maxo",
"Hit Mosquito","Godrej Expert",
"All Out Liquid","Good Knight Liquid",
"Mortein Liquid","Odomos Cream",
"Maxo Liquid","Hit Spray",
"Godrej Roll On","All Out Machine",
"Good Knight Machine","Mortein Machine",
"Odomos Gel","Maxo Machine",
"Hit Electric","Godrej Advanced",
"All Out Power","Good Knight Gold",
"Mortein Power","Odomos Herbal",
"Maxo Power","Hit Advanced",
"Godrej Power","All Out Ultra",
"Good Knight Advanced",
"Mortein Ultra","Odomos Natural",
"Maxo Ultra","Hit Ultra",
"Godrej Ultra","All Out Pro",
"Good Knight Pro"};
	 return mosquitoRepellentBrands ;
	 }
	 
	 if(productName == "roomFreshener"){
	 String roomFreshenerBrands[] = {"Godrej Aer","Odonil","Air Wick",
"Ambi Pur","All Out Room Spray",
"Good Knight Room Spray",
"Glade Room Spray","Mortein Room Spray",
"Godrej Aer Spray","Odonil Room Spray",
"Air Wick Freshmatic","Ambi Pur Spray",
"Glade Lavender","Godrej Rose",
"Odonil Jasmine","Air Wick Vanilla",
"Ambi Pur Floral","Glade Lemon",
"Godrej Musk","Odonil Sandal",
"Air Wick Citrus","Ambi Pur Lavender",
"Glade Ocean","Godrej Cool Surf",
"Odonil Fresh","Air Wick Automatic",
"Ambi Pur Gel","Glade Gel",
"Godrej Aer Pocket",
"Odonil Zipper","Air Wick Spray",
"Ambi Pur Pocket","Glade Automatic",
"Godrej Aer Gel","Odonil Gel",
"Air Wick Fresh","Ambi Pur Fresh"};
	 return roomFreshenerBrands ;
	 }
	 
	 if(productName == "airFreshener"){
	 String airFreshenerBrands[] = {"Godrej Aer Air Freshener","Odonil Air Freshener",
"Air Wick Air Freshener","Ambi Pur Air Freshener",
"Glade Air Freshener","All Out Air Freshener",
"Good Knight Air Freshener",
"Godrej Spray Freshener","Odonil Spray",
"Air Wick Spray","Ambi Pur Spray",
"Glade Spray","Godrej Automatic",
"Odonil Automatic","Air Wick Automatic",
"Ambi Pur Automatic","Glade Automatic",
"Godrej Lavender","Odonil Rose",
"Air Wick Jasmine","Ambi Pur Ocean",
"Glade Citrus","Godrej Musk",
"Odonil Sandal","Air Wick Vanilla",
"Ambi Pur Floral","Glade Fresh",
"Godrej Pocket","Odonil Pocket",
"Air Wick Pocket","Ambi Pur Gel",
"Glade Gel","Godrej Gel",
"Odonil Gel","Air Wick Gel",
"Ambi Pur Gel Fresh","Glade Gel Fresh"};
	 return airFreshenerBrands ;
	 }
	 
	 if(productName == "toiletCleaner"){
	 String toiletCleanerBrands[] = {"Harpic","Domex","Lizol Toilet Cleaner",
"Vim Toilet Cleaner","Exo Toilet Cleaner",
"Godrej Protekt Toilet Cleaner",
"Dettol Toilet Cleaner","Savlon Toilet Cleaner",
"Patanjali Toilet Cleaner",
"Harpic Power","Domex Power",
"Lizol Power","Vim Power",
"Exo Power","Godrej Power",
"Dettol Power","Savlon Power",
"Patanjali Herbal Cleaner",
"Harpic Fresh","Domex Fresh",
"Lizol Fresh","Vim Fresh",
"Exo Fresh","Godrej Fresh",
"Dettol Fresh","Savlon Fresh",
"Harpic Advanced","Domex Advanced",
"Lizol Advanced","Vim Advanced",
"Exo Advanced","Godrej Advanced",
"Dettol Advanced","Savlon Advanced",
"Patanjali Advanced","Harpic Plus",
"Domex Plus"};
	 return toiletCleanerBrands ;
	 }
	 
	 if(productName == "bleach"){
	 String bleachBrands[] = {"Domex Bleach","Harpic Bleach",
"Vim Bleach","Exo Bleach",
"Godrej Bleach","Dettol Bleach",
"Savlon Bleach","Patanjali Bleach",
"BB Royal Bleach","24 Mantra Bleach",
"Domex Power Bleach","Harpic Power Bleach",
"Vim Power Bleach","Exo Power Bleach",
"Godrej Power Bleach","Dettol Power Bleach",
"Savlon Power Bleach","Patanjali Herbal Bleach",
"BB Royal Power Bleach","24 Mantra Organic Bleach",
"Domex Fresh Bleach","Harpic Fresh Bleach",
"Vim Fresh Bleach","Exo Fresh Bleach",
"Godrej Fresh Bleach","Dettol Fresh Bleach",
"Savlon Fresh Bleach","Patanjali Fresh Bleach",
"BB Royal Fresh Bleach","24 Mantra Fresh Bleach",
"Domex Advanced Bleach","Harpic Advanced Bleach",
"Vim Advanced Bleach","Exo Advanced Bleach",
"Godrej Advanced Bleach","Dettol Advanced Bleach",
"Savlon Advanced Bleach"};
	 return bleachBrands ;
	 }
	 
	 if(productName == "fabricSoftener"){
	 String fabricSoftenerBrands[] = {"Comfort Fabric Softener","Downy Fabric Softener",
"Surf Excel Softener","Ariel Softener",
"Godrej Softener","Ujala Softener",
"Henko Softener","Vanish Softener",
"BB Royal Softener","24 Mantra Softener",
"Comfort Blue","Downy Lavender",
"Surf Excel Comfort","Ariel Fresh",
"Godrej Fresh Softener","Ujala Fresh",
"Henko Fresh Softener","Vanish Fresh",
"Comfort Rose","Downy Rose",
"Surf Excel Rose","Ariel Rose",
"Godrej Rose","Ujala Rose",
"Henko Rose","Vanish Rose",
"Comfort Lily","Downy Lily",
"Surf Excel Lily","Ariel Lily",
"Godrej Lily","Ujala Lily",
"Henko Lily","Vanish Lily",
"Comfort Premium","Downy Premium",
"Surf Excel Premium"};
	 return fabricSoftenerBrands ;
	 }
	 
	 if(productName == "sponge"){
	 String spongeBrands[] = {"Scotch Brite Sponge","Vim Sponge","Exo Sponge",
"Gala Sponge","Spotzero Sponge",
"BB Home Sponge","24 Mantra Sponge",
"Natureland Sponge","Organic Tattva Sponge",
"Godrej Sponge","Scotch Brite Heavy Duty",
"Vim Heavy Duty Sponge",
"Exo Heavy Duty Sponge",
"Gala Heavy Duty Sponge",
"Spotzero Heavy Duty Sponge",
"BB Home Heavy Duty Sponge",
"Godrej Heavy Duty Sponge",
"Scotch Brite Scrub Sponge",
"Vim Scrub Sponge",
"Exo Scrub Sponge",
"Gala Scrub Sponge",
"Spotzero Scrub Sponge",
"BB Home Scrub Sponge",
"Godrej Scrub Sponge",
"Scotch Brite Kitchen Sponge",
"Vim Kitchen Sponge",
"Exo Kitchen Sponge",
"Gala Kitchen Sponge",
"Spotzero Kitchen Sponge",
"BB Home Kitchen Sponge",
"Godrej Kitchen Sponge",
"Scotch Brite Non Scratch",
"Vim Non Scratch",
"Exo Non Scratch",
"Gala Non Scratch",
"Spotzero Non Scratch",
"BB Home Non Scratch"};
	 return spongeBrands ;
	 }
	 
	 if(productName == "mug"){
	 String mugBrands[] = {"Cello Mug","Milton Mug","Supreme Mug",
"Nayasa Mug","Signoraware Mug",
"Princeware Mug","Tupperware Mug",
"BB Home Mug","Ikea Mug",
"Home Centre Mug","Cello Plastic Mug",
"Milton Plastic Mug",
"Supreme Plastic Mug",
"Nayasa Plastic Mug",
"Signoraware Plastic Mug",
"Princeware Plastic Mug",
"Tupperware Plastic Mug",
"BB Home Plastic Mug",
"Ikea Plastic Mug",
"Home Centre Plastic Mug",
"Cello Steel Mug",
"Milton Steel Mug",
"Supreme Steel Mug",
"Nayasa Steel Mug",
"Signoraware Steel Mug",
"Princeware Steel Mug",
"Tupperware Steel Mug",
"BB Home Steel Mug",
"Ikea Steel Mug",
"Home Centre Steel Mug",
"Cello Designer Mug",
"Milton Designer Mug",
"Supreme Designer Mug",
"Nayasa Designer Mug",
"Signoraware Designer Mug",
"Princeware Designer Mug",
"BB Home Designer Mug"};
	 return mugBrands ;
	 }
	 
	 if(productName == "hanger"){
	 String hangerBrands[] = {"Cello Hanger","Milton Hanger","Supreme Hanger",
"Nayasa Hanger","Signoraware Hanger",
"Princeware Hanger","Tupperware Hanger",
"BB Home Hanger","Ikea Hanger",
"Home Centre Hanger","Cello Plastic Hanger",
"Milton Plastic Hanger",
"Supreme Plastic Hanger",
"Nayasa Plastic Hanger",
"Signoraware Plastic Hanger",
"Princeware Plastic Hanger",
"Tupperware Plastic Hanger",
"BB Home Plastic Hanger",
"Ikea Plastic Hanger",
"Home Centre Plastic Hanger",
"Cello Wooden Hanger",
"Milton Wooden Hanger",
"Supreme Wooden Hanger",
"Nayasa Wooden Hanger",
"Signoraware Wooden Hanger",
"Princeware Wooden Hanger",
"Tupperware Wooden Hanger",
"BB Home Wooden Hanger",
"Ikea Wooden Hanger",
"Home Centre Wooden Hanger",
"Cello Steel Hanger",
"Milton Steel Hanger",
"Supreme Steel Hanger",
"Nayasa Steel Hanger",
"Signoraware Steel Hanger",
"Princeware Steel Hanger",
"BB Home Steel Hanger"};
	 return hangerBrands ;
	 }
	 
	 if(productName == "notebook"){
	 String notebookBrands[] = {"Classmate Notebook","Navneet Notebook","Camlin Notebook",
"JK Paper Notebook","Sundaram Notebook",
"ITC Paperkraft Notebook","Lotus Notebook",
"Luxor Notebook","Oddy Notebook",
"Paperkraft Notebook","Classmate Pulse",
"Navneet Youva","Camlin Kokuyo",
"JK Excel Notebook","Sundaram Long Book",
"ITC Paperkraft Premium",
"Lotus Premium Notebook",
"Luxor Premium Notebook",
"Oddy Premium Notebook",
"Paperkraft Executive",
"Classmate Long Book",
"Navneet Long Book",
"Camlin Long Book",
"JK Long Book","Sundaram Spiral",
"ITC Spiral Notebook",
"Lotus Spiral Notebook",
"Luxor Spiral Notebook",
"Oddy Spiral Notebook",
"Paperkraft Spiral",
"Classmate Drawing Book",
"Navneet Drawing Book",
"Camlin Drawing Book",
"JK Drawing Book",
"Sundaram Drawing Book",
"ITC Drawing Book",
"Lotus Drawing Book"};
	 return notebookBrands ;
	 }
	 
	 if(productName == "pen"){
	 String penBrands[] = {"Reynolds Pen","Cello Pen","Linc Pen",
"Luxor Pen","Parker Pen",
"Pilot Pen","Classmate Pen",
"Flair Pen","Pentonic Pen",
"Add Gel Pen","Reynolds Trimax",
"Cello Butterflow",
"Linc Ocean Gel","Luxor Ball Pen",
"Parker Vector","Pilot V5",
"Classmate Octane",
"Flair Writo Meter",
"Pentonic Ball Pen",
"Add Gel Achiever",
"Reynolds 045",
"Cello Gripper",
"Linc Signeta",
"Luxor Pilot Pen",
"Parker Beta",
"Pilot Hi Tecpoint",
"Classmate Hook",
"Flair Woody",
"Pentonic Gel Pen",
"Add Gel Little Star",
"Reynolds Racer",
"Cello Pinpoint",
"Linc Pentonic",
"Luxor Fine Writer",
"Parker Frontier",
"Pilot Frixion",
"Classmate Gel Pen"};
	 return penBrands ;
	 }
	 
	 if(productName == "pencil"){
	 String pencilBrands[] = {"Nataraj Pencil","Apsara Pencil","Camlin Pencil",
"Faber Castell Pencil","Doms Pencil",
"Classmate Pencil","Luxor Pencil",
"Reynolds Pencil","Maped Pencil",
"Staedtler Pencil","Nataraj 621",
"Apsara Absolute",
"Camlin Supreme",
"Faber Castell 2B",
"Doms Zoom Pencil",
"Classmate Neon Pencil",
"Luxor Graphite",
"Reynolds HB",
"Maped Black Peps",
"Staedtler Noris",
"Nataraj HB",
"Apsara Platinum",
"Camlin HB",
"Faber Castell Gold",
"Doms Neon",
"Classmate HB",
"Luxor HB",
"Reynolds Graphite",
"Maped Graphite",
"Staedtler HB",
"Nataraj Drawing Pencil",
"Apsara Drawing Pencil",
"Camlin Drawing Pencil",
"Faber Castell Drawing",
"Doms Drawing Pencil",
"Classmate Drawing Pencil",
"Luxor Drawing Pencil"};
	 return pencilBrands ;
	 }
	 
	 if(productName == "eraser"){
	 String eraserBrands[] = {"Nataraj Eraser","Apsara Eraser","Camlin Eraser",
"Faber Castell Eraser","Doms Eraser",
"Classmate Eraser","Luxor Eraser",
"Reynolds Eraser","Maped Eraser",
"Staedtler Eraser","Nataraj Dust Free",
"Apsara Dust Free",
"Camlin Non Dust",
"Faber Castell Dust Free",
"Doms Non Dust",
"Classmate Dust Free",
"Luxor Dust Free",
"Reynolds Dust Free",
"Maped Dust Free",
"Staedtler Mars Eraser",
"Nataraj Small Eraser",
"Apsara Small Eraser",
"Camlin Small Eraser",
"Faber Castell Small",
"Doms Small Eraser",
"Classmate Small Eraser",
"Luxor Small Eraser",
"Reynolds Small Eraser",
"Maped Small Eraser",
"Staedtler Small Eraser",
"Nataraj Large Eraser",
"Apsara Large Eraser",
"Camlin Large Eraser",
"Faber Castell Large",
"Doms Large Eraser",
"Classmate Large Eraser",
"Luxor Large Eraser"};
	 return eraserBrands ;
	 }
	 
	 if(productName == "sharpener"){
	 String sharpenerBrands[] = {"Nataraj Sharpener","Apsara Sharpener","Camlin Sharpener",
"Faber Castell Sharpener","Doms Sharpener",
"Classmate Sharpener","Luxor Sharpener",
"Reynolds Sharpener","Maped Sharpener",
"Staedtler Sharpener","Nataraj Single Blade",
"Apsara Single Blade",
"Camlin Single Blade",
"Faber Castell Single",
"Doms Single Blade",
"Classmate Single Blade",
"Luxor Single Blade",
"Reynolds Single Blade",
"Maped Single Blade",
"Staedtler Single Blade",
"Nataraj Double Blade",
"Apsara Double Blade",
"Camlin Double Blade",
"Faber Castell Double",
"Doms Double Blade",
"Classmate Double Blade",
"Luxor Double Blade",
"Reynolds Double Blade",
"Maped Double Blade",
"Staedtler Double Blade",
"Nataraj Box Sharpener",
"Apsara Box Sharpener",
"Camlin Box Sharpener",
"Faber Castell Box",
"Doms Box Sharpener",
"Classmate Box Sharpener",
"Luxor Box Sharpener"};
	 return sharpenerBrands ;
	 }
	 
	 if(productName == "glue"){
	 String glueBrands[] = {"Fevicol","Fevi Gum","Fevi Stick",
"Doms Glue","Camlin Glue",
"Faber Castell Glue","Pidilite Glue",
"Anabond Glue","Araldite Glue",
"Scotch Glue","3M Glue",
"Fevicol MR","Fevicol SH",
"Fevi Quick","Fevi Kwik",
"Doms Glue Stick","Camlin Glue Stick",
"Faber Castell Glue Stick",
"Pidilite Super Glue",
"Anabond Super Glue",
"Araldite Epoxy",
"Scotch Super Glue",
"3M Super Glue",
"Fevicol Marine","Fevicol Craft",
"Fevi Gum Bottle",
"Doms Craft Glue",
"Camlin Craft Glue",
"Faber Castell Craft Glue",
"Pidilite Craft Glue",
"Anabond Craft Glue",
"Araldite Rapid",
"Scotch Craft Glue",
"3M Craft Glue",
"Fevicol All Fix",
"Fevi Quick Mini",
"Doms White Glue"};
	 return glueBrands ;
	 }
	 
	 if(productName == "tape"){
	 String tapeBrands[] = {"Scotch Tape","Cello Tape","Doms Tape",
"Camlin Tape","3M Tape",
"Pidilite Tape","Anabond Tape",
"Araldite Tape","Fevicol Tape",
"Oddy Tape","Scotch Transparent Tape",
"Cello Transparent Tape",
"Doms Transparent Tape",
"Camlin Transparent Tape",
"3M Transparent Tape",
"Pidilite Transparent Tape",
"Anabond Transparent Tape",
"Fevicol Transparent Tape",
"Oddy Transparent Tape",
"Scotch Double Sided Tape",
"Cello Double Tape",
"Doms Double Tape",
"Camlin Double Tape",
"3M Double Tape",
"Pidilite Double Tape",
"Anabond Double Tape",
"Fevicol Double Tape",
"Oddy Double Tape",
"Scotch Masking Tape",
"Cello Masking Tape",
"Doms Masking Tape",
"Camlin Masking Tape",
"3M Masking Tape",
"Pidilite Masking Tape",
"Anabond Masking Tape",
"Fevicol Masking Tape",
"Oddy Masking Tape"};
	 return tapeBrands ;
	 }
	 
	 if(productName == "batteries"){
	 String batteriesBrands[] = {"Duracell","Eveready","Panasonic",
"Nippo","Energizer",
"Amazon Basics Batteries",
"BB Home Batteries",
"Duracell AA","Duracell AAA",
"Eveready AA","Eveready AAA",
"Panasonic AA","Panasonic AAA",
"Nippo AA","Nippo AAA",
"Energizer AA","Energizer AAA",
"Duracell Rechargeable",
"Eveready Rechargeable",
"Panasonic Rechargeable",
"Nippo Rechargeable",
"Energizer Rechargeable",
"Duracell Ultra",
"Eveready Ultima",
"Panasonic Alkaline",
"Nippo Alkaline",
"Energizer Max",
"Duracell Plus",
"Eveready Plus",
"Panasonic Power",
"Nippo Power",
"Energizer Power",
"Duracell 9V",
"Eveready 9V",
"Panasonic 9V",
"Nippo 9V",
"Energizer 9V"};
	 return batteriesBrands ;
	 }
	 
	 if(productName == "extensionCord"){
	 String extensionCordBrands[] = {"Havells Extension Cord","Anchor Extension Cord",
"GM Extension Cord","Goldmedal Extension Cord",
"Syska Extension Cord","Belkin Extension Cord",
"Philips Extension Cord","Bajaj Extension Cord",
"V-Guard Extension Cord","Panasonic Extension Cord",
"Havells Spike Guard","Anchor Spike Guard",
"GM Spike Guard","Goldmedal Spike Guard",
"Syska Spike Guard","Belkin Surge Protector",
"Philips Surge Protector",
"Bajaj Spike Guard","V-Guard Spike Guard",
"Panasonic Spike Guard",
"Havells 4 Socket","Anchor 4 Socket",
"GM 4 Socket","Goldmedal 4 Socket",
"Syska 4 Socket","Belkin 4 Socket",
"Philips 4 Socket","Bajaj 4 Socket",
"V-Guard 4 Socket","Panasonic 4 Socket",
"Havells 6 Socket","Anchor 6 Socket",
"GM 6 Socket","Goldmedal 6 Socket",
"Syska 6 Socket","Belkin 6 Socket",
"Philips 6 Socket"};
	 return extensionCordBrands ;
	 }
	 
	 if(productName == "lightBulb"){
	 String lightBulbBrands[] = {"Philips Bulb","Havells Bulb","Syska Bulb",
"Bajaj Bulb","Wipro Bulb",
"Crompton Bulb","Orient Bulb",
"Panasonic Bulb","Surya Bulb",
"Eveready Bulb","Philips LED",
"Havells LED","Syska LED",
"Bajaj LED","Wipro LED",
"Crompton LED","Orient LED",
"Panasonic LED","Surya LED",
"Eveready LED",
"Philips Smart Bulb",
"Havells Smart Bulb",
"Syska Smart Bulb",
"Bajaj Smart Bulb",
"Wipro Smart Bulb",
"Crompton Smart Bulb",
"Orient Smart Bulb",
"Panasonic Smart Bulb",
"Surya Smart Bulb",
"Eveready Smart Bulb",
"Philips 9W LED",
"Havells 9W LED",
"Syska 9W LED",
"Bajaj 9W LED",
"Wipro 9W LED",
"Crompton 9W LED",
"Orient 9W LED"};
	 return lightBulbBrands ;
	 }
	 
	 if(productName == "umbrella"){
	 String umbrellaBrands[] = {"John’s Umbrella","Sun Umbrella","Popy Umbrella",
"Citizen Umbrella","Amazon Basics Umbrella",
"Skybags Umbrella","Fendo Umbrella",
"Destinio Umbrella","Classic Umbrella",
"Swiss Military Umbrella",
"John’s Folding Umbrella",
"Sun Folding Umbrella",
"Popy Folding Umbrella",
"Citizen Folding Umbrella",
"Amazon Basics Folding",
"Skybags Folding Umbrella",
"Fendo Folding Umbrella",
"Destinio Folding Umbrella",
"Classic Folding Umbrella",
"Swiss Military Folding",
"John’s Automatic Umbrella",
"Sun Automatic Umbrella",
"Popy Automatic Umbrella",
"Citizen Automatic Umbrella",
"Amazon Basics Automatic",
"Skybags Automatic Umbrella",
"Fendo Automatic Umbrella",
"Destinio Automatic Umbrella",
"Classic Automatic Umbrella",
"Swiss Military Automatic",
"John’s Large Umbrella",
"Sun Large Umbrella",
"Popy Large Umbrella",
"Citizen Large Umbrella",
"Skybags Large Umbrella",
"Fendo Large Umbrella",
"Classic Large Umbrella"};
	 return umbrellaBrands ;
	 }
	 
	 if(productName == "raincoat"){
	 String raincoatBrands[] = {"Duckback Raincoat","Zeel Raincoat","Wildcraft Raincoat",
"Decathlon Raincoat","Amazon Basics Raincoat",
"Quechua Raincoat","Columbia Raincoat",
"North Face Raincoat","Fendo Raincoat",
"Citizen Raincoat",
"Duckback Poncho",
"Zeel Poncho","Wildcraft Poncho",
"Decathlon Poncho","Amazon Basics Poncho",
"Quechua Poncho","Columbia Poncho",
"North Face Poncho",
"Fendo Poncho","Citizen Poncho",
"Duckback Full Suit",
"Zeel Full Suit","Wildcraft Full Suit",
"Decathlon Full Suit",
"Amazon Basics Full Suit",
"Quechua Full Suit",
"Columbia Full Suit",
"North Face Full Suit",
"Fendo Full Suit","Citizen Full Suit",
"Duckback Jacket",
"Zeel Jacket","Wildcraft Jacket",
"Decathlon Jacket",
"Amazon Basics Jacket",
"Quechua Jacket",
"Columbia Jacket"};
	 return raincoatBrands ;
	 }
	 
	 if(productName == "helmet"){
	 String helmetBrands[] = {"Studds Helmet","Vega Helmet","Steelbird Helmet",
"LS2 Helmet","MT Helmet",
"Axor Helmet","SMK Helmet",
"Royal Enfield Helmet",
"TVS Helmet","Hero Helmet",
"Studds Full Face","Vega Full Face",
"Steelbird Full Face","LS2 Full Face",
"MT Full Face","Axor Full Face",
"SMK Full Face","Royal Enfield Full Face",
"TVS Full Face","Hero Full Face",
"Studds Open Face","Vega Open Face",
"Steelbird Open Face","LS2 Open Face",
"MT Open Face","Axor Open Face",
"SMK Open Face","Royal Enfield Open Face",
"TVS Open Face","Hero Open Face",
"Studds Flip Up","Vega Flip Up",
"Steelbird Flip Up","LS2 Flip Up",
"MT Flip Up","Axor Flip Up",
"SMK Flip Up"};
	 return helmetBrands ;
	 }
	 
	 if(productName == "slippers"){
	 String slippersBrands[] = {"Bata Slippers","Sparx Slippers","Relaxo Slippers",
"Paragon Slippers","Liberty Slippers",
"Campus Slippers","Puma Slippers",
"Adidas Slippers","Nike Slippers",
"Woodland Slippers",
"Bata Flip Flops","Sparx Flip Flops",
"Relaxo Flip Flops","Paragon Flip Flops",
"Liberty Flip Flops","Campus Flip Flops",
"Puma Flip Flops","Adidas Flip Flops",
"Nike Flip Flops","Woodland Flip Flops",
"Bata Sandals","Sparx Sandals",
"Relaxo Sandals","Paragon Sandals",
"Liberty Sandals","Campus Sandals",
"Puma Sandals","Adidas Sandals",
"Nike Sandals","Woodland Sandals",
"Bata Casual Slippers",
"Sparx Casual Slippers",
"Relaxo Casual Slippers",
"Paragon Casual Slippers",
"Liberty Casual Slippers",
"Campus Casual Slippers",
"Puma Casual Slippers"};
	 return slippersBrands ;
	 }
	 
	 if(productName == "socks"){
	 String socksBrands[] = {"Jockey Socks","Puma Socks","Adidas Socks",
"Nike Socks","Reebok Socks",
"Fila Socks","Under Armour Socks",
"HRX Socks","US Polo Socks",
"Allen Solly Socks",
"Jockey Ankle Socks",
"Puma Ankle Socks","Adidas Ankle Socks",
"Nike Ankle Socks","Reebok Ankle Socks",
"Fila Ankle Socks","Under Armour Ankle Socks",
"HRX Ankle Socks","US Polo Ankle Socks",
"Allen Solly Ankle Socks",
"Jockey Crew Socks","Puma Crew Socks",
"Adidas Crew Socks","Nike Crew Socks",
"Reebok Crew Socks","Fila Crew Socks",
"Under Armour Crew Socks",
"HRX Crew Socks","US Polo Crew Socks",
"Allen Solly Crew Socks",
"Jockey Sports Socks",
"Puma Sports Socks","Adidas Sports Socks",
"Nike Sports Socks","Reebok Sports Socks",
"Fila Sports Socks","Under Armour Sports Socks"};
	 return socksBrands ;
	 }
	 
	 if(productName == "innerwear"){
	 String innerwearBrands[] = {"Jockey Innerwear","Lux Cozi Innerwear","Rupa Innerwear",
"VIP Innerwear","Dollar Innerwear",
"Amul Macho Innerwear","Enamor Innerwear",
"Zivame Innerwear","Clovia Innerwear",
"Calvin Klein Innerwear",
"Jockey Briefs","Lux Cozi Briefs",
"Rupa Briefs","VIP Briefs",
"Dollar Briefs","Amul Macho Briefs",
"Enamor Bra","Zivame Bra",
"Clovia Bra","Calvin Klein Bra",
"Jockey Vest","Lux Cozi Vest",
"Rupa Vest","VIP Vest",
"Dollar Vest","Amul Macho Vest",
"Enamor Camisole","Zivame Camisole",
"Clovia Camisole","Calvin Klein Vest",
"Jockey Trunks","Lux Cozi Trunks",
"Rupa Trunks","VIP Trunks",
"Dollar Trunks","Amul Macho Trunks",
"Jockey Sports Innerwear"};
	 return innerwearBrands ;
	 }
	 
	 if(productName == "bedsheet"){
	 String bedsheetBrands[] = {"Bombay Dyeing Bedsheet","Spaces Bedsheet","Trident Bedsheet",
"Welspun Bedsheet","D'Decor Bedsheet",
"Portico Bedsheet","Raymond Home Bedsheet",
"Amazon Basics Bedsheet","BB Home Bedsheet",
"Ikea Bedsheet","Home Centre Bedsheet",
"Story@Home Bedsheet","Cotton Craft Bedsheet",
"Bombay Dyeing Cotton Sheet",
"Spaces Cotton Sheet",
"Trident Cotton Sheet",
"Welspun Cotton Sheet",
"D'Decor Cotton Sheet",
"Portico Cotton Sheet",
"Raymond Cotton Sheet",
"Amazon Basics Cotton Sheet",
"BB Home Cotton Sheet",
"Ikea Cotton Sheet",
"Home Centre Cotton Sheet",
"Story@Home Cotton Sheet",
"Bombay Dyeing King Size",
"Spaces King Size",
"Trident King Size",
"Welspun King Size",
"D'Decor King Size",
"Portico King Size",
"Raymond King Size",
"Amazon Basics King Size",
"BB Home King Size",
"Ikea King Size",
"Home Centre King Size",
"Story@Home King Size"};
	 return bedsheetBrands ;
	 }
	 
	 if(productName == "pillow"){
	 String pillowBrands[] = {"Sleepwell Pillow","Kurlon Pillow","Duroflex Pillow",
"Wakefit Pillow","Springfit Pillow",
"Coirfit Pillow","Amazon Basics Pillow",
"BB Home Pillow","Ikea Pillow",
"Home Centre Pillow","Spaces Pillow",
"Trident Pillow","Welspun Pillow",
"D'Decor Pillow","Sleepwell Memory Foam",
"Kurlon Memory Foam",
"Duroflex Memory Foam",
"Wakefit Memory Foam",
"Springfit Memory Foam",
"Coirfit Memory Foam",
"Amazon Basics Memory Foam",
"BB Home Memory Foam",
"Ikea Memory Foam",
"Home Centre Memory Foam",
"Spaces Cotton Pillow",
"Trident Cotton Pillow",
"Welspun Cotton Pillow",
"D'Decor Cotton Pillow",
"Sleepwell Soft Pillow",
"Kurlon Soft Pillow",
"Duroflex Soft Pillow",
"Wakefit Soft Pillow",
"Springfit Soft Pillow",
"Coirfit Soft Pillow",
"Amazon Basics Soft Pillow",
"Ikea Soft Pillow",
"Home Centre Soft Pillow"};
	 return pillowBrands ;
	 }
	 
	 if(productName == "blanket"){
	 String blanketBrands[] = {"Bombay Dyeing Blanket","Spaces Blanket","Trident Blanket",
"Welspun Blanket","D'Decor Blanket",
"Portico Blanket","Raymond Home Blanket",
"Amazon Basics Blanket","BB Home Blanket",
"Ikea Blanket","Home Centre Blanket",
"Story@Home Blanket","Cotton Craft Blanket",
"Bombay Dyeing Fleece Blanket",
"Spaces Fleece Blanket",
"Trident Fleece Blanket",
"Welspun Fleece Blanket",
"D'Decor Fleece Blanket",
"Portico Fleece Blanket",
"Raymond Fleece Blanket",
"Amazon Basics Fleece Blanket",
"BB Home Fleece Blanket",
"Ikea Fleece Blanket",
"Home Centre Fleece Blanket",
"Story@Home Fleece Blanket",
"Bombay Dyeing Wool Blanket",
"Spaces Wool Blanket",
"Trident Wool Blanket",
"Welspun Wool Blanket",
"D'Decor Wool Blanket",
"Portico Wool Blanket",
"Raymond Wool Blanket",
"Amazon Basics Wool Blanket",
"BB Home Wool Blanket",
"Ikea Wool Blanket",
"Home Centre Wool Blanket",
"Story@Home Wool Blanket"};
	 return blanketBrands ;
	 }
	 
	if (productName=="mattress"){
    String[] mattressBrands = {"Sleepwell Mattress","Kurlon Mattress","Duroflex Mattress","Wakefit Mattress","Springfit Mattress","Coirfit Mattress","Peps Mattress","Sunday Mattress","Flo Mattress","Amazon Basics Mattress",
        "Sleepwell Foam Mattress","Kurlon Foam Mattress","Duroflex Foam Mattress","Wakefit Foam Mattress","Springfit Foam Mattress","Coirfit Foam Mattress","Peps Foam Mattress","Sunday Foam Mattress","Flo Foam Mattress","Amazon Basics Foam Mattress",
        "Sleepwell Memory Foam","Kurlon Memory Foam","Duroflex Memory Foam","Wakefit Memory Foam","Springfit Memory Foam","Coirfit Memory Foam","Peps Memory Foam","Sunday Memory Foam","Flo Memory Foam","Amazon Basics Memory Foam",
	"Sleepwell Orthopedic","Kurlon Orthopedic","Duroflex Orthopedic","Wakefit Orthopedic","Springfit Orthopedic","Coirfit Orthopedic","Peps Orthopedic"};
    return mattressBrands;
    }


    if (productName=="plasticContainer"){
    String[] plasticContainerBrands = {"Tupperware Container","Cello Container","Milton Container","Signoraware Container","Princeware Container","Supreme Container","Nayasa Container","BB Home Container","Ikea Container","Home Centre Container",
        "Tupperware Airtight","Cello Airtight Container","Milton Airtight Container","Signoraware Airtight Container","Princeware Airtight Container","Supreme Airtight Container","Nayasa Airtight Container","BB Home Airtight Container","Ikea Airtight Container","Home Centre Airtight Container",
        "Tupperware Microwave Safe","Cello Microwave Safe","Milton Microwave Safe","Signoraware Microwave Safe","Princeware Microwave Safe","Supreme Microwave Safe","Nayasa Microwave Safe","BB Home Microwave Safe","Ikea Microwave Safe","Home Centre Microwave Safe",
        "Tupperware Storage Box","Cello Storage Box","Milton Storage Box","Signoraware Storage Box","Princeware Storage Box","Supreme Storage Box","Nayasa Storage Box"};
    return plasticContainerBrands;
    }


    if (productName=="steelBottle"){
    String[] steelBottleBrands = {
        "Milton Steel Bottle","Cello Steel Bottle","Signoraware Steel Bottle","Tupperware Steel Bottle","Borossil Steel Bottle","Pigeon Steel Bottle","Prestige Steel Bottle",
        "Borosil Thermos","Milton Thermosteel","Cello Thermosteel","Signoraware Thermosteel","Tupperware Thermosteel","Borossil Thermosteel","Pigeon Thermosteel","Prestige Thermosteel",
        "Milton Insulated Bottle","Cello Insulated Bottle","Signoraware Insulated Bottle","Tupperware Insulated Bottle","Borossil Insulated Bottle","Pigeon Insulated Bottle","Prestige Insulated Bottle",
        "Milton Flask","Cello Flask","Signoraware Flask","Tupperware Flask","Borossil Flask","Pigeon Flask","Prestige Flask",
        "Milton Sports Bottle","Cello Sports Bottle","Signoraware Sports Bottle","Tupperware Sports Bottle","Borossil Sports Bottle","Pigeon Sports Bottle","Prestige Sports Bottle",
        "Milton Premium Bottle" };
    return steelBottleBrands;
    }
	 
	 if (productName=="lunchBox"){
     String[] lunchBoxBrands = {"Milton Lunch Box","Cello Lunch Box","Signoraware Lunch Box","Tupperware Lunch Box","Borossil Lunch Box","Pigeon Lunch Box","Prestige Lunch Box","Vaya Lunch Box","Amazon Basics Lunch Box","BB Home Lunch Box",
                "Milton Steel Lunch Box","Cello Steel Lunch Box","Signoraware Steel Lunch Box","Tupperware Steel Lunch Box","Borossil Steel Lunch Box","Pigeon Steel Lunch Box","Prestige Steel Lunch Box","Vaya Steel Lunch Box",
                "Milton Insulated Lunch Box","Cello Insulated Lunch Box","Signoraware Insulated Lunch Box","Tupperware Insulated Lunch Box","Borossil Insulated Lunch Box","Pigeon Insulated Lunch Box","Prestige Insulated Lunch Box","Vaya Insulated Lunch Box",
                "Milton Kids Lunch Box","Cello Kids Lunch Box","Signoraware Kids Lunch Box","Tupperware Kids Lunch Box","Borossil Kids Lunch Box","Pigeon Kids Lunch Box","Prestige Kids Lunch Box","Vaya Kids Lunch Box",
                "Amazon Basics Steel Lunch Box","BB Home Steel Lunch Box","Milton Premium Lunch Box"
            };
    return lunchBoxBrands;
    }

    if (productName=="pressureCooker"){
    String[] pressureCookerBrands = {"Prestige Pressure Cooker","Hawkins Pressure Cooker","Pigeon Pressure Cooker","Butterfly Pressure Cooker","Wonderchef Pressure Cooker","Milton Pressure Cooker","Cello Pressure Cooker","United Pressure Cooker","Bajaj Pressure Cooker","Panasonic Pressure Cooker",
                "Prestige Aluminium Cooker","Hawkins Aluminium Cooker","Pigeon Aluminium Cooker","Butterfly Aluminium Cooker","Wonderchef Aluminium Cooker",
                "Prestige Stainless Steel","Hawkins Stainless Steel","Pigeon Stainless Steel","Butterfly Stainless Steel","Wonderchef Stainless Steel",
                "Prestige Induction Base","Hawkins Induction Base","Pigeon Induction Base","Butterfly Induction Base","Wonderchef Induction Base",
                "Prestige Deluxe Cooker","Hawkins Deluxe Cooker","Pigeon Deluxe Cooker","Butterfly Deluxe Cooker","Wonderchef Deluxe Cooker",
                "Prestige Clip On","Hawkins Contura","Pigeon Special Cooker","Butterfly Curve Cooker","Wonderchef Turbo Cooker","Prestige Popular Cooker","Hawkins Classic Cooker"};
    return pressureCookerBrands;
    }

    if (productName=="gasStove"){
    String[] gasStoveBrands = {
                "Prestige Gas Stove","Sunflame Gas Stove","Butterfly Gas Stove","Pigeon Gas Stove","Glen Gas Stove","Bajaj Gas Stove","Elica Gas Stove","Hindware Gas Stove","Milton Gas Stove","Lifelong Gas Stove",
                "Prestige 2 Burner","Sunflame 2 Burner","Butterfly 2 Burner","Pigeon 2 Burner","Glen 2 Burner","Bajaj 2 Burner","Elica 2 Burner","Hindware 2 Burner",
                "Prestige 3 Burner","Sunflame 3 Burner","Butterfly 3 Burner","Pigeon 3 Burner","Glen 3 Burner","Bajaj 3 Burner","Elica 3 Burner","Hindware 3 Burner",
                "Prestige 4 Burner","Sunflame 4 Burner","Butterfly 4 Burner","Pigeon 4 Burner","Glen 4 Burner","Bajaj 4 Burner","Elica 4 Burner","Hindware 4 Burner",
                "Prestige Glass Top","Sunflame Glass Top","Butterfly Glass Top"};
    return gasStoveBrands;
    }
	
	    if(productName == "bodyMist"){
        String bodyMistBrands[] = {
            "Victoria Secret","Layer’r","Engage","Plum","Bella Vita","Yardley",
            "Fogg","Park Avenue","Nike","Adidas","Secret Temptation",
            "Axe","Denver","Beardo","The Man Company","Skinn",
            "Zara","Bath & Body Works","Marks & Spencer","Guess",
            "Calvin Klein","Chanel","Dior","Gucci","Armaf",
            "Ajmal","Rasasi","Jovan","Envy","Wild Stone",
            "Miniso","Nykaa","Titan Skinn","BellaVita Luxury",
            "Colorbar","Revlon","Oriflame"
        };
        return bodyMistBrands;
    }

    if(productName == "faceSerum"){
        String faceSerumBrands[] = {
            "Minimalist","Mamaearth","Plum","Lakme","L'Oreal","Biotique",
            "WOW","Himalaya","Neutrogena","Olay","Garnier",
            "Cetaphil","Forest Essentials","Khadi","Dot & Key",
            "Pilgrim","MCaffeine","The Derma Co","Aqualogica",
            "Re'equil","Blue Heaven","Swiss Beauty","Ponds",
            "Nivea","Colorbar","Sugar","Nykaa","Good Vibes",
            "Earth Rhythm","Juicy Chemistry","Soulflower",
            "Lotus","VLCC","Faces Canada","Innisfree",
            "The Face Shop","Clinique"
        };
        return faceSerumBrands;
    }

    if(productName == "sunscreen"){
        String sunscreenBrands[] = {
            "Lotus","Neutrogena","Minimalist","Lakme","Mamaearth",
            "Biotique","WOW","Himalaya","VLCC","Nivea",
            "Ponds","Olay","Garnier","Plum","Aqualogica",
            "Re'equil","The Derma Co","Dot & Key","Cetaphil",
            "La Shield","Bioderma","Fixderma","ISDIN",
            "Banana Boat","Coppertone","Aveeno","Forest Essentials",
            "Khadi","MCaffeine","Earth Rhythm","Juicy Chemistry",
            "Blue Heaven","Swiss Beauty","Colorbar",
            "Faces Canada","Innisfree","Clinique"
        };
        return sunscreenBrands;
    }

    if(productName == "lipBalm"){
        String lipBalmBrands[] = {
            "Nivea","Maybelline","Lakme","Vaseline","Himalaya",
            "Biotique","WOW","Mamaearth","Plum","Dot & Key",
            "MCaffeine","The Derma Co","Sugar","Nykaa",
            "Swiss Beauty","Colorbar","Faces Canada","Blue Heaven",
            "Forest Essentials","Khadi","Juicy Chemistry",
            "Earth Rhythm","Revlon","Elle 18","Chambor",
            "Clinique","MAC","Bobbi Brown","Dior",
            "Laneige","Sebamed","Neutrogena","Ponds",
            "Good Vibes","VLCC","Innisfree","The Face Shop"
        };
        return lipBalmBrands;
    }

    if(productName == "lipstick"){
        String lipstickBrands[] = {
            "Lakme","Maybelline","MAC","Sugar","Nykaa",
            "Colorbar","Swiss Beauty","Faces Canada","Blue Heaven",
            "L'Oreal","Revlon","Elle 18","Chambor","Clinique",
            "Bobbi Brown","Dior","Huda Beauty","Kay Beauty",
            "Plum","Mamaearth","MyGlamm","Insight",
            "Wet n Wild","Sephora","Smashbox","Lotus",
            "Oriflame","Avon","Forest Essentials","Khadi",
            "Swiss","Just Herbs","Milani","Charmacy",
            "Innisfree","The Face Shop","LA Girl"
        };
        return lipstickBrands;
    }

    if(productName == "foundation"){
        String foundationBrands[] = {
            "Maybelline","Lakme","MAC","L'Oreal","Swiss Beauty",
            "Colorbar","Faces Canada","Blue Heaven","Revlon","Clinique",
            "Bobbi Brown","Dior","Huda Beauty","Kay Beauty",
            "Sugar","Nykaa","Plum","Mamaearth","MyGlamm",
            "Insight","Wet n Wild","Sephora","Smashbox",
            "Lotus","Oriflame","Avon","Forest Essentials",
            "Khadi","Milani","Charmacy","LA Girl",
            "Covergirl","Estee Lauder","NARS","Fenty Beauty",
            "Chambor","Makeup Revolution"
        };
        return foundationBrands;
    }

    if(productName == "facePowder"){
        String facePowderBrands[] = {
            "Ponds","Lakme","Maybelline","Colorbar","Blue Heaven",
            "Swiss Beauty","Faces Canada","Revlon","Clinique",
            "Bobbi Brown","Dior","Huda Beauty","Kay Beauty",
            "Sugar","Nykaa","Plum","Mamaearth","MyGlamm",
            "Insight","Wet n Wild","Sephora","Smashbox",
            "Lotus","Oriflame","Avon","Forest Essentials",
            "Khadi","Milani","Charmacy","LA Girl",
            "Covergirl","Estee Lauder","NARS","Fenty Beauty",
            "Chambor","Makeup Revolution","Elle 18"
        };
        return facePowderBrands;
    }

    if(productName == "nailPolish"){
        String nailPolishBrands[] = {
            "Lakme","Colorbar","Nykaa","Faces Canada","Sugar",
            "Blue Heaven","Swiss Beauty","Revlon","Elle 18",
            "Chambor","Clinique","Bobbi Brown","Dior",
            "Kay Beauty","MyGlamm","Insight","Wet n Wild",
            "Sephora","Smashbox","Lotus","Oriflame",
            "Avon","Forest Essentials","Khadi","Milani",
            "Charmacy","LA Girl","Covergirl","NARS",
            "Fenty Beauty","Makeup Revolution","O.P.I",
            "Zoya","Sally Hansen","Miniso","Bella Vita","Plum"
        };
        return nailPolishBrands;
    }

    if(productName == "eyeLiner"){
        String eyeLinerBrands[] = {
            "Lakme","Maybelline","L'Oreal","Plum","Colorbar",
            "Swiss Beauty","Faces Canada","Blue Heaven",
            "Revlon","Clinique","Bobbi Brown","Dior",
            "Huda Beauty","Kay Beauty","Sugar","Nykaa",
            "MyGlamm","Insight","Wet n Wild","Sephora",
            "Smashbox","Lotus","Oriflame","Avon",
            "Forest Essentials","Khadi","Milani","Charmacy",
            "LA Girl","Covergirl","Estee Lauder","NARS",
            "Fenty Beauty","Makeup Revolution","Elle 18",
            "Miniso","Bella Vita"
        };
        return eyeLinerBrands;
    }

    if(productName == "mascara"){
        String mascaraBrands[] = {
            "Maybelline","Lakme","L'Oreal","Faces Canada","Essence",
            "Colorbar","Swiss Beauty","Blue Heaven","Revlon",
            "Clinique","Bobbi Brown","Dior","Huda Beauty",
            "Kay Beauty","Sugar","Nykaa","MyGlamm",
            "Insight","Wet n Wild","Sephora","Smashbox",
            "Lotus","Oriflame","Avon","Forest Essentials",
            "Khadi","Milani","Charmacy","LA Girl",
            "Covergirl","Estee Lauder","NARS","Fenty Beauty",
            "Makeup Revolution","Elle 18","Miniso","Plum"
        };
        return mascaraBrands;
    }
	
	    if(productName == "faceMask"){
        String faceMaskBrands[] = {
            "Mamaearth","Plum","Garnier","WOW","Biotique",
            "Himalaya","Dot & Key","MCaffeine","The Derma Co",
            "Aqualogica","Re'equil","Blue Heaven","Swiss Beauty",
            "Ponds","Nivea","Colorbar","Sugar","Nykaa",
            "Good Vibes","Earth Rhythm","Juicy Chemistry",
            "Soulflower","Lotus","VLCC","Faces Canada",
            "Innisfree","The Face Shop","Clinique",
            "Forest Essentials","Khadi","Pilgrim","Cetaphil",
            "Neutrogena","Olay","Glamveda","Miniso","Bella Vita"
        };
        return faceMaskBrands;
    }

    if(productName == "wetWipes"){
        String wetWipesBrands[] = {
            "Himalaya","Johnson","Pee Safe","Dettol","Savlon",
            "Carefree","Clean & Dry","Bella","Sirona",
            "Tulips","Mother Sparsh","LuvLap","Pampers",
            "Mee Mee","Chicco","Dabur","VLCC",
            "Miniso","Colin","Lizol","Good Vibes",
            "Earth Rhythm","Juicy Chemistry","MCaffeine",
            "WOW","Mamaearth","Plum","Khadi",
            "Forest Essentials","Nivea","Ponds","Biotique",
            "Neutrogena","Cetaphil","Blue Heaven","Swiss Beauty","Nykaa"
        };
        return wetWipesBrands;
    }

    if(productName == "cottonPads"){
        String cottonPadsBrands[] = {
            "Bella","Tulips","Pee Safe","Sirona","Clean & Dry",
            "Johnson","Himalaya","Miniso","Mee Mee",
            "Chicco","LuvLap","Pampers","Mother Sparsh",
            "Carefree","Dabur","VLCC","Good Vibes",
            "Earth Rhythm","Juicy Chemistry","MCaffeine",
            "WOW","Mamaearth","Plum","Khadi",
            "Forest Essentials","Nivea","Ponds","Biotique",
            "Neutrogena","Cetaphil","Blue Heaven","Swiss Beauty",
            "Nykaa","Faces Canada","Colorbar","Sugar","Lotus"
        };
        return cottonPadsBrands;
    }

    if(productName == "faceToner"){
        String faceTonerBrands[] = {
            "Plum","Minimalist","Biotique","Mamaearth","WOW",
            "Himalaya","Dot & Key","MCaffeine","The Derma Co",
            "Aqualogica","Re'equil","Blue Heaven","Swiss Beauty",
            "Ponds","Nivea","Colorbar","Sugar","Nykaa",
            "Good Vibes","Earth Rhythm","Juicy Chemistry",
            "Soulflower","Lotus","VLCC","Faces Canada",
            "Innisfree","The Face Shop","Clinique",
            "Forest Essentials","Khadi","Pilgrim","Cetaphil",
            "Neutrogena","Olay","Garnier","Bella Vita","Miniso"
        };
        return faceTonerBrands;
    }

    if(productName == "hairSerum"){
        String hairSerumBrands[] = {
            "Livon","Streax","L'Oreal","Matrix","Biolage",
            "Mamaearth","Plum","WOW","Himalaya",
            "Dove","Tresemme","Pantene","Garnier",
            "Khadi","Forest Essentials","Pilgrim","Soulflower",
            "MCaffeine","The Derma Co","Aqualogica",
            "Re'equil","VLCC","Lotus","Nykaa",
            "Colorbar","Swiss Beauty","Miniso","Bella Vita",
            "Head & Shoulders","Clinic Plus","Sunsilk",
            "Indulekha","Kesh King","Vasmol","BBlunt",
            "Schwarzkopf","Wella"
        };
        return hairSerumBrands;
    }

    if(productName == "hairSpray"){
        String hairSprayBrands[] = {
            "Set Wet","L'Oreal","Tresemme","Enliven","Nova",
            "BBlunt","Schwarzkopf","Wella","Matrix",
            "Biolage","Streax","Livon","Gatsby",
            "UrbanGabru","Beardo","Park Avenue","Wild Stone",
            "Axe","Denver","Nike","Adidas",
            "Secret Temptation","Layer’r","Engage","Fogg",
            "Bella Vita","Miniso","Plum","Mamaearth",
            "WOW","Himalaya","Khadi","Forest Essentials",
            "Lotus","VLCC","Nykaa","Colorbar"
        };
        return hairSprayBrands;
    }

    if(productName == "hairGel"){
        String hairGelBrands[] = {
            "Set Wet","Gatsby","UrbanGabru","Beardo","Park Avenue",
            "Wild Stone","Axe","Denver","Nike",
            "Adidas","Secret Temptation","Layer’r","Engage",
            "Fogg","Bella Vita","Miniso","Plum",
            "Mamaearth","WOW","Himalaya","Khadi",
            "Forest Essentials","Lotus","VLCC","Nykaa",
            "Colorbar","Swiss Beauty","Tresemme","L'Oreal",
            "Matrix","Biolage","BBlunt","Schwarzkopf",
            "Wella","Livon","Streax","Soulflower"
        };
        return hairGelBrands;
    }

    if(productName == "trimmer"){
        String trimmerBrands[] = {
            "Philips","Nova","Syska","Mi","Panasonic",
            "Havells","Usha","Bajaj","Vega",
            "Ikonic","Beardo","The Man Company",
            "Braun","Remington","Wahl","Andis",
            "Kemei","Geemy","Realme","Samsung",
            "Boat","Noise","FireBoltt","Portronics",
            "Zebronics","Ambrane","HP","Dell",
            "Lenovo","Asus","Sony","JBL",
            "Panasonic Pro","Sharp","Orient","Croma","AmazonBasics"
        };
        return trimmerBrands;
    }

    if(productName == "hairDryer"){
        String hairDryerBrands[] = {
            "Philips","Nova","Syska","Havells","Panasonic",
            "Usha","Bajaj","Vega","Ikonic",
            "Braun","Remington","Wahl","Andis",
            "Kemei","Geemy","Realme","Samsung",
            "Boat","Noise","Portronics","Zebronics",
            "Ambrane","HP","Dell","Lenovo",
            "Asus","Sony","JBL","Sharp",
            "Orient","Croma","AmazonBasics","Miniso",
            "Bella Vita","Plum","Mamaearth","WOW"
        };
        return hairDryerBrands;
    }

    if(productName == "straightener"){
        String straightenerBrands[] = {
            "Philips","Havells","Vega","Nova","Ikonic",
            "Braun","Remington","Wahl","Andis",
            "Kemei","Geemy","Realme","Samsung",
            "Boat","Noise","Portronics","Zebronics",
            "Ambrane","HP","Dell","Lenovo",
            "Asus","Sony","JBL","Sharp",
            "Orient","Croma","AmazonBasics","Miniso",
            "Bella Vita","Plum","Mamaearth","WOW",
            "Khadi","Forest Essentials","BBlunt","Schwarzkopf","Wella"
        };
        return straightenerBrands;
    }
	 
	 
	    if(productName == "electricKettle"){
        String electricKettleBrands[] = {
            "Prestige","Pigeon","Bajaj","Philips","Butterfly",
            "Havells","Usha","Morphy Richards","Kent",
            "Orpat","Milton","Crompton","V-Guard",
            "Wonderchef","Inalsa","Black+Decker","Bosch",
            "Panasonic","Sharp","Samsung","LG",
            "Lifelong","Agaro","Cello","Borosil",
            "Hindware","Orient","Jaipan","Sunflame",
            "Skyline","Maharaja Whiteline","Chefman",
            "AmazonBasics","Hamilton Beach","Russell Hobbs",
            "KitchenAid","Baltra"
        };
        return electricKettleBrands;
    }

    if(productName == "mixerGrinder"){
        String mixerGrinderBrands[] = {
            "Prestige","Bajaj","Preethi","Philips","Sujata",
            "Butterfly","Havells","Usha","Morphy Richards",
            "Bosch","Panasonic","Sharp","Samsung",
            "LG","Inalsa","Wonderchef","Maharaja Whiteline",
            "Jaipan","Sunflame","Orient","Crompton",
            "V-Guard","Lifelong","Agaro","Cello",
            "Borosil","Hindware","Skyline","Baltra",
            "Chefman","Hamilton Beach","Russell Hobbs",
            "KitchenAid","Black+Decker","AmazonBasics",
            "Kenstar","Singer"
        };
        return mixerGrinderBrands;
    }

    if(productName == "inductionStove"){
        String inductionStoveBrands[] = {
            "Prestige","Pigeon","Bajaj","Philips","Havells",
            "Usha","Morphy Richards","Bosch","Panasonic",
            "Sharp","Samsung","LG","Inalsa",
            "Wonderchef","Maharaja Whiteline","Jaipan",
            "Sunflame","Orient","Crompton","V-Guard",
            "Lifelong","Agaro","Cello","Borosil",
            "Hindware","Skyline","Baltra","Chefman",
            "Hamilton Beach","Russell Hobbs","KitchenAid",
            "Black+Decker","AmazonBasics","Kenstar",
            "Singer","Butterfly","Orpat"
        };
        return inductionStoveBrands;
    }

    if(productName == "ironBox"){
        String ironBoxBrands[] = {
            "Philips","Bajaj","Usha","Morphy Richards","Havells",
            "Panasonic","Bosch","Black+Decker","Orient",
            "Crompton","V-Guard","Singer","Kenstar",
            "Jaipan","Sunflame","Butterfly","Inalsa",
            "Wonderchef","Maharaja Whiteline","Sharp",
            "Samsung","LG","Cello","Agaro",
            "Lifelong","AmazonBasics","Hamilton Beach",
            "Russell Hobbs","KitchenAid","Baltra",
            "Skyline","Hindware","Orpat","Prestige",
            "Pigeon","Nova","Syska"
        };
        return ironBoxBrands;
    }

    if(productName == "ceilingFan"){
        String ceilingFanBrands[] = {
            "Usha","Havells","Crompton","Orient","Bajaj",
            "V-Guard","Atomberg","Polycab","Luminous",
            "Anchor","Khaitan","Kenstar","Hindware",
            "Panasonic","Philips","Sharp","Samsung",
            "LG","Bosch","Singer","Jaipan",
            "Sunflame","Butterfly","Inalsa","Wonderchef",
            "Maharaja Whiteline","Orpat","Nova","Syska",
            "Cello","Agaro","Lifelong","AmazonBasics",
            "Hamilton Beach","Russell Hobbs","KitchenAid","Baltra"
        };
        return ceilingFanBrands;
    }

    if(productName == "wallClock"){
        String wallClockBrands[] = {
            "Ajanta","Titan","Sonata","Orpat","Casio",
            "Seiko","Maxima","Fastrack","Timex",
            "Citizen","Quartz","Random","HMT",
            "Skmei","Daniel Klein","Guess","Tommy Hilfiger",
            "Fossil","Rolex","Omega","Rado",
            "Tissot","Miniso","Ikea","Nilkamal",
            "Godrej","Urban Ladder","Durian","Cello",
            "AmazonBasics","Flipkart SmartBuy","Boat",
            "Noise","FireBoltt","Portronics","Zebronics","Sharp"
        };
        return wallClockBrands;
    }

    if(productName == "waterHeater"){
        String waterHeaterBrands[] = {
            "Bajaj","Havells","Racold","AO Smith","V-Guard",
            "Crompton","Orient","Kenstar","Hindware",
            "Usha","Jaipan","Sunflame","Butterfly",
            "Inalsa","Wonderchef","Maharaja Whiteline",
            "Orpat","Nova","Syska","Cello",
            "Agaro","Lifelong","AmazonBasics","Hamilton Beach",
            "Russell Hobbs","KitchenAid","Baltra","Sharp",
            "Samsung","LG","Bosch","Panasonic",
            "Philips","Singer","Prestige","Pigeon","Kenmore"
        };
        return waterHeaterBrands;
    }

    if(productName == "powerBank"){
        String powerBankBrands[] = {
            "Mi","Realme","Syska","Ambrane","Boat",
            "Noise","FireBoltt","Portronics","Zebronics",
            "Samsung","Sony","Anker","Redmi",
            "Oppo","Vivo","OnePlus","Lenovo",
            "Asus","HP","Dell","Acer",
            "Intex","Lava","Karbonn","Micromax",
            "Philips","Panasonic","Sharp","AmazonBasics",
            "Flipkart SmartBuy","Duracell","Energizer",
            "Belkin","TP-Link","Baseus","Spigen","Croma"
        };
        return powerBankBrands;
    }

    if(productName == "earphones"){
        String earphonesBrands[] = {
            "Boat","JBL","Sony","Realme","Noise",
            "FireBoltt","Portronics","Zebronics","Samsung",
            "OnePlus","Oppo","Vivo","Mi",
            "Redmi","Anker","Skullcandy","Sennheiser",
            "Beats","Bose","Philips","Panasonic",
            "Sharp","HP","Dell","Asus",
            "Lenovo","Acer","Ambrane","Syska",
            "Intex","Lava","Karbonn","Micromax",
            "Belkin","TP-Link","Baseus","Spigen"
        };
        return earphonesBrands;
    }

    if(productName == "bluetoothSpeaker"){
        String bluetoothSpeakerBrands[] = {
            "Boat","JBL","Sony","Portronics","Zebronics",
            "Noise","FireBoltt","Samsung","OnePlus",
            "Oppo","Vivo","Mi","Redmi",
            "Anker","Skullcandy","Sennheiser","Beats",
            "Bose","Philips","Panasonic","Sharp",
            "HP","Dell","Asus","Lenovo",
            "Acer","Ambrane","Syska","Intex",
            "Lava","Karbonn","Micromax","Belkin",
            "TP-Link","Baseus","Spigen","Croma"
        };
        return bluetoothSpeakerBrands;
    }
	
	    if(productName == "mobileCover"){
        String mobileCoverBrands[] = {
            "Spigen","Ringke","DailyObjects","Noise","AmazonBasics",
            "Flipkart SmartBuy","Boat","Portronics","Zebronics",
            "Realme","Mi","Redmi","Samsung",
            "OnePlus","Oppo","Vivo","Apple",
            "Nothing","iQOO","Poco","Lenovo",
            "Asus","HP","Dell","Intex",
            "Lava","Karbonn","Micromax","Belkin",
            "Baseus","TP-Link","Croma","Urban Armor",
            "OtterBox","CaseMate","ESR","Supcase"
        };
        return mobileCoverBrands;
    }

    if(productName == "laptopBag"){
        String laptopBagBrands[] = {
            "Wildcraft","Skybags","American Tourister","Dell","HP",
            "Lenovo","Asus","Acer","Safari",
            "VIP","Puma","Adidas","Nike",
            "Tommy Hilfiger","Fossil","Targus","Swiss Gear",
            "Samsonite","Urban Jungle","Gear","Lavie",
            "Baggit","Caprese","AmazonBasics","Flipkart SmartBuy",
            "Portronics","Boat","Zebronics","Realme",
            "Mi","Redmi","Spigen","CaseLogic",
            "Thule","Arctic Hunter","Miniso","WildHorn","Croma"
        };
        return laptopBagBrands;
    }

    if(productName == "travelBag"){
        String travelBagBrands[] = {
            "VIP","Safari","Skybags","American Tourister","Wildcraft",
            "Samsonite","Swiss Gear","Tommy Hilfiger","Fossil",
            "Puma","Adidas","Nike","Lavie",
            "Baggit","Caprese","Urban Jungle","Gear",
            "AmazonBasics","Flipkart SmartBuy","Portronics",
            "Boat","Zebronics","Realme","Mi",
            "Redmi","Spigen","Thule","Arctic Hunter",
            "Miniso","WildHorn","Croma","Delsey",
            "It Luggage","Carlton","Rimowa","Echolac","Kamiliant"
        };
        return travelBagBrands;
    }

    if(productName == "wallet"){
        String walletBrands[] = {
            "WildHorn","Tommy Hilfiger","Fossil","Levis","Puma",
            "Adidas","Nike","Woodland","Allen Solly",
            "Van Heusen","Louis Philippe","Peter England",
            "Baggit","Caprese","Lavie","Urban Forest",
            "Hidesign","Da Milano","Titan","Sonata",
            "AmazonBasics","Flipkart SmartBuy","Miniso",
            "Wildcraft","Gear","Skybags","VIP",
            "Safari","Armani","Gucci","Calvin Klein",
            "Michael Kors","Montblanc","Police","Pepe Jeans","United Colors","Croma"
        };
        return walletBrands;
    }

    if(productName == "sunglasses"){
        String sunglassesBrands[] = {
            "RayBan","Fastrack","Vincent Chase","IDEE","Oakley",
            "Polaroid","Carrera","Gucci","Prada",
            "Armani","Calvin Klein","Tommy Hilfiger","Police",
            "Puma","Adidas","Nike","Louis Philippe",
            "Allen Solly","Van Heusen","Peter England",
            "Titan","Sonata","Fossil","Michael Kors",
            "Montblanc","Pepe Jeans","United Colors",
            "Lenskart","John Jacobs","Roadster","H&M",
            "Zara","Forever 21","Miniso","AmazonBasics","Flipkart SmartBuy","Croma"
        };
        return sunglassesBrands;
    }

    if(productName == "watch"){
        String watchBrands[] = {
            "Titan","Fastrack","Casio","Sonata","Timex",
            "Fossil","Michael Kors","Armani","Gucci",
            "Rolex","Omega","Rado","Tissot",
            "Seiko","Citizen","Daniel Wellington","Police",
            "Tommy Hilfiger","Calvin Klein","Montblanc",
            "Skmei","Maxima","HMT","Boat",
            "Noise","FireBoltt","Samsung","Apple",
            "OnePlus","Realme","Mi","Redmi",
            "Fitbit","Garmin","Amazfit","Huawei","Croma"
        };
        return watchBrands;
    }

    if(productName == "smartWatch"){
        String smartWatchBrands[] = {
            "Boat","Noise","FireBoltt","Realme","Samsung",
            "Apple","OnePlus","Mi","Redmi",
            "Fitbit","Garmin","Amazfit","Huawei",
            "Oppo","Vivo","Nothing","iQOO",
            "Fossil","Michael Kors","Armani","Titan",
            "Fastrack","Casio","Timex","Skmei",
            "Maxima","Portronics","Zebronics","Ambrane",
            "Syska","Lenovo","Asus","HP",
            "Dell","Sony","JBL","Croma"
        };
        return smartWatchBrands;
    }

    if(productName == "gamingMouse"){
        String gamingMouseBrands[] = {
            "Logitech","HP","Dell","Redgear","Zebronics",
            "Razer","Corsair","HyperX","SteelSeries",
            "Asus","Lenovo","Acer","MSI",
            "Cooler Master","Ant Esports","Portronics",
            "Boat","Ambrane","Syska","AmazonBasics",
            "Flipkart SmartBuy","Targus","Belkin","TP-Link",
            "Redragon","Glorious","Roccat","Alienware",
            "Gigabyte","Zowie","Cougar","Thermaltake",
            "EvoFox","Quantum","Intex","Lava","Croma"
        };
        return gamingMouseBrands;
    }

    if(productName == "keyboard"){
        String keyboardBrands[] = {
            "Logitech","HP","Dell","Redgear","Zebronics",
            "Razer","Corsair","HyperX","SteelSeries",
            "Asus","Lenovo","Acer","MSI",
            "Cooler Master","Ant Esports","Portronics",
            "Boat","Ambrane","Syska","AmazonBasics",
            "Flipkart SmartBuy","Targus","Belkin","TP-Link",
            "Redragon","Glorious","Roccat","Alienware",
            "Gigabyte","Zowie","Cougar","Thermaltake",
            "EvoFox","Quantum","Intex","Lava","Croma"
        };
        return keyboardBrands;
    }

    if(productName == "printer"){
        String printerBrands[] = {
            "HP","Canon","Epson","Brother","Samsung",
            "Xerox","Ricoh","Panasonic","Sharp",
            "Kyocera","Dell","Lenovo","Asus",
            "Acer","Zebronics","Portronics","Boat",
            "Ambrane","Syska","AmazonBasics","Flipkart SmartBuy",
            "Targus","Belkin","TP-Link","Redmi",
            "Mi","Realme","Oppo","Vivo",
            "Nothing","iQOO","Huawei","LG",
            "Bosch","Philips","Intex","Croma"
        };
        return printerBrands;
    }
	
	    if(productName == "router"){
        String routerBrands[] = {
            "TP-Link","D-Link","Netgear","Tenda","Asus",
            "Linksys","Huawei","Xiaomi","Redmi",
            "Realme","Samsung","Nokia","Cisco",
            "Belkin","Zebronics","Portronics","Boat",
            "Ambrane","Syska","AmazonBasics","Flipkart SmartBuy",
            "Airtel","Jio","BSNL","ACT",
            "Hathway","Tikona","iBall","Digisol",
            "Mercusys","Ubiquiti","Archer","Cudy",
            "Mikrotik","EnGenius","TOTOLINK","Croma"
        };
        return routerBrands;
    }

    if(productName == "camera"){
        String cameraBrands[] = {
            "Canon","Nikon","Sony","Fujifilm","Panasonic",
            "Leica","GoPro","Olympus","Kodak",
            "Samsung","Casio","Pentax","Hasselblad",
            "DJI","Sigma","Tamron","Blackmagic",
            "Insta360","Ricoh","Polaroid","Sharp",
            "Huawei","Xiaomi","Redmi","Realme",
            "Apple","OnePlus","Oppo","Vivo",
            "Nothing","iQOO","LG","Bosch",
            "Philips","JVC","Minolta","Croma"
        };
        return cameraBrands;
    }

    if(productName == "tripod"){
        String tripodBrands[] = {
            "Digitek","AmazonBasics","Simpex","Manfrotto","Kodak",
            "Sony","Canon","Nikon","GoPro",
            "DJI","Benro","Vanguard","Joby",
            "Fotopro","ProElite","E-Image","Weifeng",
            "Neewer","SmallRig","Ulanzi","Rode",
            "Sigma","Tamron","Insta360","Ricoh",
            "Sharp","Huawei","Xiaomi","Redmi",
            "Realme","Apple","OnePlus","Oppo",
            "Vivo","Nothing","iQOO","LG","Croma"
        };
        return tripodBrands;
    }

    if(productName == "bedLamp"){
        String bedLampBrands[] = {
            "Philips","Syska","Havells","Wipro","Bajaj",
            "Crompton","Orient","Panasonic","Sharp",
            "Samsung","LG","Bosch","Usha",
            "Jaipan","Sunflame","Butterfly","Inalsa",
            "Wonderchef","Maharaja Whiteline","Orpat",
            "Nova","AmazonBasics","Flipkart SmartBuy",
            "Cello","Agaro","Lifelong","Miniso",
            "Ikea","Nilkamal","Godrej","Urban Ladder",
            "Durian","Home Centre","Westside","Dmart",
            "Target","Croma"
        };
        return bedLampBrands;
    }

    if(productName == "studyTable"){
        String studyTableBrands[] = {
            "Nilkamal","Ikea","Godrej","Urban Ladder","Durian",
            "Home Centre","Westside","Dmart","Cello",
            "Agaro","Lifelong","AmazonBasics","Flipkart SmartBuy",
            "Green Soul","Featherlite","Wipro","Havells",
            "Panasonic","Sharp","Samsung","LG",
            "Bosch","Usha","Jaipan","Sunflame",
            "Butterfly","Inalsa","Wonderchef","Maharaja Whiteline",
            "Orpat","Nova","Miniso","Target",
            "Pepperfry","Wooden Street","Evok","Hometown","Croma"
        };
        return studyTableBrands;
    }

    if(productName == "officeChair"){
        String officeChairBrands[] = {
            "Green Soul","Nilkamal","Godrej","Cello","Durian",
            "Urban Ladder","Featherlite","Ikea","Home Centre",
            "Westside","Dmart","AmazonBasics","Flipkart SmartBuy",
            "Pepperfry","Wooden Street","Evok","Hometown",
            "Wipro","Havells","Panasonic","Sharp",
            "Samsung","LG","Bosch","Usha",
            "Jaipan","Sunflame","Butterfly","Inalsa",
            "Wonderchef","Maharaja Whiteline","Orpat","Nova",
            "Miniso","Target","Steelcase","Herman Miller","Croma"
        };
        return officeChairBrands;
    }

    if(productName == "waterPurifier"){
        String waterPurifierBrands[] = {
            "Kent","Aquaguard","Pureit","Livpure","Blue Star",
            "AO Smith","Havells","Bajaj","Crompton",
            "Panasonic","Sharp","Samsung","LG",
            "Bosch","Usha","Jaipan","Sunflame",
            "Butterfly","Inalsa","Wonderchef","Maharaja Whiteline",
            "Orpat","Nova","AmazonBasics","Flipkart SmartBuy",
            "Cello","Agaro","Lifelong","Miniso",
            "V-Guard","Tata Swach","Prestige","Pigeon",
            "Hindware","Eureka Forbes","Voltas","Croma"
        };
        return waterPurifierBrands;
    }

    if(productName == "refrigerator"){
        String refrigeratorBrands[] = {
            "LG","Samsung","Whirlpool","Godrej","Haier",
            "Panasonic","Sharp","Bosch","Voltas",
            "Blue Star","Hitachi","Kelvinator","Onida",
            "Siemens","Toshiba","Philips","Usha",
            "Jaipan","Sunflame","Butterfly","Inalsa",
            "Wonderchef","Maharaja Whiteline","Orpat",
            "Nova","AmazonBasics","Flipkart SmartBuy",
            "Cello","Agaro","Lifelong","Miniso",
            "V-Guard","Prestige","Pigeon","Hindware",
            "Eureka Forbes","Croma"
        };
        return refrigeratorBrands;
    }

    if(productName == "washingMachine"){
        String washingMachineBrands[] = {
            "LG","Samsung","Whirlpool","IFB","Bosch",
            "Haier","Panasonic","Sharp","Voltas",
            "Blue Star","Godrej","Hitachi","Onida",
            "Siemens","Toshiba","Philips","Usha",
            "Jaipan","Sunflame","Butterfly","Inalsa",
            "Wonderchef","Maharaja Whiteline","Orpat",
            "Nova","AmazonBasics","Flipkart SmartBuy",
            "Cello","Agaro","Lifelong","Miniso",
            "V-Guard","Prestige","Pigeon","Hindware",
            "Eureka Forbes","Croma"
        };
        return washingMachineBrands;
    }

    if(productName == "microwave"){
        String microwaveBrands[] = {
            "LG","Samsung","IFB","Godrej","Panasonic",
            "Sharp","Bosch","Voltas","Blue Star",
            "Haier","Whirlpool","Hitachi","Onida",
            "Siemens","Toshiba","Philips","Usha",
            "Jaipan","Sunflame","Butterfly","Inalsa",
            "Wonderchef","Maharaja Whiteline","Orpat",
            "Nova","AmazonBasics","Flipkart SmartBuy",
            "Cello","Agaro","Lifelong","Miniso",
            "V-Guard","Prestige","Pigeon","Hindware",
            "Eureka Forbes","Croma"
        };
        return microwaveBrands;
    }
	
	     if(productName == "television"){
          String televisionBrands[] = {
               "Samsung","LG","Sony","TCL","OnePlus",
               "Mi","Panasonic","Vu","Haier",
               "Philips","Kodak","Motorola","Realme",
               "Thomson","BPL","Sansui","Sharp",
               "Hisense","Toshiba","Croma",
               "Nokia","Intex","Onida","Lloyd",
               "Acer","BenQ","JVC","Westinghouse",
               "Skyworth","Metz","Blaupunkt",
               "iFFALCON","Sanyo","AmazonBasics",
               "Xiaomi","Redmi","Compaq"
          };
          return televisionBrands;
     }

     if(productName == "airConditioner"){
          String airConditionerBrands[] = {
               "Daikin","Voltas","Blue Star","LG","Samsung",
               "Hitachi","Panasonic","Carrier","Lloyd",
               "Haier","Godrej","Whirlpool","Onida",
               "Toshiba","Sharp","IFB","O General",
               "Mitsubishi","Hyundai","Croma",
               "Hisense","Kelvinator","Sansui",
               "Videocon","Acer","Bosch","Vestar",
               "Westinghouse","Intex","BPL",
               "Comfee","AmazonBasics","JVC",
               "iFFALCON","Blaupunkt","Metz"
          };
          return airConditionerBrands;
     }

     if(productName == "airCooler"){
          String airCoolerBrands[] = {
               "Symphony","Bajaj","Crompton","Havells",
               "Kenstar","Orient","Voltas","Blue Star",
               "Usha","Lloyd","Hindware","Honeywell",
               "IFB","Khaitan","Maharaja","V-Guard",
               "Godrej","Cello","Onida","Haier",
               "Livpure","AmazonBasics","Flipkart SmartBuy",
               "Inalsa","Sunflame","Orpat",
               "Lifelong","Agaro","Wonderchef",
               "Pigeon","Prestige","Khaitan Storm",
               "Symphony Diet","Bajaj Platini",
               "Crompton Ozone","Havells Celia"
          };
          return airCoolerBrands;
     }

     if(productName == "vacuumCleaner"){
          String vacuumCleanerBrands[] = {
               "Eureka Forbes","Philips","Dyson","LG",
               "Samsung","Karcher","Panasonic","IFB",
               "Kent","Inalsa","Prestige","Pigeon",
               "Agaro","Black & Decker","Bosch",
               "Hitachi","Haier","Godrej","Sharp",
               "Croma","AmazonBasics","Lifelong",
               "Sunflame","Wonderchef","Maharaja Whiteline",
               "Orpat","Nova","Cello","V-Guard",
               "Whirlpool","Blue Star","Toshiba",
               "Sansui","Onida","iFFALCON"
          };
          return vacuumCleanerBrands;
     }

     if(productName == "geyser"){
          String geyserBrands[] = {
               "Racold","Bajaj","Havells","Crompton",
               "V-Guard","AO Smith","Orient","Usha",
               "Kenstar","Hindware","Lloyd","Voltas",
               "Haier","Godrej","IFB","Panasonic",
               "Bosch","Whirlpool","Jaquar",
               "AmazonBasics","Croma","Sharp",
               "Toshiba","Blue Star","Vestar",
               "Intex","Sansui","Onida",
               "Kelvinator","Acer","BPL",
               "Racold Pronto","AO Smith HSE",
               "Havells Monza","Bajaj Majesty"
          };
          return geyserBrands;
     }
	 
	      if(productName == "waterFilter"){
          String waterFilterBrands[] = {
               "Kent","Aquaguard","Pureit","Livpure",
               "Blue Star","AO Smith","Eureka Forbes",
               "Havells","Tata Swach","V-Guard",
               "Panasonic","LG","Whirlpool",
               "Godrej","Haier","Croma",
               "AmazonBasics","Sharp","Bosch",
               "Voltas","IFB","Kenstar",
               "Hindware","Intex","Sansui",
               "Toshiba","AquaSure","AquaGuard Classic",
               "Kent Grand","Livpure Glo",
               "Pureit Advanced","AO Smith Z1",
               "Blue Star Aristo","Havells Max"
          };
          return waterFilterBrands;
     }

     if(productName == "toaster"){
          String toasterBrands[] = {
               "Philips","Prestige","Pigeon","Bajaj",
               "Maharaja Whiteline","Morphy Richards",
               "Inalsa","Havells","Kenstar","Usha",
               "Crompton","Orient","Agaro",
               "Wonderchef","Sunflame","Black & Decker",
               "Bosch","Panasonic","Sharp",
               "AmazonBasics","Croma","Lifelong",
               "Nova","Orpat","Cello",
               "Jaipan","Butterfly","V-Guard",
               "Whirlpool","Haier","Godrej",
               "Blue Star","Toshiba","Sansui"
          };
          return toasterBrands;
     }

     if(productName == "sandwichMaker"){
          String sandwichMakerBrands[] = {
               "Prestige","Pigeon","Philips","Bajaj",
               "Maharaja Whiteline","Morphy Richards",
               "Inalsa","Havells","Kenstar","Usha",
               "Crompton","Orient","Agaro",
               "Wonderchef","Sunflame","Black & Decker",
               "Bosch","Panasonic","Sharp",
               "AmazonBasics","Croma","Lifelong",
               "Nova","Orpat","Cello",
               "Jaipan","Butterfly","V-Guard",
               "Whirlpool","Haier","Godrej",
               "Blue Star","Toshiba","Sansui"
          };
          return sandwichMakerBrands;
     }

     if(productName == "riceCooker"){
          String riceCookerBrands[] = {
               "Prestige","Pigeon","Panasonic","Philips",
               "Bajaj","Maharaja Whiteline","Morphy Richards",
               "Inalsa","Havells","Kenstar",
               "Usha","Crompton","Orient",
               "Agaro","Wonderchef","Sunflame",
               "Black & Decker","Bosch","Sharp",
               "AmazonBasics","Croma","Lifelong",
               "Nova","Orpat","Cello",
               "Jaipan","Butterfly","V-Guard",
               "Whirlpool","Haier","Godrej",
               "Blue Star","Toshiba","Sansui"
          };
          return riceCookerBrands;
     }

     if(productName == "juicer"){
          String juicerBrands[] = {
               "Philips","Prestige","Pigeon","Bajaj",
               "Maharaja Whiteline","Morphy Richards",
               "Inalsa","Havells","Kenstar","Usha",
               "Crompton","Orient","Agaro",
               "Wonderchef","Sunflame","Black & Decker",
               "Bosch","Panasonic","Sharp",
               "AmazonBasics","Croma","Lifelong",
               "Nova","Orpat","Cello",
               "Jaipan","Butterfly","V-Guard",
               "Whirlpool","Haier","Godrej",
               "Blue Star","Toshiba","Sansui"
          };
          return juicerBrands;
     }

     if(productName == "blender"){
          String blenderBrands[] = {
               "Philips","Prestige","Pigeon","Bajaj",
               "Maharaja Whiteline","Morphy Richards",
               "Inalsa","Havells","Kenstar","Usha",
               "Crompton","Orient","Agaro",
               "Wonderchef","Sunflame","Black & Decker",
               "Bosch","Panasonic","Sharp",
               "AmazonBasics","Croma","Lifelong",
               "Nova","Orpat","Cello",
               "Jaipan","Butterfly","V-Guard",
               "Whirlpool","Haier","Godrej",
               "Blue Star","Toshiba","Sansui"
          };
          return blenderBrands;
     }

     if(productName == "handBlender"){
          String handBlenderBrands[] = {
               "Philips","Prestige","Pigeon","Bajaj",
               "Maharaja Whiteline","Morphy Richards",
               "Inalsa","Havells","Kenstar","Usha",
               "Crompton","Orient","Agaro",
               "Wonderchef","Sunflame","Black & Decker",
               "Bosch","Panasonic","Sharp",
               "AmazonBasics","Croma","Lifelong",
               "Nova","Orpat","Cello",
               "Jaipan","Butterfly","V-Guard",
               "Whirlpool","Haier","Godrej",
               "Blue Star","Toshiba","Sansui"
          };
          return handBlenderBrands;
     }

     if(productName == "coffeeMaker"){
          String coffeeMakerBrands[] = {
               "Philips","Morphy Richards","Prestige",
               "Pigeon","Bajaj","Inalsa",
               "Havells","Bosch","Panasonic",
               "Black & Decker","Nespresso",
               "DeLonghi","Agaro","Wonderchef",
               "Croma","AmazonBasics","Lifelong",
               "Sharp","Toshiba","Sansui",
               "Blue Star","Godrej","Whirlpool",
               "Haier","Nova","Orpat",
               "Jaipan","Butterfly","V-Guard",
               "Kenstar","Usha","Crompton",
               "Orient","Maharaja Whiteline"
          };
          return coffeeMakerBrands;
     }

     if(productName == "dishDryer"){
          String dishDryerBrands[] = {
               "Bosch","IFB","LG","Samsung",
               "Whirlpool","Haier","Godrej",
               "Panasonic","Sharp","Siemens",
               "Croma","AmazonBasics","Blue Star",
               "Voltas","Toshiba","Sansui",
               "Hindware","Kent","Eureka Forbes",
               "Agaro","Wonderchef","Prestige",
               "Pigeon","Morphy Richards",
               "Maharaja Whiteline","Inalsa",
               "Havells","Kenstar","Usha",
               "Crompton","Orient","Nova",
               "Orpat"
          };
          return dishDryerBrands;
     }

     if(productName == "chimney"){
          String chimneyBrands[] = {
               "Elica","Faber","Hindware","Glen",
               "Sunflame","Prestige","Pigeon",
               "Bosch","IFB","Whirlpool",
               "Haier","Godrej","Panasonic",
               "Sharp","Siemens","Croma",
               "AmazonBasics","Blue Star",
               "Voltas","Toshiba","Sansui",
               "Havells","Kenstar","Usha",
               "Crompton","Orient","Inalsa",
               "Agaro","Wonderchef","Nova",
               "Orpat","Jaipan","Butterfly"
          };
          return chimneyBrands;
     }
	 
	      if(productName == "sewingMachine"){
          String sewingMachineBrands[] = {
               "Usha","Singer","Brother","Juki",
               "Bernina","Janome","Pfaff","Necchi",
               "Husqvarna","Merritt","Toyota",
               "Butterfly","Inalsa","Kenstar",
               "Croma","AmazonBasics","Orpat",
               "Nova","Lifelong","Agaro",
               "Wonderchef","Pigeon","Prestige",
               "Maharaja Whiteline","Sunflame",
               "Orient","Crompton","Havells",
               "Kenmore","Elna","Babylock"
          };
          return sewingMachineBrands;
     }

     if(productName == "inverter"){
          String inverterBrands[] = {
               "Luminous","Microtek","Exide","Amaron",
               "V-Guard","Su-Kam","Genus","Livguard",
               "APC","Delta","Numeric","Havells",
               "Tata Power","Mahindra Powerol",
               "Okaya","Base","Usha","Crompton",
               "Orient","Kenstar","MTEK",
               "Eaton","Schneider","Voltas",
               "Blue Star","Panasonic","Sharp",
               "Godrej","Haier","Whirlpool"
          };
          return inverterBrands;
     }

     if(productName == "stabilizer"){
          String stabilizerBrands[] = {
               "V-Guard","Microtek","Everest",
               "Voltas","Blue Star","Crompton",
               "Havells","Luminous","APC",
               "Delta","Schneider","Eaton",
               "Godrej","Haier","Whirlpool",
               "Panasonic","Sharp","LG",
               "Samsung","Carrier","Daikin",
               "Hitachi","Orient","Kenstar",
               "Usha","Livguard","Genus",
               "Numeric","Okaya","Su-Kam"
          };
          return stabilizerBrands;
     }

     if(productName == "powerStrip"){
          String powerStripBrands[] = {
               "Belkin","GM","Havells","Philips",
               "Anchor","Syska","Bajaj","Orient",
               "Crompton","Usha","Panasonic",
               "V-Guard","APC","Portronics",
               "Mi","Realme","Boat","Ambrane",
               "AmazonBasics","Flipkart SmartBuy",
               "Zebronics","Intex","Honeywell",
               "Wipro","Legrand","Schneider",
               "Luminous","Delta","Eaton","Geonix"
          };
          return powerStripBrands;
     }

     if(productName == "torch"){
          String torchBrands[] = {
               "Eveready","Philips","Bajaj",
               "Syska","Wipro","Panasonic",
               "Havells","Orient","Usha",
               "Crompton","Mi","Realme",
               "Boat","Ambrane","Portronics",
               "AmazonBasics","Flipkart SmartBuy",
               "Zebronics","Intex","Geonix",
               "Nova","Orpat","Kenstar",
               "Godrej","Haier","Sharp",
               "Toshiba","Sansui","V-Guard"
          };
          return torchBrands;
     }

     if(productName == "calculator"){
          String calculatorBrands[] = {
               "Casio","Sharp","Citizen",
               "Canon","Texas Instruments",
               "HP","Lenovo","Dell",
               "AmazonBasics","Flipkart SmartBuy",
               "Orpat","Nova","Geonix",
               "Intex","Zebronics","Croma",
               "Mi","Realme","Panasonic",
               "Philips","Kenko","Genius",
               "Kenstar","Usha","Crompton",
               "Orient","Havells","Godrej",
               "Haier","Sansui"
          };
          return calculatorBrands;
     }

     if(productName == "schoolBag"){
          String schoolBagBrands[] = {
               "Skybags","American Tourister",
               "Wildcraft","Safari","VIP",
               "F Gear","Puma","Adidas",
               "Nike","Reebok","Tommy Hilfiger",
               "Lavie","Caprese","Baggit",
               "Aristocrat","Samsonite",
               "AmazonBasics","Flipkart SmartBuy",
               "Gear","Fastrack","Allen Solly",
               "United Colors of Benetton",
               "Max","Zara","H&M",
               "Decathlon","Quechua",
               "Mokobara","IT Luggage"
          };
          return schoolBagBrands;
     }

     if(productName == "tiffinBox"){
          String tiffinBoxBrands[] = {
               "Milton","Cello","Tupperware",
               "Signoraware","Pigeon","Prestige",
               "Borosil","Jaypee","Vaya",
               "Havells","AmazonBasics",
               "Flipkart SmartBuy","Wonderchef",
               "Agaro","Lifelong","Nova",
               "Orpat","Jaipan","Butterfly",
               "Usha","Crompton","Orient",
               "Sunflame","Maharaja Whiteline",
               "Kenstar","Inalsa","Bajaj",
               "Panasonic","Sharp","Godrej"
          };
          return tiffinBoxBrands;
     }

     if(productName == "fryingPan"){
          String fryingPanBrands[] = {
               "Prestige","Pigeon","Hawkins",
               "Wonderchef","Borosil","Cello",
               "Sunflame","Butterfly","Agaro",
               "Lifelong","Nova","Orpat",
               "Jaipan","Maharaja Whiteline",
               "Inalsa","Bajaj","Philips",
               "Panasonic","Sharp","Bosch",
               "AmazonBasics","Flipkart SmartBuy",
               "Croma","Havells","Usha",
               "Crompton","Orient","Kenstar",
               "Godrej","Haier"
          };
          return fryingPanBrands;
     }

     if(productName == "kadai"){
          String kadaiBrands[] = {
               "Prestige","Pigeon","Hawkins",
               "Wonderchef","Borosil","Cello",
               "Sunflame","Butterfly","Agaro",
               "Lifelong","Nova","Orpat",
               "Jaipan","Maharaja Whiteline",
               "Inalsa","Bajaj","Philips",
               "Panasonic","Sharp","Bosch",
               "AmazonBasics","Flipkart SmartBuy",
               "Croma","Havells","Usha",
               "Crompton","Orient","Kenstar",
               "Godrej","Haier"
          };
          return kadaiBrands;
     }
	 
	      if(productName == "fryingOil"){
          String fryingOilBrands[] = {
               "Fortune","Saffola","Dhara","Sunpure",
               "Gemini","Gold Winner","Freedom",
               "Nature Fresh","Emami","Patanjali",
               "24 Mantra","Del Monte","Oleev",
               "Engine","Crystal","Gokul",
               "Annapurna","Aadhar","Healthy & Tasty",
               "Cargill","Ruchi Gold","Vimal",
               "Sundrop","Nutrela","Bail Kolhu",
               "Figaro","Leonardo","Oleum",
               "Hudson","Farm Fresh"
          };
          return fryingOilBrands;
     }

     if(productName == "tableFan"){
          String tableFanBrands[] = {
               "Usha","Crompton","Havells","Orient",
               "Bajaj","Kenstar","V-Guard",
               "Philips","Panasonic","Sharp",
               "Godrej","Haier","Whirlpool",
               "Voltas","Blue Star","Lloyd",
               "Inalsa","Nova","Orpat",
               "AmazonBasics","Flipkart SmartBuy",
               "Croma","Khaitan","Maharaja Whiteline",
               "Sunflame","Butterfly","Agaro",
               "Lifelong","Geonix","Syska"
          };
          return tableFanBrands;
     }

     if(productName == "pedestalFan"){
          String pedestalFanBrands[] = {
               "Usha","Crompton","Havells","Orient",
               "Bajaj","Kenstar","V-Guard",
               "Philips","Panasonic","Sharp",
               "Godrej","Haier","Whirlpool",
               "Voltas","Blue Star","Lloyd",
               "Inalsa","Nova","Orpat",
               "AmazonBasics","Flipkart SmartBuy",
               "Croma","Khaitan","Maharaja Whiteline",
               "Sunflame","Butterfly","Agaro",
               "Lifelong","Geonix","Syska"
          };
          return pedestalFanBrands;
     }

     if(productName == "airFryer"){
          String airFryerBrands[] = {
               "Philips","Prestige","Pigeon","Bajaj",
               "Maharaja Whiteline","Morphy Richards",
               "Inalsa","Havells","Kenstar","Usha",
               "Crompton","Orient","Agaro",
               "Wonderchef","Sunflame","Black & Decker",
               "Bosch","Panasonic","Sharp",
               "AmazonBasics","Croma","Lifelong",
               "Nova","Orpat","Cello",
               "Jaipan","Butterfly","V-Guard",
               "Whirlpool","Haier"
          };
          return airFryerBrands;
     }

     if(productName == "hairBrush"){
          String hairBrushBrands[] = {
               "Vega","Philips","Nova","Syska",
               "Panasonic","Braun","Havells",
               "Crompton","Usha","Remington",
               "Wahl","Ikonic","Alan Truman",
               "GUBB","Basicare","Roots",
               "UrbanMooch","Agaro","Lifelong",
               "AmazonBasics","Flipkart SmartBuy",
               "Mi","Realme","Boat",
               "Inalsa","Kenstar","Geonix",
               "Orpat","Nova Pro","V-Guard"
          };
          return hairBrushBrands;
     }
     if(productName == "comb"){
          String combBrands[] = {
               "Vega","GUBB","Roots","Basicare","UrbanMooch","Philips","Nova","Syska","Panasonic","Braun",
               "Havells","Crompton","Usha","Remington","Wahl","Ikonic","Alan Truman","Lifelong","AmazonBasics","V-Guard"
          };
          return combBrands;
     }

     if(productName == "shavingFoam"){
          String shavingFoamBrands[] = {
               "Gillette","Old Spice","Nivea","Park Avenue","Bombay Shaving Company","Beardo","Vi-John","Supermax","L'Oreal","Brut",
               "Patanjali","Himalaya","Man Arden","UrbanGabru","Ustraa","Axe","Wild Stone","Yardley","Engage","Denver"
          };
          return shavingFoamBrands;
     }

     if(productName == "afterShave"){
          String afterShaveBrands[] = {
               "Old Spice","Gillette","Nivea","Park Avenue","Bombay Shaving Company","Beardo","Vi-John","Supermax","L'Oreal","Brut",
               "Patanjali","Himalaya","Man Arden","UrbanGabru","Ustraa","Axe","Wild Stone","Yardley","Engage","Denver"
          };
          return afterShaveBrands;
     }

     if(productName == "bodyLotionMen"){
          String bodyLotionMenBrands[] = {
               "Nivea","Vaseline","Garnier","Himalaya","Patanjali","Dove","Cetaphil","Neutrogena","The Man Company","Beardo",
               "Ustraa","Man Arden","UrbanGabru","Park Avenue","Old Spice","Yardley","Wild Stone","Denver","Mamaearth","WOW"
          };
          return bodyLotionMenBrands;
     }

     if(productName == "perfume"){
          String perfumeBrands[] = {
               "Titan Skinn","Fogg","Engage","Wild Stone","Denver","Axe","Yardley","Park Avenue","Old Spice","Calvin Klein",
               "Armani","Gucci","Versace","Dior","Chanel","Hugo Boss","Rasasi","Ajmal","Bella Vita","Jaguar"
          };
          return perfumeBrands;
     }

     if(productName == "bodySpray"){
          String bodySprayBrands[] = {
               "Fogg","Axe","Engage","Wild Stone","Denver","Yardley","Park Avenue","Old Spice","Nivea","Adidas",
               "Nike","Reebok","Jaguar","Bella Vita","The Man Company","Beardo","Ustraa","Man Arden","Rasasi","Ajmal"
          };
          return bodySprayBrands;
     }

     if(productName == "facePack"){
          String facePackBrands[] = {
               "Himalaya","Biotique","Mamaearth","WOW","Plum","Minimalist","Lakme","Ponds","Garnier","Lotus",
               "VLCC","Neutrogena","Nivea","Olay","Cetaphil","The Face Shop","Innisfree","L'Oreal","Khadi","Patanjali"
          };
          return facePackBrands;
     }

     if(productName == "toner"){
          String tonerBrands[] = {
               "Plum","Minimalist","Mamaearth","WOW","Biotique","Himalaya","Lakme","Ponds","Garnier","Lotus",
               "VLCC","Neutrogena","Nivea","Olay","Cetaphil","The Face Shop","Innisfree","L'Oreal","Khadi","Dot & Key"
          };
          return tonerBrands;
     }

     if(productName == "moisturizer"){
          String moisturizerBrands[] = {
               "Nivea","Ponds","Lakme","Garnier","Himalaya","Biotique","Mamaearth","WOW","Plum","Minimalist",
               "Neutrogena","Cetaphil","Olay","Dove","Lotus","VLCC","L'Oreal","Forest Essentials","Khadi","Patanjali"
          };
          return moisturizerBrands;
     }

     if(productName == "eyeCream"){
          String eyeCreamBrands[] = {
               "Olay","Neutrogena","Mamaearth","Plum","Minimalist","WOW","Biotique","Himalaya","Lakme","Ponds",
               "Garnier","Lotus","VLCC","Cetaphil","L'Oreal","Forest Essentials","Khadi","Dot & Key","Clinique","Estee Lauder"
          };
          return eyeCreamBrands;
     }

     if(productName == "shampooMen"){
          String shampooMenBrands[] = {
               "Head & Shoulders","Clinic Plus","Pantene","Dove","Tresemme","L'Oreal","Garnier","Himalaya","Patanjali","Beardo",
               "Ustraa","Man Arden","Park Avenue","Old Spice","Wild Stone","The Man Company","Mamaearth","WOW","Plum","Biotique"
          };
          return shampooMenBrands;
     }
    
	
     if(productName == "shavingGel"){
          String shavingGelBrands[] = {
               "Gillette","Nivea","Old Spice","Park Avenue","Bombay Shaving Company","Beardo","Vi-John","Supermax","L'Oreal","Brut",
               "Patanjali","Himalaya","Man Arden","UrbanGabru","Ustraa","Axe","Wild Stone","Yardley","Engage","Denver"
          };
          return shavingGelBrands;
     }

     if(productName == "proteinBar"){
          String proteinBarBrands[] = {
               "RiteBite","Yoga Bar","MuscleBlaze","The Whole Truth","Max Protein","Oziva","GNC","Herbalife","Patanjali","HealthKart",
               "Pintola","True Elements","Nutrela","Saffola","Nature Valley","Kellogg's","Amway","MyProtein","BigMuscles","Fast & Up"
          };
          return proteinBarBrands;
     }

     if(productName == "healthDrink"){
          String healthDrinkBrands[] = {
               "Horlicks","Bournvita","Boost","Complan","Protinex","Ensure","Pediasure","Maltova","Amul Pro","Nestle Everyday",
               "Herbalife","GNC","Oziva","Patanjali","HealthKart","MuscleBlaze","BigMuscles","Fast & Up","MyProtein","Nutrela"
          };
          return healthDrinkBrands;
     }

     if(productName == "digestiveBiscuit"){
          String digestiveBiscuitBrands[] = {
               "Britannia","Parle","Sunfeast","McVitie's","Unibic","Anmol","Priyagold","Bisk Farm","ITC","Patanjali",
               "24 Mantra","Nature Fresh","Saffola","Good Day","Hide & Seek","Oreo","Dark Fantasy","Marie Gold","Tiger","Monaco"
          };
          return digestiveBiscuitBrands;
     }

     if(productName == "brownBread"){
          String brownBreadBrands[] = {
               "Britannia","Harvest Gold","Modern","English Oven","Kitty","Fresho","Spencer's","Wibs","Perfect","Bonn",
               "Elite","Daily Bread","Nature Fresh","Moreish","Amul","Mother Dairy","Farm Fresh","Healthy Choice","Sunfeast","ITC"
          };
          return brownBreadBrands;
     }

     if(productName == "multigrainFlour"){
          String multigrainFlourBrands[] = {
               "Aashirvaad","Pillsbury","Nature Fresh","Annapurna","Fortune","24 Mantra","Patanjali","Organic Tattva","Pro Nature","Tata Sampann",
               "BB Royal","More","Fresho","Spencer's","Amul","Mother Dairy","Saffola","Healthy Choice","Shakti Bhog","Rajdhani"
          };
          return multigrainFlourBrands;
     }

     if(productName == "idliRava"){
          String idliRavaBrands[] = {
               "Annapurna","Aashirvaad","Pillsbury","Tata Sampann","24 Mantra","Patanjali","Organic Tattva","Pro Nature","BB Royal","More",
               "Fresho","Spencer's","Elite","Naga","Shakti Bhog","Rajdhani","Sunfeast","ITC","Nature Fresh","Fortune"
          };
          return idliRavaBrands;
     }

     if(productName == "sambarPowder"){
          String sambarPowderBrands[] = {
               "MTR","Aachi","Sakthi","Everest","MDH","Catch","Badshah","Eastern","Patanjali","24 Mantra",
               "Tata Sampann","Sunfeast","ITC","Annapurna","Organic Tattva","Pro Nature","BB Royal","Elite","Shakti Bhog","Rajdhani"
          };
          return sambarPowderBrands;
     }

     if(productName == "pepperPowder"){
          String pepperPowderBrands[] = {
               "Everest","MDH","Catch","Badshah","Eastern","MTR","Aachi","Sakthi","Patanjali","24 Mantra",
               "Tata Sampann","Sunfeast","ITC","Annapurna","Organic Tattva","Pro Nature","BB Royal","Elite","Saffola","Nature Land"
          };
          return pepperPowderBrands;
     }

     if(productName == "cardamom"){
          String cardamomBrands[] = {
               "Everest","MDH","Catch","Badshah","Eastern","MTR","Aachi","Sakthi","Patanjali","24 Mantra",
               "Tata Sampann","Sunfeast","ITC","Annapurna","Organic Tattva","Pro Nature","BB Royal","Elite","Nature Land","Saffola"
          };
          return cardamomBrands;
     }

     if(productName == "cloves"){
          String clovesBrands[] = {
               "Everest","MDH","Catch","Badshah","Eastern","MTR","Aachi","Sakthi","Patanjali","24 Mantra",
               "Tata Sampann","Sunfeast","ITC","Annapurna","Organic Tattva","Pro Nature","BB Royal","Elite","Nature Land","Saffola"
          };
          return clovesBrands;
     }
         if(productName == "cinnamon"){
          String cinnamonBrands[] = {
               "Everest","MDH","Catch","Badshah","Eastern","MTR","Aachi","Sakthi","Patanjali","24 Mantra","Tata Sampann","Sunfeast","ITC","Annapurna","Organic Tattva",
               "Pro Nature","BB Royal","More","Fresho","Spencer's","Elite","Naga","Shakti Bhog","Rajdhani","Nature Land","Organic India","Saffola","Healthy Choice","Farm Fresh","Mother Dairy"
          };
          return cinnamonBrands;
     }

     if(productName == "dryYeast"){
          String dryYeastBrands[] = {
               "Blue Bird","Saf-Instant","Angel","Urban Platter","Weikfield","Mauri","Fermipan","Levure","Bake King","Keya","Everest","MDH","Catch","Badshah","Eastern",
               "MTR","Patanjali","24 Mantra","Tata Sampann","Sunfeast","ITC","Annapurna","Organic Tattva","Pro Nature","BB Royal","More","Fresho","Spencer's","Elite","Naga"
          };
          return dryYeastBrands;
     }

     if(productName == "oatsCookies"){
          String oatsCookiesBrands[] = {
               "Britannia","Parle","Sunfeast","Unibic","Anmol","Priyagold","Bisk Farm","McVitie's","Patanjali","24 Mantra","Nature Fresh","Saffola","Nutrichoice","Good Day","Hide & Seek",
               "Dark Fantasy","Marie Gold","Tiger","Monaco","Krackjack","Treat","Little Hearts","Bourbon","Milk Bikis","Happy Happy","Mom's Magic","Tasty Treat","Elite","La Americana","The Baker's Dozen"
          };
          return oatsCookiesBrands;
     }

     if(productName == "granola"){
          String granolaBrands[] = {
               "Yoga Bar","Kellogg's","Bagrry's","True Elements","Pintola","Saffola","Nature Valley","The Whole Truth","Oziva","MuscleBlaze","Max Protein","24 Mantra","Patanjali","Organic Tattva","Pro Nature",
               "BB Royal","Fresho","More","Spencer's","Nature Fresh","Farm Fresh","Healthy Choice","Nutrela","Amul","Mother Dairy","Urban Platter","Weikfield","Elite","La Americana","The Baker's Dozen"
          };
          return granolaBrands;
     }

     if(productName == "chiaSeeds"){
          String chiaSeedsBrands[] = {
               "True Elements","Pintola","Urban Platter","24 Mantra","Organic Tattva","Pro Nature","BB Royal","Saffola","Nutrela","Yoga Bar","Oziva","MuscleBlaze","HealthKart","Boldfit","Fast & Up",
               "Amway","MyProtein","BigMuscles","Nature Fresh","Farm Fresh","Healthy Choice","More","Fresho","Spencer's","Elite","Nature Land","Organic India","Weikfield","Keya","Tata Sampann"
          };
          return chiaSeedsBrands;
     }

     if(productName == "flaxSeeds"){
          String flaxSeedsBrands[] = {
               "True Elements","Pintola","Urban Platter","24 Mantra","Organic Tattva","Pro Nature","BB Royal","Saffola","Nutrela","Yoga Bar","Oziva","MuscleBlaze","HealthKart","Boldfit","Fast & Up",
               "Amway","MyProtein","BigMuscles","Nature Fresh","Farm Fresh","Healthy Choice","More","Fresho","Spencer's","Elite","Nature Land","Organic India","Weikfield","Keya","Tata Sampann"
          };
          return flaxSeedsBrands;
     }

     if(productName == "quinoa"){
          String quinoaBrands[] = {
               "24 Mantra","Organic Tattva","Pro Nature","BB Royal","True Elements","Pintola","Urban Platter","Nature Land","Organic India","Saffola","Nutrela","Yoga Bar","Oziva","MuscleBlaze","HealthKart",
               "Boldfit","More","Fresho","Spencer's","Nature Fresh","Farm Fresh","Healthy Choice","Amul","Mother Dairy","Weikfield","Elite","Tata Sampann","Keya","Sunfeast","ITC"
          };
          return quinoaBrands;
     }

     if(productName == "basmatiRice"){
          String basmatiRiceBrands[] = {
               "India Gate","Daawat","Kohinoor","Fortune","Lal Qilla","Tilda","BB Royal","More","Fresho","Nature Fresh","Farm Fresh","Healthy Choice","24 Mantra","Organic Tattva","Pro Nature",
               "Amul","Mother Dairy","Tata Sampann","Sunfeast","ITC","Annapurna","Shakti Bhog","Rajdhani","Naga","Elite","Nature Land","Organic India","Saffola","Nutrela","Patanjali"
          };
          return basmatiRiceBrands;
     }

     if(productName == "brownRice"){
          String brownRiceBrands[] = {
               "India Gate","Daawat","Kohinoor","Fortune","Lal Qilla","Tilda","BB Royal","More","Fresho","Nature Fresh","Farm Fresh","Healthy Choice","24 Mantra","Organic Tattva","Pro Nature",
               "Amul","Mother Dairy","Tata Sampann","Sunfeast","ITC","Annapurna","Shakti Bhog","Rajdhani","Naga","Elite","Nature Land","Organic India","Saffola","Nutrela","Patanjali"
          };
          return brownRiceBrands;
     }
	 
	      if(productName == "handTowel"){
          String handTowelBrands[] = {
               "Bombay Dyeing","Spaces","Trident","Welspun","Raymond Home","Portico","D'Decor","Home Centre","Ikea","AmazonBasics","Flipkart SmartBuy","Marks & Spencer","H&M","Zara Home","Miniso",
               "More","Fresho","Spencer's","Elite","Farm Fresh","Healthy Choice","Amul","Mother Dairy","BB Royal","Nature Fresh","Urban Ladder","Wakefit","Sleepyhead","Godrej Interio","Pepperfry"
          };
          return handTowelBrands;
     }

     if(productName == "faceTowel"){
          String faceTowelBrands[] = {
               "Bombay Dyeing","Spaces","Trident","Welspun","Raymond Home","Portico","D'Decor","Home Centre","Ikea","AmazonBasics","Flipkart SmartBuy","Marks & Spencer","H&M","Zara Home","Miniso",
               "More","Fresho","Spencer's","Elite","Farm Fresh","Healthy Choice","Amul","Mother Dairy","BB Royal","Nature Fresh","Urban Ladder","Wakefit","Sleepyhead","Godrej Interio","Pepperfry"
          };
          return faceTowelBrands;
     }

     if(productName == "curtain"){
          String curtainBrands[] = {
               "D'Decor","Spaces","Trident","Welspun","Raymond Home","Portico","Home Centre","Ikea","AmazonBasics","Flipkart SmartBuy","Marks & Spencer","H&M","Zara Home","Urban Ladder","Wakefit",
               "Sleepyhead","Godrej Interio","Pepperfry","Nilkamal","More","Fresho","Spencer's","Elite","Miniso","BB Royal","Nature Fresh","Farm Fresh","Healthy Choice","Amul","Mother Dairy"
          };
          return curtainBrands;
     }

     if(productName == "carpet"){
          String carpetBrands[] = {
               "D'Decor","Spaces","Trident","Welspun","Raymond Home","Portico","Home Centre","Ikea","AmazonBasics","Flipkart SmartBuy","Marks & Spencer","H&M","Zara Home","Urban Ladder","Wakefit",
               "Sleepyhead","Godrej Interio","Pepperfry","Nilkamal","More","Fresho","Spencer's","Elite","Miniso","BB Royal","Nature Fresh","Farm Fresh","Healthy Choice","Amul","Mother Dairy"
          };
          return carpetBrands;
     }

     if(productName == "doorMat"){
          String doorMatBrands[] = {
               "D'Decor","Spaces","Trident","Welspun","Raymond Home","Portico","Home Centre","Ikea","AmazonBasics","Flipkart SmartBuy","Marks & Spencer","H&M","Zara Home","Urban Ladder","Wakefit",
               "Sleepyhead","Godrej Interio","Pepperfry","Nilkamal","Miniso","More","Fresho","Spencer's","Elite","BB Royal","Nature Fresh","Farm Fresh","Healthy Choice","Amul","Mother Dairy"
          };
          return doorMatBrands;
     }

     if(productName == "storageBox"){
          String storageBoxBrands[] = {
               "Nilkamal","Cello","Milton","Tupperware","Signoraware","Jaypee","Borosil","AmazonBasics","Flipkart SmartBuy","Ikea","Home Centre","Urban Ladder","Wakefit","Sleepyhead","Godrej Interio",
               "Pepperfry","Miniso","More","Fresho","Spencer's","Elite","BB Royal","Nature Fresh","Farm Fresh","Healthy Choice","Amul","Mother Dairy","Prestige","Pigeon","Wonderchef"
          };
          return storageBoxBrands;
     }

     if(productName == "ceilingLight"){
          String ceilingLightBrands[] = {
               "Philips","Syska","Wipro","Havells","Crompton","Orient","Bajaj","Panasonic","Sharp","Godrej","Haier","Whirlpool","Voltas","Blue Star","Lloyd",
               "AmazonBasics","Flipkart SmartBuy","Croma","Hindware","V-Guard","Usha","Inalsa","Nova","Orpat","Geonix","Mi","Realme","Boat","Zebronics","Ikea"
          };
          return ceilingLightBrands;
     }

          if(productName == "bedCover"){
          String bedCoverBrands[] = {
               "Bombay Dyeing","Spaces","Trident","Welspun","Raymond Home","Portico","D'Decor","Home Centre","Ikea","AmazonBasics","Flipkart SmartBuy","Marks & Spencer","H&M","Zara Home","Urban Ladder",
               "Wakefit","Sleepyhead","Godrej Interio","Pepperfry","Nilkamal","Miniso","More","Fresho","Spencer's","Elite","BB Royal","Nature Fresh","Farm Fresh","Healthy Choice","Amul"
          };
          return bedCoverBrands;
     }

     if(productName == "shoeRack"){
          String shoeRackBrands[] = {
               "Nilkamal","Godrej Interio","Ikea","Urban Ladder","Wakefit","Sleepyhead","Pepperfry","Home Centre","AmazonBasics","Flipkart SmartBuy","Croma","Miniso","Cello","Milton","Signoraware",
               "Jaypee","Borosil","Prestige","Pigeon","Wonderchef","More","Fresho","Spencer's","Elite","BB Royal","Nature Fresh","Farm Fresh","Healthy Choice","Amul","Mother Dairy"
          };
          return shoeRackBrands;
     }

     if(productName == "studyLamp"){
          String studyLampBrands[] = {
               "Philips","Syska","Wipro","Havells","Crompton","Orient","Bajaj","Panasonic","Sharp","Godrej","Haier","AmazonBasics","Flipkart SmartBuy","Croma","Hindware",
               "V-Guard","Usha","Inalsa","Nova","Orpat","Geonix","Mi","Realme","Boat","Zebronics","Ikea","Home Centre","Urban Ladder","Wakefit","Sleepyhead"
          };
          return studyLampBrands;
     }

     if(productName == "bathMat"){
          String bathMatBrands[] = {
               "D'Decor","Spaces","Trident","Welspun","Raymond Home","Portico","Home Centre","Ikea","AmazonBasics","Flipkart SmartBuy","Marks & Spencer","H&M","Zara Home","Urban Ladder","Wakefit",
               "Sleepyhead","Godrej Interio","Pepperfry","Nilkamal","Miniso","More","Fresho","Spencer's","Elite","BB Royal","Nature Fresh","Farm Fresh","Healthy Choice","Amul","Mother Dairy"
          };
          return bathMatBrands;
     }
	return null; 
  }
}