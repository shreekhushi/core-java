// class SuperMarketExecutor{
  // public static void main(String[] products){
  String productNames[] = {"shampoo","biscuit","soap","toothpaste","oil","rice","wheatFlour","sugar","salt","tea","coffee","milk","noodles","pasta","sauce","ketchup","chips","chocolate","icecream","softDrink","juice","waterBottle","detergent","dishwashLiquid","handwash","sanitizer","facewash",
     "faceCream","lotion","talcumPowder","deodorant","razor","shavingCream","hairOil","conditioner","hairColor","bodyWash","scrub","makeupKit","babySoap","babyShampoo","babyLotion","tissuePaper","napkin","sanitaryPad","energyDrink","cornflakes",
   "oats","peanutButter","pickle","papad","vermicelli","suji","besan","turmeric","cuminSeeds","mustardSeeds","ghee","paneer","yogurt","frozenPeas","frozenCorn","pizzaBase","mayonnaise","vinegar","bakingPowder","custardPowder","cakeMix","greenTea","proteinPowder",
       "dryFruits","almonds","cashews","raisins","dates","popcorn","muesli","soySauce","chocolateSyrup","glucose","biscuitsCream","readyMix","poha","rava","ketchupSpicy","fruitJam","peanutSnack","cookingSpray",    "mineralWater","bathTowel","toothbrush",
       "mouthwash","liquidSoap","agarbatti","matchBox","candle","mosquitoRepellent","roomFreshener","airFreshener","toiletCleaner","bleach","fabricSoftener","sponge","mug","hanger","notebook","pen","pencil","eraser","sharpener","glue",
      "tape","batteries","extensionCord","lightBulb","umbrella","raincoat","helmet","slippers","socks","innerwear","bedsheet","pillow","blanket","mattress","plasticContainer","steelBottle","lunchBox","pressureCooker","gasStove"
     // };
  // for(String product : products){
    // System.out.println("The brands for: " + product);
	// String brands[] = SuperMarket.serachBrandByProduct(product);
	// if(brands != null) {
      // for(String brand : brands) {
        // System.out.println(brand);
      // }
    // }
  // }
 // }
// }


class SuperMarketExecutor {

    public static void main(String[] args) {

        System.out.println("Main Started");

        String products[] = {
            "shampoo","biscuit","soap","toothpaste","oil","rice",
            "wheatFlour","sugar","salt","tea","coffee","milk",
            "curd","butter","cheese","bread","jam","honey",
            "noodles","pasta","sauce","ketchup","chips","chocolate",
            "icecream","softDrink","juice","waterBottle","detergent",
            "dishwashLiquid","handwash","sanitizer","facewash",
            "faceCream","lotion","talcumPowder","deodorant",
            "razor","shavingCream","hairOil","conditioner",
            "hairColor","bodyWash","scrub","makeupKit",
            "lipstick","kajal","nailPolish","babyDiaper",
            "babySoap","babyShampoo","babyLotion","tissuePaper",
            "napkin","sanitaryPad","energyDrink","cornflakes",
            "oats","peanutButter","pickle","papad",
            "vermicelli","suji","besan","turmeric",
            "chilliPowder","garamMasala","corianderPowder",
            "cuminSeeds","mustardSeeds","ghee","paneer",
            "yogurt","frozenPeas","frozenCorn","pizzaBase",
            "mayonnaise","vinegar","bakingPowder",
            "custardPowder","cakeMix","greenTea","proteinPowder",
            "dryFruits","almonds","cashews","raisins",
            "dates","popcorn","muesli","soySauce",
            "chocolateSyrup","glucose","biscuitsCream",
            "wafer","lollipop","chewingGum","instantSoup",
            "readyMix","poha","rava","ketchupSpicy",
            "fruitJam","peanutSnack","cookingSpray",
            "mineralWater","bathTowel","toothbrush",
            "mouthwash","liquidSoap","agarbatti",
            "matchBox","candle","mosquitoRepellent",
            "roomFreshener","airFreshener","toiletCleaner",
            "bleach","fabricSoftener","sponge",
            "mug","hanger","notebook","pen",
            "pencil","eraser","sharpener","glue",
            "tape","batteries","extensionCord",
            "lightBulb","umbrella","raincoat",
            "helmet","slippers","socks","innerwear",
            "bedsheet","pillow","blanket","mattress",
            "plasticContainer","steelBottle","lunchBox",
            "pressureCooker","gasStove"
        };

        for (int i = 0; i < products.length; i++) {
            System.out.println("Product: " + products[i]);
            String[] brands = SuperMarket.searchBrandByProduct(products[i]);
            if (brands != null) {
                for (int j = 0; j < brands.length; j++) {
                    System.out.println(brands[j]);
                }
            } else {
                System.out.println("No brands found");
            }
        }
        System.out.println("Main Ended");
    }
}