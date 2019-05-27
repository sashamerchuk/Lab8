package ua.lviv.iot.creativity.manager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;

import ua.lviv.iot.creativity.model.CreativityGood;

public class CreativityGoodWriter{
    
    private String filePath;
    
    public CreativityGoodWriter() {};
    
    public CreativityGoodWriter(String filePath) {
        this.filePath = filePath;
    }
    
    public void writeToFile(List<CreativityGood> creativityGood) {
        File cvsFile= new File(filePath + ".csv");
        
        try(FileOutputStream fos = new FileOutputStream(cvsFile);
                OutputStreamWriter ow = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
                BufferedWriter bufWrite= new BufferedWriter(ow);){
            for(CreativityGood good : creativityGood) {
                bufWrite.write(good.getHeaders());
                bufWrite.newLine();
                bufWrite.write(good.toCSV());
                bufWrite.newLine();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public String getFilePath() {
        return filePath;
    }
    
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
