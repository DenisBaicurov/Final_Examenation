
import java.io.*;
import java.util.ArrayList;

public class GetFiletxt {

    public void GetFile(ArrayList<ArrayList<String>>AnimalsList){

        File file =new File("Animals.txt");
    
    
    
        try
        {
            FileWriter writer = new FileWriter(file,true);
            if(file.length()!=0){writer.write("\n");}
     for (int i=0;i<AnimalsList.size();i++){
      for (int j=0;j<AnimalsList.get(i).size();j++){
          writer.write(AnimalsList.get(i).get(j)+"  ");
    
      }
    
    
     }
            writer.close();
    
    
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    
    }

    
}
