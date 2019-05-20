package com.projetobrq.activities;



import com.projetobrq.model.Notice;

import java.util.ArrayList;


public interface MainContract {

    interface presenter{

        void onDestroy();
        void onRefreshButtonClick();
        void requestDataFromServer();

    }

    interface MainView {

        void showProgress();
        void hideProgress();
        void setDataToRecyclerView(ArrayList<Notice> noticeArrayList);
        void onResponseFailure(Throwable throwable);

    }

    interface GetNoticeIntractor {

        interface OnFinishedListener {
            void onFinished(ArrayList<Notice> noticeArrayList);
            void onFailure(Throwable t);
        }

        void getNoticeArrayList(OnFinishedListener onFinishedListener);
    }
}
