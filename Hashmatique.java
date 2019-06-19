package hashmatique;
import java.util.HashMap;
import java.util.Set;

public class Hashmatique {

	public static void main(String[] args) {
		// TODO Create at least 4 tracks (key) attached with sample lyrics (value)
		HashMap<String, String> trackList = new HashMap<String, String>();
			trackList.put("My Hero:","There goes my hero\n" + 
									"Watch him as he goes\n" + 
									"There goes my hero\n" + 
									"He's ordinary\n" +  
									"Kudos, my hero\n" + 
									"Leaving all the best\n" + 
									"You know my hero\n" + 
									"The one that's on\n");
			trackList.put("My Way:", "Yes, there were times, I'm sure you knew\n" + 
									"When I bit off more than I could chew\n" + 
									"But through it all, when there was doubt\n" + 
									"I ate it up and spit it out" + 
									"I faced it all and I stood tall and did it my way\n");
			trackList.put("My Name Is Jonas:",   "The choo-choo train left right on time\n" + 
												"A ticket costs only your mind\n" + 
												"The driver said, 'Hey man, we go all the way.'\n" + 
												"Of course we were willing to pay\n");
			trackList.put("My Favorite Things:", "When the dog bites\n" + 
												"When the bee stings\n" + 
												"When I'm feeling sad\n" + 
												"I simply remember my favorite things!\n" + 
												"And then I don't feel so bad!\n");
			trackList.put("My Paper Heart:", "Please just don't play with me\n" + 
											"My paper heart will bleed\n" + 
											"This wait for destiny won't do\n" + 
											"Be with me please I beseech you\n" + 
											"Simple things, that make you run away\n" + 
											"Catch you if I can\n");
			System.out.println("There are " + trackList.size() + " songs in this list.\n");
			System.out.println("Here is a sample from My Way by Frank Sinatra: \n" + trackList.get("My Way:"));
			trackList.remove("My Way:");
			Set<String> tracks = trackList.keySet();
			System.out.println("Here are the rest of the sample tracks:\n");
			for (String track : tracks) {
				System.out.println(track);
				System.out.println(trackList.get(track));
			}
			
	}

}
