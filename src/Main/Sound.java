package main;
/*
import java.io.FileInputStream;
import java.net.URL;

import sun.audio.AudioData;
import sun.audio.AudioDataStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

@SuppressWarnings("all")
public class Sound implements java.applet.AudioClip {

	private AudioData audiodata;
	private AudioDataStream audiostream;
	private ContinuousAudioDataStream continuousaudiostream;

	static int length;

	public Sound(URL url) throws java.io.IOException {
		audiodata = new AudioStream(url.openStream()).getData();
		audiostream = null;
		continuousaudiostream = null;
	}

	public Sound(String soundtrack) throws java.io.IOException {
		FileInputStream fis = new FileInputStream(soundtrack);
		AudioStream audioStream = new AudioStream(fis);
		audiodata = audioStream.getData();
		audiostream = null;
		continuousaudiostream = null;
	}

	public void play() {
		audiostream = new AudioDataStream(audiodata);
		AudioPlayer.player.start(audiostream);
	}

	public void loop() {
		continuousaudiostream = new ContinuousAudioDataStream(audiodata);
		AudioPlayer.player.start(continuousaudiostream);
	}

	public void stop() {
		if (audiostream != null)
			AudioPlayer.player.stop(audiostream);
		if (continuousaudiostream != null)
			AudioPlayer.player.stop(continuousaudiostream);
	}

	public static void main(String args[]) throws Exception {
		URL url1 = new URL("/Music/soundtrack.wav");
		Sound soundtrack = new Sound(url1);
		soundtrack.play();
		soundtrack.loop();
		try { // Delay for loop
			Thread.sleep(0);
		} catch (InterruptedException ie) {
		}
		soundtrack.stop();
	}
}

/*
 * import sun.audio.*; import java.io.*;
 * 
 * public class Sound {
 * 
 * public static void music() { AudioPlayer player = AudioPlayer.player;
 * AudioStream stream; AudioData data; ContinuousAudioDataStream loop = null;
 * 
 * try { stream = new AudioStream( new FileInputStream(
 * "C:/Users/Eman/workspace/2D_Platformer/Resources/Music/soundtrack.wav"));
 * data = stream.getData(); loop = new ContinuousAudioDataStream(data); } catch
 * (Exception e) { e.printStackTrace(); } player.start(loop); } }
 */