package com.company;

public class Prefecture {
    String id;
    String name;

    Prefecture(String name) {
        this.name = name;
        setId();
    }

    public String getId() {
        return id;
    }

    public void setId() {
        switch (this.name) {
            case "北海道":
                this.id = "016010";
                break;
            case "青森県":
                this.id = "020010";
                break;
            case "岩手県":
                this.id = "030010";
                break;
            case "宮城県":
                this.id = "040010";
                break;
            case "秋田県":
                this.id = "050010";
                break;
            case "山形県":
                this.id = "060010";
                break;
            case "福島県":
                this.id = "070010";
                break;
            case "茨城県":
                this.id = "080010";
                break;
            case "栃木県":
                this.id = "090010";
                break;
            case "群馬県":
                this.id = "100010";
                break;
            case "埼玉県":
                this.id = "110010";
                break;
            case "千葉県":
                this.id = "120010";
                break;
            case "東京都":
                this.id = "130010";
                break;
            case "神奈川県":
                this.id = "140010";
                break;
            case "新潟県":
                this.id = "150010";
                break;
            case "富山県":
                this.id = "160010";
                break;
            case "石川県":
                this.id = "170010";
                break;
            case "福井県":
                this.id = "180010";
                break;
            case "山梨県":
                this.id = "190010";
                break;
            case "長野県":
                this.id = "200010";
                break;
            case "岐阜県":
                this.id = "210010";
                break;
            case "静岡県":
                this.id = "220010";
                break;
            case "愛知県":
                this.id = "230010";
                break;
            case "三重県":
                this.id = "240010";
                break;
            case "滋賀県":
                this.id = "250010";
                break;
            case "京都府":
                this.id = "260010";
                break;
            case "大阪府":
                this.id = "270010";
                break;
            case "兵庫県":
                this.id = "280010";
                break;
            case "奈良県":
                this.id = "290010";
                break;
            case "和歌山県":
                this.id = "300010";
                break;
            case "鳥取県":
                this.id = "310010";
                break;
            case "島根県":
                this.id = "320010";
                break;
            case "岡山県":
                this.id = "330010";
                break;
            case "広島県":
                this.id = "340010";
                break;
            case "山口県":
                this.id = "350010";
                break;
            case "徳島県":
                this.id = "360010";
                break;
            case "香川県":
                this.id = "370010";
                break;
            case "愛媛県":
                this.id = "380010";
                break;
            case "高知県":
                this.id = "390010";
                break;
            case "福岡県":
                this.id = "400010";
                break;
            case "佐賀県":
                this.id = "410010";
                break;
            case "長崎県":
                this.id = "420010";
                break;
            case "熊本県":
                this.id = "430010";
                break;
            case "大分県":
                this.id = "440010";
                break;
            case "宮崎県":
                this.id = "450010";
                break;
            case "鹿児島県":
                this.id = "460010";
                break;
            case "沖縄県":
                this.id = "470010";
                break;
            default:
                break;
        }
    }
}
