package com.example.thirtydaysapp

import com.example.thirtydaysapp.R

class Datasource {
    fun loadTips(): List<Tip> {
        return listOf(
            Tip(1,"Start Coding Daily","Spend at least 30 minutes practicing coding.",R.drawable.image1),
            Tip(2,"Learn Variables","Understand how variables store data.",R.drawable.image2),
            Tip(3,"Practice Conditions","Use if-else statements to control flow.",R.drawable.image3),
            Tip(4,"Understand Loops","Practice for and while loops.",R.drawable.image4),
            Tip(5,"Solve Simple Problems","Try basic coding problems online.",R.drawable.image5),

            Tip(6,"Learn Functions","Break programs into reusable functions.",R.drawable.image1),
            Tip(7,"Understand Arrays","Learn how arrays store multiple values.",R.drawable.image2),
            Tip(8,"Practice Debugging","Find and fix errors in code.",R.drawable.image3),
            Tip(9,"Learn Lists","Use collections like lists in Kotlin.",R.drawable.image4),
            Tip(10,"Read Documentation","Understand official programming docs.",R.drawable.image5),

            Tip(11,"Write Clean Code","Use meaningful variable names.",R.drawable.image1),
            Tip(12,"Understand OOP","Learn classes and objects.",R.drawable.image2),
            Tip(13,"Create Small Projects","Build mini apps to practice.",R.drawable.image3),
            Tip(14,"Learn Git Basics","Track changes using Git.",R.drawable.image4),
            Tip(15,"Explore Android UI","Practice layouts in Compose.",R.drawable.image5),

            Tip(16,"Practice LazyColumn","Display lists in Compose.",R.drawable.image1),
            Tip(17,"Use Material Design","Follow UI design principles.",R.drawable.image2),
            Tip(18,"Understand State","Learn remember and mutableStateOf.",R.drawable.image3),
            Tip(19,"Handle User Input","Work with TextField and buttons.",R.drawable.image4),
            Tip(20,"Improve UI","Add spacing and better layouts.",R.drawable.image5),

            Tip(21,"Learn Navigation","Move between screens in apps.",R.drawable.image1),
            Tip(22,"Use Animations","Add small UI animations.",R.drawable.image2),
            Tip(23,"Optimize Code","Write efficient programs.",R.drawable.image3),
            Tip(24,"Study Algorithms","Learn sorting and searching.",R.drawable.image4),
            Tip(25,"Practice Daily Challenges","Solve problems regularly.",R.drawable.image5),

            Tip(26,"Build Portfolio","Create projects for your resume.",R.drawable.image1),
            Tip(27,"Learn APIs","Fetch data from the internet.",R.drawable.image2),
            Tip(28,"Test Your App","Check for bugs and errors.",R.drawable.image3),
            Tip(29,"Refactor Code","Improve existing code quality.",R.drawable.image4),
            Tip(30,"Keep Learning","Stay consistent and keep improving.",R.drawable.image5)
        )
    }
}