import java.util.*;

public class CreateAnimals extends CategoryAnimals{
    private String kindAnimal;
    private String name;
    private String command;
        private Calendar calendar;
        private int year;
        private int month;
        private int day;

        @Override
        public String getnane() {
            kindAnimal=kindOfAnimal();
            System.out.println("Выберете имя для животного " +kindAnimal);
            Scanner scanner=new Scanner(System.in);
            name=scanner.nextLine();
            return name;
        }
        @Override
        public ArrayList<String> getcommand() {
            boolean b = true;
            ArrayList<String> listcommand = new ArrayList<>();
            while (b == true){
                System.out.println("Введите команду, которую будет исполнять " + kindAnimal);
            Scanner scanner = new Scanner(System.in);
            command = scanner.nextLine();
            listcommand.add(command);
            System.out.println("Если хотите добавить команду жмите 0, для выхода любую другую клавишу ");
            String choice = scanner.nextLine();
    
            if (!choice.equals("0")) {
               b=false;
            }
        }
    
            return listcommand;
        }

        
        public int getYear(){
            calendar=Calendar.getInstance();
            System.out.println(kindAnimal+ " Введите год рождения ");
            Scanner scanner =new Scanner(System.in);
            try{
                year=scanner.nextInt();
    
            }catch(InputMismatchException e){
                System.err.println("Неверный ввод,повторите");
                getYear();
    
            }
            if (year> Calendar.getInstance().getWeekYear()||year< Calendar.getInstance().getWeekYear()-30){
                System.err.println("Год слишком большой или слишком маленький, повторите ввод");
                getYear();
            }
    
            return year;
        }
    
        public int getMonth(){
            System.out.println(kindAnimal+  " Введите месяц рождения от 0 до 11");
            Scanner scanner =new Scanner(System.in);
            try {
                month=scanner.nextInt();
            }
            catch (InputMismatchException e){
                System.err.println("Неверный ввод,повторите");
                getMonth();
            }
            if(month>11||month<0){
                System.err.println("Месяц слишком бльшой или маленький");
                getMonth();
            }
    
            return month;
    
        }
    
        public int getDay(){
            System.out.println(kindAnimal + " Введите день рождения от 1 до 31");
            Scanner scanner =new Scanner(System.in);
            try {
                day=scanner.nextInt();
            }
            catch (InputMismatchException e){
                System.err.println("Неверный ввод,повторите");
                getDay();
            }
            if(day>31||day<1){
                System.err.println("День слишком большой или маленький");
                getDay();
            }
    
            return day;
    
        }

        @Override
        public Date birthdate() {
    
            calendar=Calendar.getInstance();
            year=getYear();
    
            month=getMonth();
    
            day=getDay();
            calendar.set(year,month,day);
            if (calendar.getTimeInMillis()>=Calendar.getInstance().getTimeInMillis())
            {
                System.out.println(calendar.getTime());
                System.err.println("Установленная дата не должна превышать текущую или быть равной");
                birthdate();
            }
            return calendar.getTime();
        }


        ArrayList<ArrayList<String>>getArralistAnimals(){
            ArrayList<ArrayList<String>>getAnimals=new ArrayList<>();
           name=getnane();
            ArrayList<String>getcategory=new ArrayList<>();
            getcategory.add(kindAnimal);
            getAnimals.add(getcategory);
            ArrayList<String>getname=new ArrayList<>();
            getname.add(name);
            getAnimals.add(getname);
            ArrayList<String>commandAnimals=getcommand();
            getAnimals.add(commandAnimals);
            Date getbirthdateAnimals=birthdate();
           ArrayList<String>birthdateAnimals=new ArrayList<>();
           birthdateAnimals.add(getbirthdateAnimals.toString());
            getAnimals.add(birthdateAnimals);
           return getAnimals;
        }
    


    
}
