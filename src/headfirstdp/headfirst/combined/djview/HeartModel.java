package headfirstdp.headfirst.combined.djview;

import java.util.*;

public class HeartModel implements HeartModelInterface, Runnable {
	private ArrayList beatObservers = new ArrayList();
	private ArrayList bpmObservers = new ArrayList();
	private int time = 1000;
    int bpm = 90;
	private Random random = new Random(System.currentTimeMillis());
	private Thread thread;

	public HeartModel() {
		thread = new Thread(this);
		thread.start();
	}

	public void run() {
		int lastrate = -1;

		for(;;) {
			int change = random.nextInt(10);
			if (random.nextInt(2) == 0) {
				change = 0 - change;
			}
			int rate = 60000/(time + change);
			if (rate < 120 && rate > 50) {
				time += change;
				notifyBeatObservers();
				if (rate != lastrate) {
					lastrate = rate;
					notifyBPMObservers();
				}
			}
			try {
				Thread.sleep(time);
			} catch (Exception ignored) {}
		}
	}
	public int getHeartRate() {
		return 60000/time;
	}

	public void registerObserver(BeatObserver o) {
		beatObservers.add(o);
	}

	public void removeObserver(BeatObserver o) {
		int i = beatObservers.indexOf(o);
		if (i >= 0) {
			beatObservers.remove(i);
		}
	}

	private void notifyBeatObservers() {
        for (Object beatObserver : beatObservers) {
            BeatObserver observer = (BeatObserver) beatObserver;
            observer.updateBeat();
        }
	}

	public void registerObserver(BPMObserver o) {
		bpmObservers.add(o);
	}

	public void removeObserver(BPMObserver o) {
		int i = bpmObservers.indexOf(o);
		if (i >= 0) {
			bpmObservers.remove(i);
		}
	}

	private void notifyBPMObservers() {
        for (Object bpmObserver : bpmObservers) {
            BPMObserver observer = (BPMObserver) bpmObserver;
            observer.updateBPM();
        }
	}
}
