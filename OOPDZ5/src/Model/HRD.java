package Model;
import View.View;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class HRD {
    private ArrayList<People> candidateList;

    public HRD() {
        this.candidateList = new ArrayList<People>();
    }

    public void addCandidate(){
        String name = View.inputString("Введите имя кандидата: ");
        int age = View.inputInt("Введите возраст кандидата: ");
        People people = new People(name, age);
        this.candidateList.add(people);
    }

    public void loadCandidate(){
        try(BufferedReader br = new BufferedReader(new FileReader("src/Data/candidate.txt")))
        {
            String file;
            while((file=br.readLine())!=null){
                String [] candid = file.split(" ");
                if (candid.length == 2) {
                    People people = new People(candid[0], Integer.parseInt(candid[1]));
                    this.candidateList.add(people);
                }
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<People> getCandidates(){
        return this.candidateList;
    }
}
