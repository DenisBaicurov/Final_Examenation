import java.util.InputMismatchException;
import java.util.Scanner;
public abstract class CategoryAnimals implements Animals {
    private   int choice;
    private String[]nameCategory=new String[]{"домашние животные","вьючные животные"};
    public String getCategory(String []nameCategory){
        System.out.println("Выберите категорию,к которой будет принадлежать животное");
        System.out.println("Для выбора животного из категории домашние животные нажмите цифру от 0 до 4");
        System.out.println("Для выбора животного из категории вьючные животные нажмите цифру от 5 до 9");
        Scanner scanner=new Scanner(System.in);
      try
        {  choice=scanner.nextInt();}
       catch (InputMismatchException e){
           System.err.println("Неверный ввод , пожалуйста повторите");
           getCategory(nameCategory);
       }
      if (choice<0||choice>9){
          System.out.println("Число вышло из диапазона, пожалуйста повторите ввод");
          getCategory(nameCategory);
      }
      
      if (choice>-1&&choice<5){return nameCategory[0];}
      
         return nameCategory[1];
         
    }

    public String [] kindOfAnimals(){
        String [] Pets=new String[]{"собака","кошка","хомяк"};
        String []PackAnimals=new String[]{"лошадь","верблюд","осёл"};
       String category=getCategory(nameCategory);
              System.out.println(category);
       if (category==nameCategory[0]){return Pets;}
       
       return PackAnimals;
          }

          public String kindOfAnimal(){
            int n=1;
              String[]kindAnimal=kindOfAnimals();
            
                System.out.println("Выберите вид животного");
            for (int i=0;i<kindAnimal.length;i++){
                System.out.println(n+"."+" "+kindAnimal[i]);
            n++;
            }
                System.out.println("Введите нужную цифру от 1 до 3");
            
            Scanner scanner=new Scanner(System.in);
            try {
                choice=scanner.nextInt();
            }
            catch (InputMismatchException e){
                System.err.println("Неверный ввод");
                kindOfAnimal();
            }
            if (choice<1||choice>3){
                System.out.println("Ваше число выходит за пределы выбора, повторите ввод");
                kindOfAnimal();
            }
           
            return kindAnimal[choice -1];
            }
    

    
}
