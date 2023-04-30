
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MainAnimalRegistry {
    static int counter;

    public static void main(String[] args){
  boolean b = true;
System.out.println("Здравствуйте,это реестр домашних животных");
System.out.println("Вы можете вести по ним учёт,добавлять,выводить информацию");

String choice="";
while (b == true) {
    System.out.println();
    System.out.println("Если хотите завести новое  животное жмите 1");
    System.out.println("Если хотите вывести всех животных жмите 2");
    System.out.println("Если хотите выйти , жмите 3");
    Scanner scanner=new Scanner(System.in);
choice=scanner.nextLine();

if (choice.equals("1")) {
    try{  counter=Counter.add(counter);

    CreateAnimals createAnimals = new CreateAnimals();
    GetFiletxt filetxt = new GetFiletxt();


    ArrayList<ArrayList<String>> animalist = createAnimals.getArralistAnimals();
    filetxt.GetFile(animalist);




    for (int i = 0; i < animalist.size(); i++) {

        System.out.printf(animalist.get(i) + "  ");
    }




    }catch (Exception e){

        System.err.println("Что-то пошло не так");
    }

}

if (choice.equals("2")){
try {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
FileReader file = new FileReader("Animals.txt");
int c=0;
while ((c = file.read()) != -1){
    System.out.printf(String.valueOf((char) c));
}

} catch (FileNotFoundException e) {
    System.err.println("Указанный файл ещё не заведён");
//e.printStackTrace();
}

catch (IOException e) {
e.printStackTrace();
}


}


if (choice.equals("3")){
System.out.println("Спасибо,до свиданья");
b=false;
}

else if(!(choice.equals("1")||choice.equals("2")||choice.equals("3"))) {
System.out.println("Неправильный ввод");
System.out.println(" Пожалуйста введите ещё раз");
}


}


System.out.println("В текущей сессии мы завели " + counter+" животных");



    }


    
}
