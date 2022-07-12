package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.DataBase;
import javax.swing.JOptionPane;
import modelo.modelo;
import vista.view1;
import vista.view2;
import vista.view3;
import vista.view4;

public class controlador implements ActionListener{

    modelo model;
    view1 menu;
    view2 newStudent;
    view3 searchStudent;
    view4 modifyStudent;
    DataBase db;
    
    public controlador(){ //Constructor
        this.menu = new view1();
        this.newStudent = new view2();
        this.searchStudent = new view3();
        this.modifyStudent = new view4();
        this.db = new DataBase();
        menu.getBtn_new().addActionListener(this);
        menu.getBtn_search().addActionListener(this);
        menu.getBtn_exit().addActionListener(this);
        menu.getBtn_modify().addActionListener(this);
        menu.getBtn_delete().addActionListener(this);
        newStudent.getBtn_save().addActionListener(this);
        newStudent.getBtn_cancel().addActionListener(this);
        searchStudent.getBtn_search().addActionListener(this);
        searchStudent.getBtn_cancel().addActionListener(this);
        modifyStudent.getBtn_cancelar().addActionListener(this);
        modifyStudent.getBtn_buscar().addActionListener(this);
        modifyStudent.getBtn_modificar().addActionListener(this);
        
    }

    public void iniciar(){
        menu.setVisible(true);   
    }
        
    @Override
    //activate the form buttons
    public void actionPerformed(ActionEvent e) {
        //Main view buttons
        
        //new studet
        if(e.getSource()==menu.getBtn_new()){
            //JOptionPane.showMessageDialog(menu, "This button is working", "new student window", 1);
            menu.dispose();
            newStudent.setVisible(true);
        }
        //search student
        if(e.getSource()==menu.getBtn_search()){
            menu.dispose();
            searchStudent.setVisible(true);
        }
        
        //exit program
        if(e.getSource()==menu.getBtn_exit()){
            System.exit(0);
        }
        
        //modify student
        if(e.getSource()==menu.getBtn_modify()){
            menu.dispose();
            modifyStudent.setVisible(true);
        }
        
        //delete student record
        if(e.getSource()==menu.getBtn_delete()){
            String idDelete=JOptionPane.showInputDialog(menu,"Enter the ID to delete","Delete record",2);
            delete(idDelete);
        }
            
        //New student Buttons
        
        //save record
        if(e.getSource()==newStudent.getBtn_save()){
            save();
        }
        
        //search student buttons
        if(e.getSource()==searchStudent.getBtn_search()){
            searchStudent();
        }
        
        //modify student buttons
        if(e.getSource()==modifyStudent.getBtn_buscar()){
            modSearchStudent();
        }
        
        if(e.getSource()==modifyStudent.getBtn_modificar()){
            modifyStudent();
        }
        
        //Common buttons for all views
        if(e.getSource()==newStudent.getBtn_cancel()){
            newStudent.dispose();
            menu.setVisible(true);
        }
        
        if(e.getSource()==searchStudent.getBtn_cancel()){
            searchStudent.dispose();
            menu.setVisible(true);
        }
        
        if(e.getSource()==modifyStudent.getBtn_cancelar()){
            modifyStudent.dispose();
            menu.setVisible(true);
        }
    }
    
    public void save(){
    
        String id=newStudent.getTxt_id().getText();
        String name=newStudent.getTxt_name().getText();
        String last_name=newStudent.getTxt_lastName().getText();
        String email=newStudent.getTxt_email().getText();
        String program=newStudent.getTxt_program().getText();
        String phone=newStudent.getTxt_phone().getText();
        modelo newStudent=new modelo(id, name, last_name, email, phone, program);
        db.saveStudent(newStudent);
        JOptionPane.showMessageDialog(this.newStudent, "Success!", "The student information was saved", 1);
        this.newStudent.getTxt_name().setText(null);
        
    }
    
    public void searchStudent(){
        String id = searchStudent.getTxt_id().getText();
        modelo result=db.searchStudent(id);
        searchStudent.getTxt_name().setText(result.getName());
        searchStudent.getTxt_lastName().setText(result.getLast_name());
        searchStudent.getTxt_email().setText(result.getEmail());
        searchStudent.getTxt_phone().setText(result.getPhone());
        searchStudent.getTxt_program().setText(result.getProgram());
    }
    
    public void modSearchStudent(){
        String id = modifyStudent.getTxt_cedula().getText();
        modelo result=db.searchStudent(id);
        modifyStudent.getTxt_nombre().setText(result.getName());
        modifyStudent.getTxt_apellido().setText(result.getLast_name());
        modifyStudent.getTxt_correo().setText(result.getEmail());
        modifyStudent.getTxt_telefono().setText(result.getPhone());
        modifyStudent.getTxt_programa().setText(result.getProgram());
    }
    
    public void modifyStudent(){
        
        String id=modifyStudent.getTxt_cedula().getText();
        String name=modifyStudent.getTxt_nombre().getText();
        String last_name=modifyStudent.getTxt_apellido().getText();
        String email=modifyStudent.getTxt_correo().getText();
        String program=modifyStudent.getTxt_programa().getText();
        String phone=modifyStudent.getTxt_telefono().getText();
        if("".equals(name)||"".equals(last_name)||"".equals(id)||"".equals(phone)||"".equals(email)||"".equals(program)){
            JOptionPane.showMessageDialog(modifyStudent, "Warning", "Empty spaces are not allowed", 0);
        }
        else{
            modelo updateStudent=new modelo(id, name, last_name, email, phone, program);
            db.modifyStudent(id, updateStudent);
            JOptionPane.showMessageDialog(modifyStudent, "Sucess", "Student record was modified", 1);
        }
    }
    
    public void delete(String id){
        modelo resultado=db.searchStudent(id);
        if(resultado!=null){
            db.eliminar(id);
            JOptionPane.showMessageDialog(menu, "Record deleted successfully", "Confirmation", 1);
        }
    }
}
