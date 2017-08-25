package com.simple.bean;

import java.util.List;

/**
 * Created by qijie07 on 2016/11/10.
 */
public class WeatherBean {


    /**
     * reason : successed!
     * result : {"data":{"pubdate":"2016-11-21","pubtime":"11:00:00","realtime":{"city_code":"101190401","city_name":"苏州","date":"2016-11-21","time":"15:00:00","week":1,"moon":"十月廿二","dataUptime":1479713705,"weather":{"temperature":"17","humidity":"96","info":"阵雨","img":"3"},"wind":{"direct":"东北风","power":"2级","offset":null,"windspeed":null}},"life":{"date":"2016-11-21","info":{"chuanyi":["较舒适","建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"],"ganmao":["较易发","风较大，阴冷潮湿，较易发生感冒，体质较弱的朋友请注意适当防护。"],"xiche":["较不宜","较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。"],"yundong":["较适宜","天气较好，但因风力稍强，户外可选择对风力要求不高的运动，推荐您进行室内运动。"],"ziwaixian":["弱","紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"]}},"weather":[{"date":"2016-11-21","info":{"day":["3","阵雨","18","东北风","3-4 级","06:30"],"night":["3","阵雨","14","东北风","4-5 级","16:56"]},"week":"一","nongli":"十月廿二"},{"date":"2016-11-22","info":{"dawn":["3","阵雨","14","东北风","4-5 级","16:56"],"day":["7","小雨","14","北风","5-6 级","06:31"],"night":["7","小雨","6","北风","5-6 级","16:56"]},"week":"二","nongli":"十月廿三"},{"date":"2016-11-23","info":{"dawn":["7","小雨","6","北风","5-6 级","16:56"],"day":["7","小雨","6","北风","4-5 级","06:32"],"night":["1","多云","3","北风","3-4 级","16:55"]},"week":"三","nongli":"十月廿四"},{"date":"2016-11-24","info":{"dawn":["1","多云","3","北风","3-4 级","16:55"],"day":["1","多云","9","北风","3-4 级","06:32"],"night":["1","多云","4","东北风","微风","16:55"]},"week":"四","nongli":"十月廿五"},{"date":"2016-11-25","info":{"dawn":["1","多云","4","东北风","微风","16:55"],"day":["7","小雨","11","东风","3-4 级","06:33"],"night":["7","小雨","8","西北风","3-4 级","16:55"]},"week":"五","nongli":"十月廿六"}],"f3h":{"temperature":[{"jg":"20161121140000","jb":"17"},{"jg":"20161121170000","jb":"17"},{"jg":"20161121200000","jb":"16"},{"jg":"20161121230000","jb":"15"},{"jg":"20161122020000","jb":"14"},{"jg":"20161122050000","jb":"14"},{"jg":"20161122080000","jb":"14"},{"jg":"20161122110000","jb":"12"},{"jg":"20161122140000","jb":"13"}],"precipitation":[{"jg":"20161121140000","jf":"1"},{"jg":"20161121170000","jf":"0"},{"jg":"20161121200000","jf":"0"},{"jg":"20161121230000","jf":"0"},{"jg":"20161122020000","jf":"0"},{"jg":"20161122050000","jf":"0"},{"jg":"20161122080000","jf":"0.4"},{"jg":"20161122110000","jf":"0.3"},{"jg":"20161122140000","jf":"0.1"}]},"pm25":{"key":"Suzhou","show_desc":0,"pm25":{"curPm":"36","pm25":"18","pm10":"30","level":1,"quality":"优","des":"可正常活动。"},"dateTime":"2016年11月21日15时","cityName":"苏州"},"jingqu":"","jingqutq":"","date":"","isForeign":"0"}}
     * error_code : 0
     */

