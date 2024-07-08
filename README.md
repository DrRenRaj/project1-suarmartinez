# Gym App by Suar Martinez (Mobile App)
# P.S, Hello Professor I just wanted to let you know that i tried my best to implement everything correctly, I had a Operating System Exam the beginning of this week so I started this project super late which is why it isn't the best which I'm sorry for. I really did have fun building it but I wasn't able to implement it to the fullest.

## Overview
This is a Gym App designed to help users track their exercises and workouts. The app includes features such as adding exercises, viewing exercise details (I wasn't able to fully make it work :(, tracking progress, and having a exercise list.

## Features I tried my best to implement (I implemented it but not the greatest)
- Home Page
- Add new exercises
- View exercise details
- Edit user profile
- Simple settings page
- About section with new Activity
- Track progress
- List of Exercises


## Activities and Fragments
- **MainActivity**: The main entry point of the app(home), containing the home screen and also the About button which opens the Second Activity
- **AboutActivity**: Provides information about the app and who created it (MEEEEE YAYYY) sadly I didn't have enough time to make sure to have a back arrow to go back to the Main Activity
- **HomeFragment**: Welcome screen with navigation options, it will have "Welcome to Gym App" and have the two buttons sign in and about.
- **SignInFragment**: Allows users to sign in, also this is on the home page, and it will ask for a username and password, once you click log in, it will welcome you but i wasn't able to have it redirect you to another page sadly, so you will have to use the back arrow.
- **ProfileFragment**: Displays a profile picture and edits user profile (Sadly I had to hardcode it in as I didn't have much time) but when you click edit profile it will let you change your username and then if you click back it will take you back to the profile page and it will show your new name.
- **ProgressTrackerFragment**: Tracks user workout progress, so for this part you will enter a workout exercise, EX: enter bench press increased 5 lbs and it will save it there while the app is running. 
- **SettingsFragment**: App settings such as change password, dark mode for app, and logout button which takes you bag to home page, (I wasn't able to implement the change password button since I ran out of time, but I added it because that is how i wanted to have my app if I would've been able to finish it)
- **AddExerciseFragment**: Form to add a new exercise, input the name of the exercise, the reps that you did, and the sets as well and once you click the add exercise button it will then take you to the exerciselist fragment.
- **ExerciseListFragment**: Displays a list of exercises based on what you input on AddExercise Fragment, but this will only show a list if you add a exercise in the Add Exercise page.
- **ExerciseDetailFragment**: This was the one fragment that gave me lots of trouble, if you click on it directly it will close the app which i wasn't able to figure out, but if you are on the Exercise List and click on one of the exercises you input then it will take you to the Exercise Details fragment without exiting the app.

## Navigation
This app uses Jetpack Navigation for seamless navigation between fragments and activities, also I used drawer navigation for easy access to different sections of the app making it smoother for the user.

## Layouts
I did implement the layout for a tablet but i was never able to find out why i couldn't see it under my layout folder? So i kind of just decided to leave it like that.

## Installation
1. Clone the repository.
2. Open the project in Android Studio.
3. Build and run the app on an emulator or physical device.

## Third-Party Libraries
- [Jetpack Navigation](https://developer.android.com/guide/navigation)
- [RecyclerView](https://developer.android.com/guide/topics/ui/layout/recyclerview)

