package com.example.tastycuisine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;
    TextView mytext;

    List<Recepies> recepies1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recepies1 = new ArrayList<>();


        recepies1.add(new Recepies("About Version 1.0 ","Hello All,\n" +
                "Bringing to you from the Food Crazy to all Food Crazys around the world ,the best recepies that even budding chefs can try out and feel the craze!!","Love for Food Never Fades !!!","\n\n\t\t\t\t\t\t\tEat Food Stay Happy!!",R.drawable.abtt));
        recepies1.add(new Recepies("Badam Milk","35 almonds 40 grams\n" +
                "1 liter whole milk\n" +
                "generous pinch saffron dissolved in 1 tablespoon milk\n" +
                "4-6 tablespoons granulated white sugar 50-75 grams, or to taste\n" +
                "5-6 green cardamom pods seeds removed & crushed using a mortar and pestle\n" +
                "1/2 teaspoon rose water optional","Method","Soak almond in hot water for 20 minutes. After 20 minutes, discard the water and then remove the skin from each almond. It will come off easily.\n" +
                "Transfer blanched almonds with ¼ cup milk to a blender. Blend to a smooth paste. Set it aside.\n" +
                "Now transfer the remaining milk to a pan and put in on medium-high heat.\n" +
                "As the milk warms up, take out 1 tablespoon of the warm milk from the pan into a small bowl and add crushed saffron strands to it. Set aside.\n" +
                "Once the milk in the pan comes to a boil, add the prepared almond paste to it. Stir to combine.\n" +
                "Lower the heat to low medium and let the milk simmer for 15 to 20 minutes. Stir often so that milk doesn’t get stuck to the bottom of the pan. The raw smell of almonds should disappear completely.\n" +
                "Add in the saffron milk that you had set aside.\n" +
                "Then add the sugar and stir until it’s dissolved.\n" +
                "Finally add in the crushed cardamom seeds. You may also add rose water (if using) at this point. Mix everything together and turn off the heat.\n" +
                "Serve badam milk hot or cold. I personally love it chilled.\n " +
                "Use whole milk for best results and taste.\n" +
                "There will be some almond pieces in the milk, if you do not want to bite into them while drinking the milk simply strain and serve.\n" +
                "I did not strain the milk since I love the little almond pieces in the milk.",R.drawable.bm));

        recepies1.add(new Recepies("Hot Coffee","1.5 teaspoons nescafe instant coffee\n" +
                "1.5 tablespoons sugar or add as per taste\n" +
                "3 tablespoons hot water\n" +
                "1 cup milk (250 ml)","Method","In a cup add instant coffee and sugar.\n" +
                "Add 3 tablespoons hot boiling water. ¼ cup hot water can also be added.\n" +
                "First mix the coffee and sugar with water and begin to stir briskly and beat coffee for 3 to 4 minutes. \n" +
                "Beat the coffee till its color lightens and you see a frothy layer on top.\n" +
                "Then take 1 cup milk in a small but heavy sauce pan and on a medium to medium-high flame boil it.\n" +
                "When the milk comes to boil pour the milk in a glass jar or a thermos flask.\n" +
                "Do not use any plastic bottle or jar. You can use a steel bottle also. A glass jar with a handle helps while shaking as the milk is hot.\n" +
                "Now shake the jar vigorously for 1 to 2 minutes. Alternatively to get the froth on milk, you can also use a handheld frother. Milk can be blended in a blender also.\n" +
                "There should be a nice layer of frothy foam on the milk.\n" +
                "Pour the foamy milk in the cup containing coffee.\n" +
                "After adding ⅓ or ½ of the milk to the coffee, stir with a spoon. You can even move the cup so that the milk get mixed with the coffee.\n" +
                "Then pour remaining milk along with the frothy layer. \n" +
                "Serve cafe style coffee straightway.\n" +
                "You can even sprinkle some cinnamon powder or cocoa powder on top. Enjoy this homemade cafe style coffee.",R.drawable.c));

        recepies1.add(new Recepies("Gulab Jamun","For Gulab Jamun\n" +
                "1 cup khoya (mawa or dried evaporated milk solids) or 200 grams khoya\n" +
                "¾ cup grated paneer or 100 grams of paneer (cottage cheese)\n" +
                "3 tablespoon all purpose flour\n" +
                "2 tablespoon fine sooji (rava or semolina)\n" +
                "4 green cardamoms - powdered in a mortar-pestle or ½ teaspoon cardamom powder\n" +
                "1 tablespoon milk or add as required\n" +
                "¼ teaspoon baking powder\n" +
                "oil for deep frying the gulab jamun\n" +
                "For Sugar Syrup\n" +
                "250 grams sugar or about 1.75 cup sugar\n" +
                "1 cup water\n" +
                "1 tablespoon rose water\n" +
                "1 tablespoon milk (optional) - read notes\n","Method","Making Gulab Jamun Balls\n" +
                "Take khoya (mawa or evaporated milk) in a bowl. Mash it very well. There should be no lumps. You can also grate and then mash the khoya.\n" +
                "Then add grated paneer, rava (sooji), all purpose flour (maida), baking powder and cardamom powder to the mashed khoya. There should be no lumps in both the mawa and paneer.\n" +
                "As if they are there, then you will find the texture of the gulab jamun not so good. The bits and pieces of mava or paneer will give a bite in the mouth, when you have the gulab jamun. They won't be smooth.\n" +
                "Mix well. Add milk and gather together to form a dough with milk. Don't knead.\n" +
                "Just gently mix. If you are unable to form balls or if the mixture appears dry, then add a few teaspoons of milk. Cover the dough and keep aside for 30 mins.\n" +
                "Make small balls from the dough. Cover the balls and keep aside.\n" +
                "Making Sugar Syrup For Gulab Jamun\n" +
                "Dissolve sugar in water. Heat the sugar solution till it become sticky. You just need to switch off the fire before the syrup reaches a one thread consistency.\n" +
                "Add rose water and stir. Keep the sugar solution aside. On cooling if the sugar syrup crystallizes, then just add 2 to 3 tbsp water and warm the syrup again. It will again return to a liquid state.\n" +
        "Making Gulab Jamun Balls\n" +
                "Take khoya (mawa or evaporated milk) in a bowl. Mash it very well. There should be no lumps. You can also grate and then mash the khoya.\n" +
                "Then add grated paneer, rava (sooji), all purpose flour (maida), baking powder and cardamom powder to the mashed khoya. There should be no lumps in both the mawa and paneer.\n" +
                "As if they are there, then you will find the texture of the gulab jamun not so good. The bits and pieces of mava or paneer will give a bite in the mouth, when you have the gulab jamun. They won't be smooth.\n" +
                "Mix well. Add milk and gather together to form a dough with milk. Don't knead.\n" +
                "Just gently mix. If you are unable to form balls or if the mixture appears dry, then add a few teaspoons of milk. Cover the dough and keep aside for 30 mins.\n" +
                "Make small balls from the dough. Cover the balls and keep aside.\n" +
                "Making Sugar Syrup For Gulab Jamun\n" +
                "Dissolve sugar in water. Heat the sugar solution till it become sticky. You just need to switch off the fire before the syrup reaches a one thread consistency.\n" +
                "Add rose water and stir. Keep the sugar solution aside. On cooling if the sugar syrup crystallizes, then just add 2 to 3 tbsp water and warm the syrup again. It will again return to a liquid state.\n" +
        "If the sugar syrup has impurities, then add milk and simmer. A layer of scum will be formed. Remove this layer with a spoon.",R.drawable.gj));

        recepies1.add(new Recepies("Masala Dosa","Ingredients For Batter\n" +
                "330 grams idli rice (parboiled rice, ukda chawal, sela chawal) or 1.5 cups idli rice\n" +
                "125 grams urad dal or ½ cup husked whole or split black gram\n" +
                "35 grams thick poha or ¼ cup thick poha (flattened rice)\n" +
                "1 tablespoon chana dal (husked & split bengal gram)\n" +
                "20 methi seeds (fenugreek seeds)\n" +
                "1 cup water for soaking urad dal\n" +
                "2 cups water for soaking rice\n" +
                "1 cup water for grinding rice & poha\n" +
                "½ cup water for grinding dal\n" +
                "½ teaspoon rock salt or add as required\n" +
                "Ingredients For Potato Masala\n" +
                "300 grams potatoes or 4 medium sized potatoes or 2 cups boiled & chopped or crumbled potatoes\n" +
                "2 tablespoons oil\n" +
                "½ teaspoon mustard seeds\n" +
                "1 tablespoon chana dal (husked & split bengal gram) soaked in ¼ cup hot water for 30 minutes\n" +
                "150 grams onions or 2 medium to large onions, thinly sliced or 1.25 cups thinly sliced onions\n" +
                "1 inch ginger, finely chopped or 1 teaspoon finely chopped ginger\n" +
                "8 to 10 curry leaves\n" +
                "1 to 2 green chillies, chopped\n" +
                "¼ teaspoon turmeric powder\n" +
                "1 pinch of asafoetida (hing)\n" +
                "½ cup water\n" +
                "3 tablespoons chopped coriander leaves\n" +
                "8 to 10 cashews , optional\n" +
                "¼ teaspoon sugar, optional\n" +
                "salt as required\n","Method","Soaking Rice & Lentils\n" +
                "First take all the ingredients in bowls. Take rice and poha in separate bowls. Take the urad dal, chana dal and methi seeds in one bowl.\n" +
                "Rinse the urad dal, chana dal and methi seeds a couple of times. Then soak them in 1 cup water for 4 to 5 hours.\n" +
                "Rinse the rice a couple of times and keep aside.\n" +
                "Rinse poha once or twice and then add to the rice.\n" +
                "Pour 2 cups water. Stir and soak both rice and poha together for 4 to 5 hours.\n" +
                "Making Masala Dosa Batter\n" +
                "Before grinding, strain the water from the soaked lentils and keep it for grinding urad dal. \n" +
                "Add the lentils in the grinder jar. Also add ½ cup of the soaked and strained water to the dal. You can even use fresh water while grinding.\n" +
                "Grind the urad dal, chana dal and methi seeds till you get a batter which is light and fluffy. The urad dal has to be ground really well, so that the batter ferments well.\n" +
                "Remove the batter in a bowl or pan with a spatula.\n" +
                "Strain the rice well. Then in the same grinder, add the soaked rice and 1 cup fresh water. You can grind rice in one batch or in two to three batches. This will depend on the size of the grinder jar. I ground in one batch and added 1 cup water for grinding. You can even add ¾ cup water while grinding. Addition of water will depend on the quality of rice.\n" +
                "Grind the rice till you get a fine grainy consistency in it. The rice batter should have a fine rawa like consistency. You can even grind to a smooth batter. \n" +
                "Now pour the batter in the same pan or bowl containing the urad dal batter.\n" +
                "Add ½ teaspoon rock salt or add as per taste.\n" +
                "Mix the salt very well with the batter. Also mix both the batters very well. Cover and keep aside to ferment for 8 to 9 hours. You can keep batter to ferment for less or more time and this will depend on the temperature conditions in your city.\n" +
        "Preparation For Potato Masala\n" +
                "First rinse and then boil 4 medium sized potatoes in 2 cups water for 5 to 6 whistles in a pressure cooker. You can also boil potatoes in a pan. The potatoes have to be completely cooked\n" +
                "When the potaoes are cooking, soak the chana dal in hot water for 30 minutes. Then drain the chana dal and keep aside.\n" +
                "When the pressure settles down on its own in the cooker, remove the lid. Drain the potatoes and let them become warm. then peel them and chop them.\n" +
                "Also slice the onions thinly and chop the green chilies, ginger and coriander leaves.\n" +
                "Making Potato Masala\n" +
                "Heat oil or ghee. Fry cashews and keep aside. This step of frying cashews is optional.\n" +
        "Lower the flame and add mustard seeds and let them splutter. Then add the chana dal.\n" +
                "Saute the chana dal for 2 to 3 minutes on a low flame or till they turn light golden or golden. Now add the sliced onions, curry leaves, green chilies and ginger.\n" +
                "Saute the onions till they soften and turn translucent.\n" +
                "Add the turmeric powder and asafoetida. Mix very well.\n" +
                "Add water. mix well and simmer for 2 to 3 minutes or till the mixture thickens a bit.\n" +
                "Next add the boiled chopped potatoes and mix very well.\n" +
                "Season with salt. Also add ¼ teaspoon sugar for a slight sweet taste.\n" +
                "Simmer on a low flame for 3 to 4 minutes stirring occasionally. The water will reduce and the potato masala will thicken. \n" +
        "Switch off the flame and then add chopped coriander leaves. Also add the fried cashews now and mix well. The potato masala should be moist and easily spreadable on the dosa. Make sure there is no water in the potato masala. It should not be of a curry or gravy consistency.\n" +
                "Stir and keep the potato masala aside.\n" +
                "Making Masala Dosa\n" +
                "Lightly stir the batter, before you begin to make dosa. You will also see tiny air pockets in the batter\n" +
                "Heat a cast iron pan or a flat non-stick pan. The pan should be medium hot. Smear some oil if using an iron pan or griddle. Don't smear oil on a non stick pan, as then you won't be able to spread the batter.\n" +
                "Keep the flame to a low, while spreading batter.\n" +
                "Spread the batter in a circular way on the pan.\n" +
                "On a medium flame, cook the dosa.\n" +
                "Sprinkle some oil on top and edges\n" +
                "Cover the dosa with a lid and let it cook.\n" +
                "Cook the dosa till its base becomes golden and crisp.\n" +
                "When you see the base has become golden, place a portion of the potato masala on the dosa. You can spread it a bit if you want.\n" +
                "Now fold the dosa and serve.\n" +
                "Serve crisp restaurant style masala dosa hot with coconut chutney and sambar\n",R.drawable.md));

        recepies1.add(new Recepies("Malai kofta","Gravy\n" +
                "1 tablespoon oil 15 ml, I used avocado oil\n" +
                "1 bay leaf\n" +
                "1 inch cinnamon stick\n" +
                "4 whole green cardamoms slightly crushed\n" +
                "3 cloves\n" +
                "1 teaspoon shahi jeera caraway seeds\n" +
                "6-7 large garlic cloves 22 grams, roughly chopped\n" +
                "1.5 inch ginger 16 grams, roughly chopped\n" +
                "1 green chili chopped\n" +
                "1 large yellow onion 190 grams, chopped\n" +
                "2 large tomatoes 390 grams, chopped\n" +
                "12 cashews whole and raw\n" +
                "2 cups water 16 oz\n" +
                "2 tablespoons butter 28 grams\n" +
                "1 teaspoon oil 5 ml\n" +
                "1 teaspoon coriander powder\n" +
                "1/4 teaspoon kashmiri red chili powder\n" +
                "1/2 teaspoon salt or to taste\n" +
                "1 teaspoon sugar\n" +
                "1/8 teaspoon garam masala or more to taste\n" +
                "2 teaspoons crushed kasuri methi dried fenugreek leaves\n" +
                "3 tablespoons heavy cream 45 ml\n" +
                "pinch cardamom powder\n" +
                "cilantro to garnish\n" +
                "Malai Kofta\n" +
                "1 cup mashed & boiled potatoes\n" +
                "1 cup grated paneer\n" +
                "1 tablespoons finely chopped ginger\n" +
                "1.5 tablespoons chopped cilantro\n" +
                "1 green chili chopped\n" +
                "1 tablespoon chopped cashews\n" +
                "1 tablespoon chopped raisins golden raisins\n" +
                "1.5 tablespoons cornstarch\n" +
                "1/2 teaspoon salt\n" +
                "1/4 teaspoon white pepper powder\n" +
                "1/4 teaspoon cardamom powder\n" +
                "oil for frying, I used sunflower oil","Method","Make the gravy/curry\n" +
                "Heat a pot/pan on medium heat. Once hot, add 1 tablespoon oil and then add the bay leaf, cinnamon, green cardamom, cloves and shahi jeera.\n" +
                "Let the spices sizzle for few seconds and then add the chopped garlic, ginger, green chili and onion.\n" +
                "Saute for around 2 minutes, do not brown the onion.\n" +
                "Then add the tomatoes along with cashews and 2 cups of water and stir.\n" +
                "Cover the pot with a lid and cook for around 10 to 12 minutes until tomatoes soften.\n" +
                "Let it cool down down a bit (around 15 minutes, if you blend it while it's hot it might blow off from the blender), then discard the bay leaf and transfer mixture to a blender.\n" +
                "Blend to a smooth paste. Use a strainer and strain the puree into another bowl. This makes sure the gravy is really smooth.\n" +
                "Put the same pan on medium heat again. Once hot, add 2 tablespoons unsalted butter and 1 teaspoon oil. Let the butter melt.\n" +
                "Add in the pureed gravy and cook for 2 minutes. Then add the coriander powder, kashmiri red chili powder, salt, sugar and garam masala.\n" +
                "Let the curry cook for 2 to 3 minutes.\n" +
                "Add crushed kasuri methi and then cream. Cook for additional 2 to 3 minutes on medium-low heat. Sprinkle some cardamom powder on top. The gravy is now done. Set aside and make kofta.\n" +
                "Make the kofta\n" +
                "Boil the potatoes using a pressure cooker, 8-9 whistles on a stove-top pressure cooker. You can do this on the side while making the gravy.\n" +
                "Once the potatoes are boiled, let them cool a bit then peel and mash them.\n" +
                "To a large bowl, now add all ingredients for kofta- boiled and mashed potatoes, grated paneer, finely chopped ginger, cilantro, green chili, cashews, raisins, cornstarch, salt, white pepper powder and 1/4 teaspoon cardamom powder.\n" +
                "Mix everything together with your hands to form a dough. Start making koftas from the dough. Take some part of the dough and roll between your palms to make it round.\n" +
                "Similarly makes all the koftas. I made 9 koftas, each around 40 to 42 grams.\n" +
                "Heat enough oil to fry in a kadai on medium-high heat. Make sure oil is hot, else koftas can stick to the pan and also disintegrate in the oil.\n" +
                "Drop koftas in hot oil and fry until golden brown from both sides. Remove the fried koftas on a paper towel. You can also shallow fry them, just press the koftas and flatten them like a burger tikki and shallow fry.\n" +
                "Serve the malai kofta\n" +
                "To serve place koftas on plate and top with the gravy. Garnish with cream and cilantro. Or you can also place the gravy first on the serving plate, drizzle with cream and place koftas on top.\n" +
                "If you like melt in mouth koftas, it's also a good idea to let the koftas simmer in the gravy for 2 minutes before serving.\n" +
                "If you prefer the koftas to be on the crispier side, then add gravy on top only before serving.\n" +
                "Enjoy malai kofta with naan or rice!\n"+"If using store bought paneer for the kofta, make sure to put the block of paneer if hot water first for 20-30 minutes. Then remove paneer block from hot water, pat dry with a paper towel and then grate the paneer for the kofta. If using homemade paneer, you don't need to do this step.",R.drawable.mk));


          recepies1.add(new Recepies("Gajar Ka Halwa","8 to 9 medium tender juicy carrots or 650 grams - yields approx 4 to 4.5 cups grated carrots\n" +
                  "4 cups full fat organic milk\n" +
                  "4 tablespoons ghee (clarified butter)\n" +
                  "10 to 12 tablespoons regular sugar or organic unrefined cane sugar or 180 to 190 grams sugar - add as required\n" +
                  "5 to 6 green cardamom - powdered finely in a mortar-pestle or about ⅓ to 1 teaspoon cardamom powder\n" +
                  "10 to 12 whole cashews - chopped\n" +
                  "10 to 12 almonds - sliced or chopped\n" +
                  "2 tablespoons golden raisins\n" +
                  "1 pinch saffron strands - optional","Method","Preparation\n" +
                  "First rinse, peel and then grate the carrots (8-9 medium sized tender juicy carrots), either with a hand held grater or in a food processor.\n" +
                  "You need approx 4 to 4.5 cups grated carrots.\n" +
                  "Making Carrot Halwa\n" +
                  "In a kadai or deep thick bottomed pan combine milk and grated carrots.\n" +
                  "On a low to medium flame, bring the whole mixture to a boil and then simmer.\n" +
                  "While the mixture is simmering on a low flame, keep on stirring in between.\n" +
                  "The grated carrots will cook in the milk and the milk will start to reduce and evaporate.\n" +
                  "When the milk has 75% reduced, add the ghee, sugar and powdered cardamom to the mixture.\n" +
                  "Stir well and continue to simmer and cook on a low flame.\n" +
                  "Do keep on stirring the halwa in between.\n" +
                  "Towards the end, add the cashews, almonds, saffron and raisins. Simmer the halwa till all the milk is evaporated. Switch off the burner.\n" +
                  "Serve gajar halwa hot, warm or you can also serve it cold. garnish with some chopped dry fruits while serving.",R.drawable.gkh));

          recepies1.add(new Recepies("Veg Momos","For Outer Cover Of Momos\n" +
                  "1 cup all purpose flour\n" +
                  "½ teaspoon oil\n" +
                  "¼ teaspoon salt or as required\n" +
                  "2 to 3 tablespoon water for kneading or as required\n" +
                  "For Making Veg Momos Stuffing\n" +
                  "1.5 to 1.75 cups finely chopped vegetables (i added ½ cup chopped cabbage, ½ cup chopped carrots, ⅓ cup chopped french beans and ¼ cup chopped capsicum)\n" +
                  "2 small sized spring onions - finely chopped - reserve the greens to be added later\n" +
                  "3 to 4 small garlic - finely chopped\n" +
                  "1.5 teaspoon light soy sauce or 1 teaspoon soy sauce or add as required\n" +
                  "½ teaspoon black pepper powder or as required\n" +
                  "1 tablespoon oil\n" +
                  "salt as required","Method","Making Outer Cover Of Veg Momos\n" +
                  "Take the all purpose flour, salt and oil in a bowl and mix it.\n" +
                  "Add water in parts and knead to a firm dough. Cover the dough and keep aside for 30 minutes.\n" +
                  "Making Momos Stuffing\n" +
                  "Finely chop all the vegetables. You can also use a food processor to chop the vegetables.\n" +
                  "In a thick bottomed pan heat oil. Add garlic. Saute for 2-3 seconds.\n" +
                  "Add onions and saute for 10-15 seconds. Add all the finely chopped vegetables.\n" +
                  "Increase the flame and stir fry the vegetables on a medium to high flame. If you have not used a thick bottomed pan, then saute the veggies on a low to medium flame.\n" +
                  "Saute or stir fry for 2 to 3 minutes. Then add soy sauce, salt and pepper.\n" +
                  "Continue to stir fry on a medium to high flame for 2 to 3 minutes more.\n" +
                  "Switch off the flame and add 1 to 2 tbsp of the spring onions greens. Mix well.\n" +
                  "Check the taste and add more salt, pepper or soy sauce, if required.\n" +
                  "Shaping The Veg Momos\n" +
                  "Divide the dough in two parts. Make a 6-7 inch log from each part. Cut the log into equal slices.\n" +
                  "Make ball of each slice and keep them covered with a moist napkin.\n" +
                  "Take each dough ball and on a lightly dusted board, roll each dough ball into a thin circle of about 2-3 inch diameter.\n" +
                  "Try to get the edges to be thin and the center to be thick.\n" +
                  "Place 1 or 2 tsp of vegetable stuffing in the center.\n" +
                  "Lift one side of the edge and start pleating. (you can also refer to the video above to see how pleating is done).\n" +
                  "Start folding and forming the pleats one by one. Towards the end, join the pleats in the center.\n" +
                  "Prepare all momos this way and keep them covered under a moist napkin. Till you are ready to steam them.\n" +
                  "Steaming Veg Momos\n" +
                  "Heat water in a steamer or in a electric cooker or in a pressure cooker. Let the water come to a boil.\n" +
                  "In a greased steamer pan or in idli moulds, place them keeping space between them so that they don't touch each other. * check notes on how to steam the momos in idli pan or pressure cooker.\n" +
                  "Steam them for 5-6 minutes.\n" +
                  "Don't overdo the steaming, as the dough becomes dense and dry.\n" +
                  "The steaming time may vary upon the thickness of momos' cover.\n" +
                  "When you touch the momo then dough should not feel sticky to you. This means they are done and the momos will have a transparent look.\n" +
                  "Time of cooking varies from intensity of the flame and kind of pan and the steamer you are using.\n" +
                  "Once done, garnish with spring onion greens.\n" +
                  "Serve veg momos with a spicy sauce like schezwan sauce or tomato-chili sauce or chili sauce. You can also serve it with red chilli garlic chutney. They go very well with a spicy sauce.",R.drawable.mm));

          recepies1.add(new Recepies("Masala Vada","1 cup chana dal / kadle bele\n" +
                  "2 tbsp urad dal\n" +
                  "3 kashmiri red chilli, dried\n" +
                  "1 green chilli, finely chopped\n" +
                  "1 inch ginger, grated\n" +
                  "½ onion, finely chopped\n" +
                  "few curry leaves, chopped\n" +
                  "3 tbsp coriander leaves, finely chopped\n" +
                  "pinch of hing / asafoetida\n" +
                  "salt to taste\n" +
                  "oil for deep frying","Method","Firstly, in a large bowl wash and soak 1 cup chana dal, 2 tbsp urad dal and 3 red chilli for 2 hours.\n" +
                  "further, drain off the water and rest for 10 minutes. so that all water will be drained off.\n" +
                  "transfer the dal to a blender and blend to coarse paste without adding any water. add just a tsp of water if required.\n" +
                  "now transfer the coarse dal paste into large mixing bowl.\n" +
                  "add in 1 green chilli, 1 inch ginger, ½ onion, few curry leaves, 3 tbsp coriander leaves, pinch of hing and salt to taste.\n" +
                  "combine them well.\n" +
                  "furthermore grease your hand with oil and prepare small balls, flatten the vada.\n" +
                  "and deep fry in hot oil.\n" +
                  "also stir occasionally till the vada turns golden and crisp.\n" +
                  "finally, serve masala vada hot along with masala chai.",R.drawable.mv));

          recepies1.add(new Recepies("Palak Paneer","FOR PALAK PASTE:\n" +
                  "5 cup water\n" +
                  "1 bunch palak / spinach\n" +
                  "1 inch ginger\n" +
                  "1 clove garlic\n" +
                  "3 green chilli\n" +
                  "OTHER INGREDIENTS:\n" +
                  "3 tsp oil\n" +
                  "1 tsp butter\n" +
                  "11 cube paneer / cottage cheese\n" +
                  "1 tsp cumin / jeera\n" +
                  "1 inch cinnamon\n" +
                  "4 cloves\n" +
                  "2 pod cardamom / elachi\n" +
                  "1 bay leaf / tej patta\n" +
                  "2 tsp kasuri methi / dry fenugreek leaves\n" +
                  "½ onion, finely chopped\n" +
                  "½ tomato, finely chopped\n" +
                  "¼ cup water\n" +
                  "¾ tsp salt\n" +
                  "¼ tsp garam masala\n" +
                  "2 tbsp cream / malai","Method","Take blanched palak, 1 inch ginger, 1 clove garlic and 4 green chilli.\n" +
                  "blend to smooth paste without adding any water. keep aside.\n" +
                  "now in a large kadai heat 3 tsp oil, 1 tsp butter and roast the spices till it turns aromatic.\n" +
                  "further, add ½ onion and saute till it turns golden brown\n" +
                  "additionally, add ½ tomato and saute till the tomatoes turn soft and mushy.\n" +
                  "add prepared palak paste, ¼ cup water and ¾ tsp salt.\n" +
                  "mix well adjusting consistency as required.\n" +
                  "further, add roasted paneer and mix well.\n" +
                  "simmer for 5 minutes or till paneer absorbs flavour.\n" +
                  "turn off the flame and add ¼ tsp garam masala, 1 tsp kasuri methi and 2 tbsp cream. mix well.\n" +
                  "finally, serve restaurant-style palak paneer with roti / naan.",R.drawable.pp));

          recepies1.add(new Recepies("Kerala Puttu","1 cup puttu flour\n" +
                  "⅓ cup water or add as required\n" +
                  "⅓ teaspoon salt or add as required\n" +
                  "½ cup fresh grated coconut\n" +
                  "2 to 3 cups water for steaming","Method","Making Puttu Flour Mixture\n" +
                  "Take 1 cup puttu flour in a mixing bowl or a pan.\n" +
                  "Add ⅓ teaspoon salt or as required.\n" +
                  "Now sprinkle ⅓ cup water all over. The amount of water required will depend on the quality of rice flour. So you can add accordingly.\n" +
                  "Begin to mix the rice flour with the water with your fingertips.\n" +
                  "To get soft puttu, the amount of rice flour to water ratio is important. To check this gently press a small portion of the flour between your palms. It should form a lump. When you press this flour lump more, then it breaks and crumbles. This should be the texture of the flour.\n" +
                  "Break all the tiny lumps in the flour with your fingertips. You can even grind this rice flour mixture in a grinder to break lumps. But grind in small batches and use the pulse option of mixer-grinder.\n" +
                  "Now pour 2 cups water in the base vessel of the puttu kudam.\n" +
                  "Keep on stove top and let it get heated.\n" +
                  "Steaming Puttu\n" +
                  "Meanwhile first place the perforated disc inside the cylindrical vessel. Then add 2 to 3 tablespoons fresh coconut in the cylindrical vessel of the puttu kudam and spread evenly.\n" +
                  "Then gently add the puttu flour till it reaches half of the cylindrical vessel.\n" +
                  "Again add 2 to 3 tablespoons of grated coconut and spread evenly.\n" +
                  "Then add the puttu flour again.\n" +
                  "Cover the top portion with 2 to 3 tablespoons of grated coconut and spread evenly. Cover with the top lid. \n" +
                  "Place the cylindrical portion on top of the base vessel in which the water must have come to a boil.\n" +
                  "Steam puttu on medium flame till you see steam releasing from the top vents of the cylindrical vessel. Then switch off the flame. \n" +
                  "Remove the cylindrical part from the bottom vessel and allow the puttu inside to cool for 3 to 4 minutes.\n" +
                  "Then using a wooden skewer or the stick that accompanied the puttu kudam, remove the steamed puttu.\n" +
                  "Serve puttu hot or warm with kadala curry, veg stew or potato stew. It will also go well with south indian chana masala. ",R.drawable.pt));





        recepies1.add(new Recepies("About Developer","Developer: Surajram.S","About the Developer ","Heyy all!! \n" +"I am Surajram.S and I am currently a student ofthird year of the Department of CSE ,SVCE.\n"+"I am passionate about front end Web and App Development\n"+
                "Do Get in touch with me.\n\n"+
                "Phone: 9500176792\n\n"+
                "Email: surajram1707@gmail.com\n\n"+
                "GitHub:https://github.com/Surajram1707\n\n\n" +
                "Hope you will love this app and will cook Tasty Cuisines!!!!",R.drawable.d));


    myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

    myAdapter = new RecyclerViewAdapter(this,recepies1);

    myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));

    myrecyclerView.setAdapter(myAdapter);



    }


}