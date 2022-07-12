package modelo;

import java.util.ArrayList;

public class DataBase {
    
    private ArrayList<modelo> studentList; //one single attribute

    public DataBase() {
        this.studentList=new ArrayList();  //new empty list
    }
    
    public void saveStudent(modelo student){
    
        this.studentList.add(student);
        System.out.println("New student saved!");
    }
    
    public modelo searchStudent(String id){
        modelo result=null; //Default result
        for(int i=0;i<this.studentList.size();i++){
            if(this.studentList.get(i).getId().equals(id)){
                System.out.println("Student found!");
                result=this.studentList.get(i);
            }
        }
        
        return result;
    }
    
    public void modifyStudent(String id, modelo student){
        for(int i=0;i<this.studentList.size();i++){
            if(this.studentList.get(i).getId().equals(id)){
                this.studentList.get(i).setName(student.getName());
                this.studentList.get(i).setLast_name(student.getLast_name());
                this.studentList.get(i).setEmail(student.getEmail());
                this.studentList.get(i).setProgram(student.getProgram());
                this.studentList.get(i).setPhone(student.getPhone());
            }
        }
    }
    
    public void eliminar(String id){
        for(int i=0;i<this.studentList.size();i++){
            if(this.studentList.get(i).getId().equals(id)){ 
                this.studentList.remove(i);
            }
        }
    }
    
}
