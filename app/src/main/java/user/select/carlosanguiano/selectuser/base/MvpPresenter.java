package user.select.carlosanguiano.selectuser.base;/** * Created by Carlos Anguiano on 4/4/18. * For more info contact: c.joseanguiano@gmail.com */public interface MvpPresenter<V extends MvpView> {    void onAttach(V mvpView);}