import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
	GUI gui;
	
	public KeyHandler(GUI gui) {
		this.gui = gui;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.isControlDown() && e.getKeyCode()==KeyEvent.VK_S) {
			gui.file.save();
		}
		
		if(e.isShiftDown() && e.isControlDown() && e.getKeyCode()==KeyEvent.VK_S) {
			gui.file.saveAs();
		}
		if(e.isControlDown() && e.getKeyCode()==KeyEvent.VK_O) {
			gui.file.open();
		}
		if(e.isAltDown() && e.getKeyCode()==KeyEvent.VK_F) {
			gui.menuFile.doClick();
		}
		if(e.isAltDown() && e.getKeyCode()==KeyEvent.VK_E) {
			gui.menuEdit.doClick();
		}
		if(e.isAltDown() && e.getKeyCode()==KeyEvent.VK_C) {
			gui.menuColor.doClick();
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
