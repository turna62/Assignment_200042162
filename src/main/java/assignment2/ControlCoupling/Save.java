package ControlCoupling;

public class Save {
    String data;

    private String saveToDatabase(){
        return "Saved to database";
    }

    private String saveToFile(){
        return "Saved to file";
    }

    public void saveData(int flag){
        if(flag == 1){
            System.out.println(saveToDatabase());
        }
        else {
            System.out.println(saveToFile());
        }
    }

    public static void main(String[] args) {
        Save save = new Save();
        save.saveData(1);
        save.saveData(0);
    }
}