    private String reason;
    /**
     * data : {"pubdate":"2016-11-21","pubtime":"11:00:00","realtime":{"city_code":"101190401","city_name":"苏州","date":"2016-11-21","time":"15:00:00","week":1,"moon":"十月廿二","dataUptime":1479713705,"weather":{"temperature":"17","humidity":"96","info":"阵雨","img":"3"},"wind":{"direct":"东北风","power":"2级","offset":null,"windspeed":null}},"life":{"date":"2016-11-21","info":{"chuanyi":["较舒适","建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"],"ganmao":["较易发","风较大，阴冷潮湿，较易发生感冒，体质较弱的朋友请注意适当防护。"],"xiche":["较不宜","较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。"],"yundong":["较适宜","天气较好，但因风力稍强，户外可选择对风力要求不高的运动，推荐您进行室内运动。"],"ziwaixian":["弱","紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"]}},"weather":[{"date":"2016-11-21","info":{"day":["3","阵雨","18","东北风","3-4 级","06:30"],"night":["3","阵雨","14","东北风","4-5 级","16:56"]},"week":"一","nongli":"十月廿二"},{"date":"2016-11-22","info":{"dawn":["3","阵雨","14","东北风","4-5 级","16:56"],"day":["7","小雨","14","北风","5-6 级","06:31"],"night":["7","小雨","6","北风","5-6 级","16:56"]},"week":"二","nongli":"十月廿三"},{"date":"2016-11-23","info":{"dawn":["7","小雨","6","北风","5-6 级","16:56"],"day":["7","小雨","6","北风","4-5 级","06:32"],"night":["1","多云","3","北风","3-4 级","16:55"]},"week":"三","nongli":"十月廿四"},{"date":"2016-11-24","info":{"dawn":["1","多云","3","北风","3-4 级","16:55"],"day":["1","多云","9","北风","3-4 级","06:32"],"night":["1","多云","4","东北风","微风","16:55"]},"week":"四","nongli":"十月廿五"},{"date":"2016-11-25","info":{"dawn":["1","多云","4","东北风","微风","16:55"],"day":["7","小雨","11","东风","3-4 级","06:33"],"night":["7","小雨","8","西北风","3-4 级","16:55"]},"week":"五","nongli":"十月廿六"}],"f3h":{"temperature":[{"jg":"20161121140000","jb":"17"},{"jg":"20161121170000","jb":"17"},{"jg":"20161121200000","jb":"16"},{"jg":"20161121230000","jb":"15"},{"jg":"20161122020000","jb":"14"},{"jg":"20161122050000","jb":"14"},{"jg":"20161122080000","jb":"14"},{"jg":"20161122110000","jb":"12"},{"jg":"20161122140000","jb":"13"}],"precipitation":[{"jg":"20161121140000","jf":"1"},{"jg":"20161121170000","jf":"0"},{"jg":"20161121200000","jf":"0"},{"jg":"20161121230000","jf":"0"},{"jg":"20161122020000","jf":"0"},{"jg":"20161122050000","jf":"0"},{"jg":"20161122080000","jf":"0.4"},{"jg":"20161122110000","jf":"0.3"},{"jg":"20161122140000","jf":"0.1"}]},"pm25":{"key":"Suzhou","show_desc":0,"pm25":{"curPm":"36","pm25":"18","pm10":"30","level":1,"quality":"优","des":"可正常活动。"},"dateTime":"2016年11月21日15时","cityName":"苏州"},"jingqu":"","jingqutq":"","date":"","isForeign":"0"}
     */

