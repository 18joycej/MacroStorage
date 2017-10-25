package core;

import graphics.GUI;

public class CoreLoop implements Runnable {

	protected GUI display;
	private boolean running;
	private Thread thread;
	
	public CoreLoop(int width, int length) {
		display = new GUI(width, length);
		running = false;
	}

	public void init() {
	}

	public void tick() {
		
	}

	public void run() {
		init();
		while(running) {
			tick();
			display.render();
		}
		stop();
	}
	
	public synchronized void start() {
		if(running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop() {
		if(!running)
			return;
		running = false;
		try {
			thread.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
