
public class Main {

	public static void main(String[] args) {
		MusicPlayer music = new Computer();
		VideoPlayer video = new Smarthpone();
		runVideo(video);
		runMusic(music);
	}
	
	public static void runVideo(VideoPlayer videoPlayer) {
		videoPlayer.playVideo();
	}
	
	public static void runMusic(MusicPlayer musicPlayer) {
		musicPlayer.playMusic();
	}

}
