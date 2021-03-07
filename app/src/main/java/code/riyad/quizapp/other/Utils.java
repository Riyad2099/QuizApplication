

package code.riyad.quizapp.other;

import android.content.Context;
import android.text.TextUtils;
import android.util.Patterns;

import code.riyad.quizapp.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class Utils {

    public static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }

    public static String formatDate(long time){
        SimpleDateFormat formatter = new SimpleDateFormat(Constants.DATE_FORMAT, Locale.getDefault());

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return formatter.format(calendar.getTime());
    }

    public static Map<String,String> getMathQuestions(){
        HashMap<String,String> questions = new HashMap<>();
        questions.put("Find the sum of 111 + 222 + 333","666");
        questions.put("Subtract 457 from 832","375");
        questions.put("Simplify: 26 + 32 - 12","46");
        questions.put("Simplify :150 ÷ (6 + 3 x 8) - 5","0");
        questions.put("Find the product of 72 × 3","216");
        questions.put("Simplify : 3 + 6 x (5 + 4) ÷ 3 - 7","14");
        questions.put("How many sides does a decagon have?","10");
        questions.put("8. 5% × 209","10.45");
        questions.put("9. 37% × 302","111.74");
        questions.put("2+2","4");

        return questions;
    }

    public static Map<String,String> getRandomMathQuestions(int SIZE){
        HashMap<String,String> questionsMap = new HashMap<>();
        Map<String,String> originalQuestion = getMathQuestions();
        int originalSize =  originalQuestion.size();
        ArrayList<String> keyList = new ArrayList<String>(originalQuestion.keySet());

        while (questionsMap.size()<=SIZE){
            Random random = new Random();
            int randomNumber = random.nextInt(originalSize);
            String question = keyList.get(randomNumber);
            if (!questionsMap.containsKey(question)){
                questionsMap.put(question,originalQuestion.get(question));
            }
        }
        return questionsMap;
    }



    public static Map<String,Map<String,Boolean>> getLiteratureQuestions(){
        HashMap<String,Map<String,Boolean>> questions = new HashMap<>();

        HashMap<String,Boolean> answer1 = new HashMap<>();
        answer1.put("Collection of views and other child views.",true);
        answer1.put("Base class of building blocks.",false);
        answer1.put("Layouts",false);
        answer1.put("None of the above",false);
        questions.put("What is android view group?",answer1);

        HashMap<String,Boolean> answer2 = new HashMap<>();
        answer2.put("It will react on broadcast announcements.",true);
        answer2.put("It will do background fucnctionalities as services.",false);
        answer2.put("It will pass the data between activites.",false);
        answer2.put("None of the above.",false);
        questions.put("What is broadcast receiver in android?",answer2);

        HashMap<String,Boolean> answer3 = new HashMap<>();
        answer3.put("Interface class",false);
        answer3.put("A class that does not have a name but have functionalities in it.",true);
        answer3.put("Java class",false);
        answer3.put("Manifest file",false);
        questions.put("What is anonymous class in android?",answer3);

        HashMap<String,Boolean> answer4 = new HashMap<>();
        answer4.put("Stack.xml",false);
        answer4.put("Text.xml",false);
        answer4.put("Strings.xml",true);
        answer4.put("String.java",false);
        questions.put("The XML file that contains all the text that your app uses.",answer4);

        HashMap<String,Boolean> answer5 = new HashMap<>();
        answer5.put("Object",false);
        answer5.put("Context",false);
        answer5.put("activityGroup",false);
        answer5.put("contextThemeWrapper",true);
        questions.put("Parent class of Activity?",answer5);

        HashMap<String,Boolean> answer6 = new HashMap<>();
        answer6.put("Activity",false);
        answer6.put("Services",false);
        answer6.put("ContentProvider",true);
        answer6.put("BroadcastReceiver",false);
        questions.put("Which component is not activated by an Intent?",answer6);

        HashMap<String,Boolean> answer7 = new HashMap<>();
        answer7.put("DialogFragment",false);
        answer7.put("ListFragment",false);
        answer7.put("PreferenceFragment",false);
        answer7.put("CursorFragment",true);
        questions.put("Which one is NOT related to fragment class?",answer7);

        HashMap<String,Boolean> answer8 = new HashMap<>();
        answer8.put("Started",false);
        answer8.put("Bound",false);
        answer8.put("A & B",true);
        answer8.put("None of the above",false);
        questions.put("How many ways to start services?",answer8);

        HashMap<String,Boolean> answer9 = new HashMap<>();
        answer9.put("Shared Preferences",false);
        answer9.put("Internal Storage",false);
        answer9.put("SQLite Database",false);
        answer9.put("Content Provider",true);
        questions.put("If you want to share data across the all apps, you should go for?",answer9);

        HashMap<String,Boolean> answer10 = new HashMap<>();
        answer10.put("findByID()",false);
        answer10.put("findFragmentByID()",false);
        answer10.put("getContext.findFragmentByID()",false);
        answer10.put("FragmentManager.findFragmentByID()",true);
        questions.put("Fragment in android can be found through?",answer10);

        return questions;
    }

    public static Map<String,Map<String,Boolean>> getGeographyQuestions(){
        HashMap<String,Map<String,Boolean>> questions = new HashMap<>();

        HashMap<String,Boolean> answer1 = new HashMap<>();
        answer1.put("Mustard",false);
        answer1.put("Linseed",false);
        answer1.put("Groundnut ",true);
        answer1.put("coconut",false);
        questions.put("The scarcity or crop failure of which of the following can cause a serious edible oil crisis in India?",answer1);

        HashMap<String,Boolean> answer2 = new HashMap<>();
        answer2.put("old mountains",true);
        answer2.put("young mountains",false);
        answer2.put("fold mountains",false);
        answer2.put("block mountains",false);
        questions.put("The pennines (Europe), Appalachians (America) and the Aravallis (India) are examples of",answer2);

        HashMap<String,Boolean> answer3 = new HashMap<>();
        answer3.put("5",false);
        answer3.put("13",true);
        answer3.put("8",false);
        answer3.put("10",false);
        questions.put("The number of major ports in India is",answer3);

        HashMap<String,Boolean> answer4 = new HashMap<>();
        answer4.put("Gondak",false);
        answer4.put("Kosi",false);
        answer4.put("Sutlej",false);
        answer4.put("Krishna",true);
        questions.put("Which of the following is a peninsular river of India?",answer4);

        HashMap<String,Boolean> answer5 = new HashMap<>();
        answer5.put("1730 hours",false);
        answer5.put("0630 hours",true);
        answer5.put("midnight ,GMT",false);
        answer5.put("None of the above",false);
        questions.put("When it is noon IST at Allahabad in India, the time at Greenwich, London, will be",answer5);

        HashMap<String,Boolean> answer6 = new HashMap<>();
        answer6.put("USA",false);
        answer6.put("Canada",true);
        answer6.put("Australia",false);
        answer6.put("India",false);
        questions.put("Which country has the largest coast line?",answer6);

        HashMap<String,Boolean> answer7 = new HashMap<>();
        answer7.put("Alluvial soils",true);
        answer7.put("Black soils",false);
        answer7.put("Laterite soils",false);
        answer7.put("Red soils",false);
        questions.put("Which of the following types of soil are mostly confined to river basins and coastal plains of India?",answer7);

        HashMap<String,Boolean> answer8 = new HashMap<>();
        answer8.put("USA",true);
        answer8.put("India",false);
        answer8.put("Australia",false);
        answer8.put("France",false);
        questions.put("Which of the following countries leads in the production of aluminium and its products in the world?",answer8);

        HashMap<String,Boolean> answer9 = new HashMap<>();
        answer9.put("Coconut",true);
        answer9.put("Cotton",false);
        answer9.put("Sugarcane",false);
        answer9.put("Rice",false);
        questions.put("Which of the following crops is regarded as a plantation crop?",answer9);

        HashMap<String,Boolean> answer10 = new HashMap<>();
        answer10.put("33.3%",true);
        answer10.put("30.3%",false);
        answer10.put("38.3%",false);
        answer10.put("42.3%",false);
        questions.put("The proportion of forest to the total national geographical area of India as envisaged by National Forest Policy is",answer10);

        HashMap<String,Boolean> answer11 = new HashMap<>();
        answer11.put("Gandhi Sagar",true);
        answer11.put("Hirakud",false);
        answer11.put("Periyar",false);
        answer11.put("Tungabhadra",false);
        questions.put("Which of the following dams has generations of power more than irrigation as its main purpose?",answer11);

        HashMap<String,Boolean> answer12 = new HashMap<>();
        answer12.put("The lease Himalayas and the Indo Gangetic plain",true);
        answer12.put("The foot hills and the Indo Gangetic plain",false);
        answer12.put("The greater Himalayas and the lesser Himalayas",false);
        answer12.put("Indo-Gangetic plains and the peninsula",false);
        questions.put("The outer Himalayas lie between",answer12);

        HashMap<String,Boolean> answer13 = new HashMap<>();
        answer13.put("Aravalis",true);
        answer13.put("Vindhyas",false);
        answer13.put("Satpuras",false);
        answer13.put("Nilgiri hills",false);
        questions.put("The oldest mountains in India are",answer13);

        HashMap<String,Boolean> answer14 = new HashMap<>();
        answer14.put("1/6",true);
        answer14.put("1/3",false);
        answer14.put("1/10",false);
        answer14.put("1/50",false);
        questions.put("Approximately what fraction of the world’s population lives in India?",answer14);

        HashMap<String,Boolean> answer15 = new HashMap<>();
        answer15.put("Second",true);
        answer15.put("Third",false);
        answer15.put("Fourth",false);
        answer15.put("Fifth",false);
        questions.put("India has the _________ largest population on Earth",answer15);

        return questions;
    }

    public static Map<String,Map<String,Boolean>> getRandomLiteratureAndGeographyQuestions(Context context, String subject, int SIZE){
        Map<String,Map<String,Boolean>> questionsMap = new HashMap<>();
        Map<String, Map<String, Boolean>> originalQuestion;
        if (subject.equals(context.getString(R.string.geography))){
            originalQuestion = getGeographyQuestions();
        }else{
            originalQuestion = getLiteratureQuestions();
        }

        int originalSize =  originalQuestion.size();
        ArrayList<String> keyList = new ArrayList<String>(originalQuestion.keySet());

        while (questionsMap.size()<=SIZE){
            Random random = new Random();
            int randomNumber = random.nextInt(originalSize);
            String question = keyList.get(randomNumber);
            if (!questionsMap.containsKey(question)){
                questionsMap.put(question,originalQuestion.get(question));
            }
        }
        return questionsMap;
    }

}
