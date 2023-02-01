package edu.escuelaing.arem.ASE.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Compara la respuesta de la pagina con la que arroja la API
     */
    public void testAppAPI(){
        HashMap<String, String> answers = new HashMap<>();
        answers.put("Avengers: Endgame","{\"Title\":\"Avengers: Endgame\",\"Year\":\"2019\",\"Rated\":\"PG-13\",\"Released\":\"26 Apr 2019\",\"Runtime\":\"181 min\",\"Genre\":\"Action, Adventure, Drama\",\"Director\":\"Anthony Russo, Joe Russo\",\"Writer\":\"Christopher Markus, Stephen McFeely, Stan Lee\",\"Actors\":\"Robert Downey Jr., Chris Evans, Mark Ruffalo\",\"Plot\":\"After the devastating events of Avengers: Infinity War (2018), the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.\",\"Language\":\"English, Japanese, Xhosa, German\",\"Country\":\"United States\",\"Awards\":\"Nominated for 1 Oscar. 70 wins & 132 nominations total\",\"Poster\":\"https://m.media-amazon.com/images/M/MV5BMTc5MDE2ODcwNV5BMl5BanBnXkFtZTgwMzI2NzQ2NzM@._V1_SX300.jpg\",\"Ratings\":[{\"Source\":\"Internet Movie Database\",\"Value\":\"8.4/10\"},{\"Source\":\"Rotten Tomatoes\",\"Value\":\"94%\"},{\"Source\":\"Metacritic\",\"Value\":\"78/100\"}],\"Metascore\":\"78\",\"imdbRating\":\"8.4\",\"imdbVotes\":\"1,141,629\",\"imdbID\":\"tt4154796\",\"Type\":\"movie\",\"DVD\":\"30 Jul 2019\",\"BoxOffice\":\"$858,373,000\",\"Production\":\"N/A\",\"Website\":\"N/A\",\"Response\":\"True\"}");
        answers.put("Jhon","{\"Title\":\"Jhon en Martian\",\"Year\":\"2019\",\"Rated\":\"N/A\",\"Released\":\"22 Jun 2019\",\"Runtime\":\"N/A\",\"Genre\":\"Comedy, Romance, Sci-Fi\",\"Director\":\"N/A\",\"Writer\":\"Joma Labayen\",\"Actors\":\"Pepe Herrera, Arci Muñoz, Rufa Mae Quinto\",\"Plot\":\"Jhon (Pepe Herrera), the human representation of bad luck, is sent by his narcissistic boss Nestor on his last delivery errand before flying to Malaysia. Jhon is resetting his life; he wants to start anew abroad. But as luck would...\",\"Language\":\"Tagalog, Filipino\",\"Country\":\"Philippines\",\"Awards\":\"N/A\",\"Poster\":\"https://m.media-amazon.com/images/M/MV5BYTI3YTdlZjUtMjcyZi00ODYyLWE2MWEtYzM0MDI5N2UxMTJiXkEyXkFqcGdeQXVyNTI5NjIyMw@@._V1_SX300.jpg\",\"Ratings\":[],\"Metascore\":\"N/A\",\"imdbRating\":\"N/A\",\"imdbVotes\":\"N/A\",\"imdbID\":\"tt10161712\",\"Type\":\"series\",\"totalSeasons\":\"1\",\"Response\":\"True\"}");
        answers.put("Guardians of the Galaxy","{\"Title\":\"Guardians of the Galaxy\",\"Year\":\"2014\",\"Rated\":\"PG-13\",\"Released\":\"01 Aug 2014\",\"Runtime\":\"121 min\",\"Genre\":\"Action, Adventure, Comedy\",\"Director\":\"James Gunn\",\"Writer\":\"James Gunn, Nicole Perlman, Dan Abnett\",\"Actors\":\"Chris Pratt, Vin Diesel, Bradley Cooper\",\"Plot\":\"A group of intergalactic criminals must pull together to stop a fanatical warrior with plans to purge the universe.\",\"Language\":\"English\",\"Country\":\"United States\",\"Awards\":\"Nominated for 2 Oscars. 52 wins & 102 nominations total\",\"Poster\":\"https://m.media-amazon.com/images/M/MV5BZTkwZjU3MTctMGExMi00YjU5LTgwMDMtOWNkZDRlZjQ4NmZhXkEyXkFqcGdeQXVyNjAwNDUxODI@._V1_SX300.jpg\",\"Ratings\":[{\"Source\":\"Internet Movie Database\",\"Value\":\"8.0/10\"},{\"Source\":\"Rotten Tomatoes\",\"Value\":\"92%\"},{\"Source\":\"Metacritic\",\"Value\":\"76/100\"}],\"Metascore\":\"76\",\"imdbRating\":\"8.0\",\"imdbVotes\":\"1,187,126\",\"imdbID\":\"tt2015381\",\"Type\":\"movie\",\"DVD\":\"09 Dec 2014\",\"BoxOffice\":\"$333,718,600\",\"Production\":\"N/A\",\"Website\":\"N/A\",\"Response\":\"True\"}");
        answers.put("Thor","{\"Title\":\"Thor\",\"Year\":\"2011\",\"Rated\":\"PG-13\",\"Released\":\"06 May 2011\",\"Runtime\":\"115 min\",\"Genre\":\"Action, Fantasy\",\"Director\":\"Kenneth Branagh\",\"Writer\":\"Ashley Miller, Zack Stentz, Don Payne\",\"Actors\":\"Chris Hemsworth, Anthony Hopkins, Natalie Portman\",\"Plot\":\"The powerful but arrogant god Thor is cast out of Asgard to live amongst humans in Midgard (Earth), where he soon becomes one of their finest defenders.\",\"Language\":\"English\",\"Country\":\"United States\",\"Awards\":\"5 wins & 30 nominations\",\"Poster\":\"https://m.media-amazon.com/images/M/MV5BOGE4NzU1YTAtNzA3Mi00ZTA2LTg2YmYtMDJmMThiMjlkYjg2XkEyXkFqcGdeQXVyNTgzMDMzMTg@._V1_SX300.jpg\",\"Ratings\":[{\"Source\":\"Internet Movie Database\",\"Value\":\"7.0/10\"},{\"Source\":\"Rotten Tomatoes\",\"Value\":\"77%\"},{\"Source\":\"Metacritic\",\"Value\":\"57/100\"}],\"Metascore\":\"57\",\"imdbRating\":\"7.0\",\"imdbVotes\":\"855,477\",\"imdbID\":\"tt0800369\",\"Type\":\"movie\",\"DVD\":\"13 Sep 2011\",\"BoxOffice\":\"$181,030,624\",\"Production\":\"N/A\",\"Website\":\"N/A\",\"Response\":\"True\"}");
        answers.put("Alo","{\"Title\":\"Alo\",\"Year\":\"2003\",\"Rated\":\"N/A\",\"Released\":\"28 Nov 2003\",\"Runtime\":\"N/A\",\"Genre\":\"Family\",\"Director\":\"Tarun Majumdar\",\"Writer\":\"Bibhutibhushan Bandyopadhyay, Tarun Majumdar\",\"Actors\":\"Rituparna Sengupta, Kunal Mitra, Roy Angana\",\"Plot\":\"The true love between a couple living in a village.\",\"Language\":\"Bengali\",\"Country\":\"India\",\"Awards\":\"N/A\",\"Poster\":\"https://m.media-amazon.com/images/M/MV5BNGJhZDA3MTQtZWFhNy00YzUyLTkyYTYtN2RiNzBkMDEyNDc3XkEyXkFqcGdeQXVyNjA3OTI5MjA@._V1_SX300.jpg\",\"Ratings\":[{\"Source\":\"Internet Movie Database\",\"Value\":\"8.1/10\"}],\"Metascore\":\"N/A\",\"imdbRating\":\"8.1\",\"imdbVotes\":\"151\",\"imdbID\":\"tt0390831\",\"Type\":\"movie\",\"DVD\":\"N/A\",\"BoxOffice\":\"N/A\",\"Production\":\"N/A\",\"Website\":\"N/A\",\"Response\":\"True\"}");
        ArrayList<ThreadsTest> threadTests = new ArrayList<>();
        threadTests.add(new ThreadsTest("Avengers: Endgame"));
        threadTests.add(new ThreadsTest("Jhon"));
        threadTests.add(new ThreadsTest("Guardians of the Galaxy"));
        threadTests.add(new ThreadsTest("Thor"));
        threadTests.add(new ThreadsTest("Alo"));

        for(ThreadsTest threadTest: threadTests){
            threadTest.run();
        }
        for(ThreadsTest threadsTest: threadTests){
            try {
                threadsTest.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        for(ThreadsTest threadTest: threadTests){
            assertEquals(answers.get(threadTest.getTitle()), threadTest.getAnswer());
        }
    }

    /**
     * Compara el tamaño del cache al consultarsen varias peliculas, para ver que no se dupliquen
     */
    public void testAppAPICache(){
        Cache.movies.clear();
        ArrayList<ThreadsTest> threadTests = new ArrayList<>();
        threadTests.add(new ThreadsTest("Avengers: Endgame"));
        threadTests.add(new ThreadsTest("Avengers: Endgame"));
        threadTests.add(new ThreadsTest("Guardians of the Galaxy"));
        threadTests.add(new ThreadsTest("Avengers: Endgame"));
        threadTests.add(new ThreadsTest("Guardians of the Galaxy"));

        for(ThreadsTest threadTest: threadTests){
            threadTest.run();
        }
        for(ThreadsTest threadsTest: threadTests){
            try {
                threadsTest.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        assertEquals(2,Cache.movies.size());

    }
}
