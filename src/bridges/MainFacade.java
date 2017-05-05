package bridges;

/**
 * Created by admin on 04.05.2017.W
 */
public class MainFacade {
    public static void main(String[] args) {

        BasicSocialWeb faceBookSocialWeb = new FacebookSocialWeb();

        ExtendedSocialWeb detective=
                new ExtendedSocialWebAdapter(faceBookSocialWeb);

        System.out.println(detective.dataOfUser(1,"04.05.17",true,2));
/*        System.out.println(extendedSocialWeb.getHistory(1,"04.05.17"));
        System.out.println(extendedSocialWeb.getLikes(1, true, 2));*/


    }
}
