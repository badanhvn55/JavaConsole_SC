/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaconsole.controller;

import java.util.Scanner;

public class MenuConsole {

    
    
    
    public static void main(String[] args) {
        while(true){
        
        System.out.println("=====Student Menager=====");
        System.out.println("1. Student list.");
        System.out.println("2. Add student.");
        System.out.println("3. Edit student.");
        System.out.println("4. Delete student.");
        System.out.println("5. Exit.");
        System.out.println("============================");
        System.out.println("Please enter your choice: ");
        Scanner scanner=new Scanner(System.in);
        //Yêu cầu người dùng nhập chuỗi ký tự, gán giá trị người dùng nhập vào
        //Ra biến kiểu chuỗi tên là strchoice
        String strChoice=scanner.nextLine();
        System.out.println("Choice= "+strChoice);
        //Kiểm tra dữ liệu người cùng nhập vào có là số hay không?
        //Trong trường hợp không phải là số thì thông báo cho người dùng và bắt đầu lại vòng lặp
        int choice=0;
        try{
            //Ép kiểu của biến strchoice về int
            choice=Integer.parseInt(strChoice);
            System.out.println("Choice: "+ choice);
        }catch(Exception e){
            //Cần có phần lưu log ở đây
            System.err.println("Please enter a number.");
            continue;
        }
            if(choice==5){
                break;
              }else{
                switch(choice){
                    case 1: 
                        //Do something
                        System.out.println("Print list of student.");
                        break;
                    case 2: 
                        //Do something
                         System.out.println("Add new student.");
                         break;
                     case 3: 
                         //Do something
                         System.out.println("Edit student.");
                         break;
                     case 4: 
                         //Do something
                         System.out.println("Drop student");
                         break;
                     default: 
                        //Do something
                         break;
                 }
             }
        }
        
    }
    
}
