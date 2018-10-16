package com.Dessertion.src;

import javax.swing.JFrame;

public class Core extends JFrame implements Runnable{
	private Thread thread;
	private static final int WIDTH = 800, HEIGHT = 600;
	public boolean isRunning;
	
    public Core() {
    	thread = new Thread(this);
    	setResizable(false);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setSize(WIDTH,HEIGHT);
    	setTitle("Test Game");
    	setVisible(true);
    }
    
    private synchronized void start() {
    	
    }
    
    public synchronized void stop() {
    	
    }
    
    public void run() {
    	
    }
    
    public int getFrameWidth() {
    	return WIDTH;
    }
    
    public int getFrameHeight() {
    	return HEIGHT;
    }
    
    public static void main(String[] args) {
    	
    }

}