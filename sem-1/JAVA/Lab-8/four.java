interface EventListener{
    void performEvent();
}

interface MouseListener extends EventListener{

    void mouseClicked();
    void mousePressed();
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();
}

interface KeyListener extends EventListener{

    void keyPressed();
    void keyReleased();
}

class EventDemo implements MouseListener,KeyListener{

    public void performEvent(){
        System.out.println("Event Performed");
    }
    public void mouseClicked(){
        System.out.println("Mouse Clicked!");
    }
    public void mousePressed(){
        System.out.println("Mouse Presses!");
    }
    public void mouseReleased(){
        System.out.println("Mouse Released!");
    }
    public void mouseMoved(){
        System.out.println("Mouse Moved!");
    }
    public void mouseDragged(){
        System.out.println("Mouse Dragged!");
    }
    public void keyPressed(){
        System.out.println("Mouse Presses!");
    }
    public void keyReleased(){
        System.out.println("Mouse Released!");
    }
}

public class four {
    public static void main(String[] args) {
        EventDemo ed = new EventDemo();
        ed.performEvent();
        ed.mouseClicked();
        ed.mousePressed();
        ed.mouseReleased();
        ed.mouseMoved();
        ed.mouseDragged();
        ed.keyPressed();
        ed.mouseReleased();
    }
}
