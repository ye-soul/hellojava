package ch08.sec03;

public interface RemoteControl {
	//상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void powerOn();
	void volumn(boolean b);
	void channel (boolean b);
	void channel (int c);
}

