public class Relative {
    public int getNum(String Station){
        int staNum=0;
        switch(Station){
            case "����ׯ":{staNum=1;break;}
            case "��վ":{staNum=2;break;}
            case "��վ":{staNum=3;break;}
            case "���ӺӴ��":{staNum=4;break;}
            case "���繫԰":{staNum=5;break;}
            case "���Ͻ�":{staNum=6;break;}
            case "���վ":{staNum=7;break;}
            case "����·":{staNum=8;break;}
            case "Ӫ�ڵ�":{staNum=9;break;}
            case "ֱ��":{staNum=10;break;}
            case "������·":{staNum=11;break;}
            case "���߷�":{staNum=12;break;}
            case "����ҽԺ":{staNum=13;break;}
            case "������":{staNum=14;break;}
            case "�Ļ�����":{staNum=15;break;}
        }
        return staNum;
    }

    public String getStation(int num){
        String station="error";
        switch(num){
            case 1:{station="����ׯ";break;}
            case 2:{station="��վ";break;}
            case 3:{station="��վ";break;}
            case 4:{station="���ӺӴ��";break;}
            case 5:{station="���繫԰";break;}
            case 6:{station="���Ͻ�";break;}
            case 7:{station="���վ";break;}
            case 8:{station="����·";break;}
            case 9:{station="Ӫ�ڵ�";break;}
            case 10:{station="ֱ��";break;}
            case 11:{station="������·";break;}
            case 12:{station="���߷�";break;}
            case 13:{station="����ҽԺ";break;}
            case 14:{station="������";break;}
            case 15:{station="�Ļ�����";break;}
        }
        return station;
    }
}