    private ResultEntity result;
    private int error_code;

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setResult(ResultEntity result) {
        this.result = result;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public ResultEntity getResult() {
        return result;
    }

    public int getError_code() {
        return error_code;
    }

    public static class ResultEntity {
        /**
         * pubdate : 2016-11-21
         * pubtime : 11:00:00
         * realtime : {"city_code":"101190401","city_name":"苏州","date":"2016-11-21","time":"15:00:00","week":1,"moon":"十月廿二","dataUptime":1479713705,"weather":{"temperature":"17","humidity":"96","info":"阵雨","img":"3"},"wind":{"direct":"东北风","power":"2级","offset":null,"windspeed":null}}
         * life : {"date":"2016-11-21","info":{"chuanyi":["较舒适","建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"],"ganmao":["较易发","风较大，阴冷潮湿，较易发生感冒，体质较弱的朋友请注意适当防护。"],"xiche":["较不宜","较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。"],"yundong":["较适宜","天气较好，但因风力稍强，户外可选择对风力要求不高的运动，推荐您进行室内运动。"],"ziwaixian":["弱","紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"]}}
         * weather : [{"date":"2016-11-21","info":{"day":["3","阵雨","18","东北风","3-4 级","06:30"],"night":["3","阵雨","14","东北风","4-5 级","16:56"]},"week":"一","nongli":"十月廿二"},{"date":"2016-11-22","info":{"dawn":["3","阵雨","14","东北风","4-5 级","16:56"],"day":["7","小雨","14","北风","5-6 级","06:31"],"night":["7","小雨","6","北风","5-6 级","16:56"]},"week":"二","nongli":"十月廿三"},{"date":"2016-11-23","info":{"dawn":["7","小雨","6","北风","5-6 级","16:56"],"day":["7","小雨","6","北风","4-5 级","06:32"],"night":["1","多云","3","北风","3-4 级","16:55"]},"week":"三","nongli":"十月廿四"},{"date":"2016-11-24","info":{"dawn":["1","多云","3","北风","3-4 级","16:55"],"day":["1","多云","9","北风","3-4 级","06:32"],"night":["1","多云","4","东北风","微风","16:55"]},"week":"四","nongli":"十月廿五"},{"date":"2016-11-25","info":{"dawn":["1","多云","4","东北风","微风","16:55"],"day":["7","小雨","11","东风","3-4 级","06:33"],"night":["7","小雨","8","西北风","3-4 级","16:55"]},"week":"五","nongli":"十月廿六"}]
         * f3h : {"temperature":[{"jg":"20161121140000","jb":"17"},{"jg":"20161121170000","jb":"17"},{"jg":"20161121200000","jb":"16"},{"jg":"20161121230000","jb":"15"},{"jg":"20161122020000","jb":"14"},{"jg":"20161122050000","jb":"14"},{"jg":"20161122080000","jb":"14"},{"jg":"20161122110000","jb":"12"},{"jg":"20161122140000","jb":"13"}],"precipitation":[{"jg":"20161121140000","jf":"1"},{"jg":"20161121170000","jf":"0"},{"jg":"20161121200000","jf":"0"},{"jg":"20161121230000","jf":"0"},{"jg":"20161122020000","jf":"0"},{"jg":"20161122050000","jf":"0"},{"jg":"20161122080000","jf":"0.4"},{"jg":"20161122110000","jf":"0.3"},{"jg":"20161122140000","jf":"0.1"}]}
         * pm25 : {"key":"Suzhou","show_desc":0,"pm25":{"curPm":"36","pm25":"18","pm10":"30","level":1,"quality":"优","des":"可正常活动。"},"dateTime":"2016年11月21日15时","cityName":"苏州"}
         * jingqu :
         * jingqutq :
         * date :
         * isForeign : 0
         */

        private DataEntity data;

        public void setData(DataEntity data) {
            this.data = data;
        }

        public DataEntity getData() {
            return data;
        }

        public static class DataEntity {
            private String pubdate;
            private String pubtime;
            /**
             * city_code : 101190401
             * city_name : 苏州
             * date : 2016-11-21
             * time : 15:00:00
             * week : 1
             * moon : 十月廿二
             * dataUptime : 1479713705
             * weather : {"temperature":"17","humidity":"96","info":"阵雨","img":"3"}
             * wind : {"direct":"东北风","power":"2级","offset":null,"windspeed":null}
             */

            private RealtimeEntity realtime;
            /**
             * date : 2016-11-21
             * info : {"chuanyi":["较舒适","建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"],"ganmao":["较易发","风较大，阴冷潮湿，较易发生感冒，体质较弱的朋友请注意适当防护。"],"xiche":["较不宜","较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。"],"yundong":["较适宜","天气较好，但因风力稍强，户外可选择对风力要求不高的运动，推荐您进行室内运动。"],"ziwaixian":["弱","紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"]}
             */

            private LifeEntity life;
            private F3hEntity f3h;
            /**
             * key : Suzhou
             * show_desc : 0
             * pm25 : {"curPm":"36","pm25":"18","pm10":"30","level":1,"quality":"优","des":"可正常活动。"}
             * dateTime : 2016年11月21日15时
             * cityName : 苏州
             */

            private Pm25Entity pm25;
            private String jingqu;
            private String jingqutq;
            private String date;
            private String isForeign;
            /**
             * date : 2016-11-21
             * info : {"day":["3","阵雨","18","东北风","3-4 级","06:30"],"night":["3","阵雨","14","东北风","4-5 级","16:56"]}
             * week : 一
             * nongli : 十月廿二
             */

            private List<WeatherEntity> weather;

            public void setPubdate(String pubdate) {
                this.pubdate = pubdate;
            }

            public void setPubtime(String pubtime) {
                this.pubtime = pubtime;
            }

            public void setRealtime(RealtimeEntity realtime) {
                this.realtime = realtime;
            }

            public void setLife(LifeEntity life) {
                this.life = life;
            }

            public void setF3h(F3hEntity f3h) {
                this.f3h = f3h;
            }

            public void setPm25(Pm25Entity pm25) {
                this.pm25 = pm25;
            }

            public void setJingqu(String jingqu) {
                this.jingqu = jingqu;
            }

            public void setJingqutq(String jingqutq) {
                this.jingqutq = jingqutq;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public void setIsForeign(String isForeign) {
                this.isForeign = isForeign;
            }

            public void setWeather(List<WeatherEntity> weather) {
                this.weather = weather;
            }

            public String getPubdate() {
                return pubdate;
            }

            public String getPubtime() {
                return pubtime;
            }

            public RealtimeEntity getRealtime() {
                return realtime;
            }

            public LifeEntity getLife() {
                return life;
            }

            public F3hEntity getF3h() {
                return f3h;
            }

            public Pm25Entity getPm25() {
                return pm25;
            }

            public String getJingqu() {
                return jingqu;
            }

            public String getJingqutq() {
                return jingqutq;
            }

            public String getDate() {
                return date;
            }

            public String getIsForeign() {
                return isForeign;
            }

            public List<WeatherEntity> getWeather() {
                return weather;
            }

            public static class RealtimeEntity {
                private String city_code;
                private String city_name;
                private String date;
                private String time;
                private int week;
                private String moon;
                private int dataUptime;
                /**
                 * temperature : 17
                 * humidity : 96
                 * info : 阵雨
                 * img : 3
                 */

                private WeatherEntity weather;
                /**
                 * direct : 东北风
                 * power : 2级
                 * offset : null
                 * windspeed : null
                 */

                private WindEntity wind;

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public void setTime(String time) {
                    this.time = time;
                }

                public void setWeek(int week) {
                    this.week = week;
                }

                public void setMoon(String moon) {
                    this.moon = moon;
                }

                public void setDataUptime(int dataUptime) {
                    this.dataUptime = dataUptime;
                }

                public void setWeather(WeatherEntity weather) {
                    this.weather = weather;
                }

                public void setWind(WindEntity wind) {
                    this.wind = wind;
                }

                public String getCity_code() {
                    return city_code;
                }

                public String getCity_name() {
                    return city_name;
                }

                public String getDate() {
                    return date;
                }

                public String getTime() {
                    return time;
                }

                public int getWeek() {
                    return week;
                }

                public String getMoon() {
                    return moon;
                }

                public int getDataUptime() {
                    return dataUptime;
                }

                public WeatherEntity getWeather() {
                    return weather;
                }

                public WindEntity getWind() {
                    return wind;
                }

                public static class WeatherEntity {
                    private String temperature;
                    private String humidity;
                    private String info;
                    private String img;

                    public void setTemperature(String temperature) {
                        this.temperature = temperature;
                    }

                    public void setHumidity(String humidity) {
                        this.humidity = humidity;
                    }

                    public void setInfo(String info) {
                        this.info = info;
                    }

                    public void setImg(String img) {
                        this.img = img;
                    }

                    public String getTemperature() {
                        return temperature;
                    }

                    public String getHumidity() {
                        return humidity;
                    }

                    public String getInfo() {
                        return info;
                    }

                    public String getImg() {
                        return img;
                    }
                }

                public static class WindEntity {
                    private String direct;
                    private String power;
                    private Object offset;
                    private Object windspeed;

                    public void setDirect(String direct) {
                        this.direct = direct;
                    }

                    public void setPower(String power) {
                        this.power = power;
                    }

                    public void setOffset(Object offset) {
                        this.offset = offset;
                    }

                    public void setWindspeed(Object windspeed) {
                        this.windspeed = windspeed;
                    }

                    public String getDirect() {
                        return direct;
                    }

                    public String getPower() {
                        return power;
                    }

                    public Object getOffset() {
                        return offset;
                    }

                    public Object getWindspeed() {
                        return windspeed;
                    }
                }
            }

            public static class LifeEntity {
                private String date;
                private InfoEntity info;

                public void setDate(String date) {
                    this.date = date;
                }

                public void setInfo(InfoEntity info) {
                    this.info = info;
                }

                public String getDate() {
                    return date;
                }

                public InfoEntity getInfo() {
                    return info;
                }

                public static class InfoEntity {
                    private List<String> chuanyi;
                    private List<String> ganmao;
                    private List<String> xiche;
                    private List<String> yundong;
                    private List<String> ziwaixian;

                    public void setChuanyi(List<String> chuanyi) {
                        this.chuanyi = chuanyi;
                    }

                    public void setGanmao(List<String> ganmao) {
                        this.ganmao = ganmao;
                    }

                    public void setXiche(List<String> xiche) {
                        this.xiche = xiche;
                    }

                    public void setYundong(List<String> yundong) {
                        this.yundong = yundong;
                    }

                    public void setZiwaixian(List<String> ziwaixian) {
                        this.ziwaixian = ziwaixian;
                    }

                    public List<String> getChuanyi() {
                        return chuanyi;
                    }

                    public List<String> getGanmao() {
                        return ganmao;
                    }

                    public List<String> getXiche() {
                        return xiche;
                    }

                    public List<String> getYundong() {
                        return yundong;
                    }

                    public List<String> getZiwaixian() {
                        return ziwaixian;
                    }
                }
            }

            public static class F3hEntity {
                /**
                 * jg : 20161121140000
                 * jb : 17
                 */

                private List<TemperatureEntity> temperature;
                /**
                 * jg : 20161121140000
                 * jf : 1
                 */

                private List<PrecipitationEntity> precipitation;

                public void setTemperature(List<TemperatureEntity> temperature) {
                    this.temperature = temperature;
                }

                public void setPrecipitation(List<PrecipitationEntity> precipitation) {
                    this.precipitation = precipitation;
                }

                public List<TemperatureEntity> getTemperature() {
                    return temperature;
                }

                public List<PrecipitationEntity> getPrecipitation() {
                    return precipitation;
                }

                public static class TemperatureEntity {
                    private String jg;
                    private String jb;

                    public void setJg(String jg) {
                        this.jg = jg;
                    }

                    public void setJb(String jb) {
                        this.jb = jb;
                    }

                    public String getJg() {
                        return jg;
                    }

                    public String getJb() {
                        return jb;
                    }
                }

                public static class PrecipitationEntity {
                    private String jg;
                    private String jf;

                    public void setJg(String jg) {
                        this.jg = jg;
                    }

                    public void setJf(String jf) {
                        this.jf = jf;
                    }

                    public String getJg() {
                        return jg;
                    }

                    public String getJf() {
                        return jf;
                    }
                }
            }

            public static class Pm25Entity {
                private String key;
                private int show_desc;
                private String dateTime;
                private String cityName;

                public void setKey(String key) {
                    this.key = key;
                }

                public void setShow_desc(int show_desc) {
                    this.show_desc = show_desc;
                }

                public void setDateTime(String dateTime) {
                    this.dateTime = dateTime;
                }

                public void setCityName(String cityName) {
                    this.cityName = cityName;
                }

                public String getKey() {
                    return key;
                }

                public int getShow_desc() {
                    return show_desc;
                }

                public String getDateTime() {
                    return dateTime;
                }

                public String getCityName() {
                    return cityName;
                }
            }

            public static class WeatherEntity {
                private String date;
                private InfoEntity info;
                private String week;
                private String nongli;

                public void setDate(String date) {
                    this.date = date;
                }

                public void setInfo(InfoEntity info) {
                    this.info = info;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public void setNongli(String nongli) {
                    this.nongli = nongli;
                }

                public String getDate() {
                    return date;
                }

                public InfoEntity getInfo() {
                    return info;
                }

                public String getWeek() {
                    return week;
                }

                public String getNongli() {
                    return nongli;
                }

                public static class InfoEntity {
                    private List<String> day;
                    private List<String> night;

                    public void setDay(List<String> day) {
                        this.day = day;
                    }

                    public void setNight(List<String> night) {
                        this.night = night;
                    }

                    public List<String> getDay() {
                        return day;
                    }

                    public List<String> getNight() {
                        return night;
                    }
                }
            }
        }
    }
}
