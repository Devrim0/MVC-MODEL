/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_mvc_model;





 class Futbolcu{
private String İsim;
private int FormaNumarası;
public String getİsim(){
return İsim;
}
public void setİsim(String İsim){
this.İsim=İsim;
}
public int getFormaNumarası(){
return FormaNumarası;
}
public void setFormaNumarası(int FormaNumarası){
this.FormaNumarası=FormaNumarası;
}
}
//Şimdi tasarımıza geçelim.
class View{
public void FutbolcuDetayı(String İsim, int FormaNumarası){
System.out.println("Futbolcu: ");
System.out.println("İsim: " + İsim);
System.out.println("Forma Numarası: " + FormaNumarası);
}
}
class Controller {
private Futbolcu model;
private View view;
public Controller(Futbolcu model, View view) {
this.model = model;
this.view = view;
}
public void setFutbolcuName(String İsim) {
model.setİsim(İsim);
}
public String getFutbolcuName() {
return model.getİsim();
}
public void setFormaNumarası(int FormaNumarası) {
model.setFormaNumarası(FormaNumarası);
}
public int getFormaNumarası() {
return model.getFormaNumarası();
}
public void updateView() {
//view.FutbolcuDetayı((model.getİsim(), model.getFormaNumarası());

}
}
public class MVC{
public static void main(String[] args) {
Futbolcu model = retriveFutbolcuFromDatabase();
   
View view = new View();
Controller controller = new Controller(model, view); controller.updateView();
//controller.setİsim("NEYMAR JUNİOR");
//controller.updateView()
        System.out.print(model.getİsim()+" ");
        System.out.print(model.getFormaNumarası()+" ");
}
private static Futbolcu retriveFutbolcuFromDatabase() {
Futbolcu futbolcu= new Futbolcu();
futbolcu.setİsim("NEYMAR JR");
futbolcu.setFormaNumarası(11);
futbolcu.setİsim("WESLEY SNEIJDER");
futbolcu.setFormaNumarası(10);
return futbolcu;
}


/**
 *
 * @author Devrim
 */

}