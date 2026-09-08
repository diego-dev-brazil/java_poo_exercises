
public class Computer implements VideoPlayer, MusicPlayer{

	@Override
	public void playVideo() {
		System.out.println("Computador reproduzindo video");		
	}

	@Override
	public void pauseVIdeo() {
		System.out.println("Computador pausando video");				
	}

	@Override
	public void stopVideo() {
		System.out.println("Computador parando video");		
	}

	@Override
	public void playMusic() {
		System.out.println("Computador Tocando musica");		
	}

	@Override
	public void pauseMusic() {
		System.out.println("Computador Pausando musica");
	}

	@Override
	public void stopMusic() {
		System.out.println("Computador Parando musica");		
	}
	
}
