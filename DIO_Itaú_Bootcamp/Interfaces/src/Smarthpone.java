
public class Smarthpone implements VideoPlayer, MusicPlayer{

	@Override
	public void playVideo() {
		System.out.println("Smarthpone reproduzindo video");		
	}

	@Override
	public void pauseVIdeo() {
		System.out.println("Smarthpone pausando video");				
	}

	@Override
	public void stopVideo() {
		System.out.println("Smarthpone parando video");		
	}

	@Override
	public void playMusic() {
		System.out.println("Smarthpone Tocando musica");		
	}

	@Override
	public void pauseMusic() {
		System.out.println("Smarthpone Pausando musica");
	}

	@Override
	public void stopMusic() {
		System.out.println("Smarthpone Parando musica");		
	}
	
}
