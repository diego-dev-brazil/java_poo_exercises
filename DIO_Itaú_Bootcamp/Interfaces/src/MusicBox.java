
public class MusicBox implements MusicPlayer{

	@Override
	public void playMusic() {
		System.out.println("A caixa de musica Tocando musica");		
	}

	@Override
	public void pauseMusic() {
		System.out.println("A caixa de musica  Pausando musica");
	}

	@Override
	public void stopMusic() {
		System.out.println("A caixa de musica  Parando musica");		
	}
	
}
