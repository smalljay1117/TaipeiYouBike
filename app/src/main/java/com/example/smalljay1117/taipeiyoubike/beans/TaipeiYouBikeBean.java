package com.example.smalljay1117.taipeiyoubike.beans;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TaipeiYouBikeBean {

    /**
     * offset : 0
     * limit : 10000
     * count : 408
     * sort :
     * results : [{"_id":"1","iid":"339","sv":"0","sd":"20000101000000","vtyp":"1","sno":"0001","sna":"捷運市政府站(3號出口)","sip":"10.7.0.11","tot":"180","sbi":"0","sarea":"信義區","mday":"20151012003926","lat":"25.0408578889","lng":"121.567904444","ar":"忠孝東路/松仁路(東南側)","sareaen":"Xinyi Dist.","snaen":"MRT Taipei City Hall Stataion(Exit 3)-2","aren":"The S.W. side of Road Zhongxiao East Road & Road Chung Yan.","nbcnt":"0","bemp":"0","act":"0"}]
     */

    private ResultBean result;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        private int offset;
        private int limit;
        private int count;
        private String sort;
        /**
         * _id : 1
         * iid : 339
         * sv : 0
         * sd : 20000101000000
         * vtyp : 1
         * sno : 0001
         * sna : 捷運市政府站(3號出口)
         * sip : 10.7.0.11
         * tot : 180
         * sbi : 0
         * sarea : 信義區
         * mday : 20151012003926
         * lat : 25.0408578889
         * lng : 121.567904444
         * ar : 忠孝東路/松仁路(東南側)
         * sareaen : Xinyi Dist.
         * snaen : MRT Taipei City Hall Stataion(Exit 3)-2
         * aren : The S.W. side of Road Zhongxiao East Road & Road Chung Yan.
         * nbcnt : 0
         * bemp : 0
         * act : 0
         */

        @SerializedName("results")
        private List<ResultsBean> youbikes;

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public String getSort() {
            return sort;
        }

        public void setSort(String sort) {
            this.sort = sort;
        }

        public List<ResultsBean> getYoubikes() {
            return youbikes;
        }

        public void setYoubikes(List<ResultsBean> youbikes) {
            this.youbikes = youbikes;
        }

        public static class ResultsBean {
            private String sna;
            private String tot;
            private String sbi;
            private String sarea;
            private double lat;
            private double lng;
            private String ar;
            private String bemp;

            public String getSna() {
                return sna;
            }

            public void setSna(String sna) {
                this.sna = sna;
            }

            public String getTot() {
                return tot;
            }

            public void setTot(String tot) {
                this.tot = tot;
            }

            public String getSbi() {
                return sbi;
            }

            public void setSbi(String sbi) {
                this.sbi = sbi;
            }

            public String getSarea() {
                return sarea;
            }

            public void setSarea(String sarea) {
                this.sarea = sarea;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public String getAr() {
                return ar;
            }

            public void setAr(String ar) {
                this.ar = ar;
            }

            public String getBemp() {
                return bemp;
            }

            public void setBemp(String bemp) {
                this.bemp = bemp;
            }
        }
    }
}
