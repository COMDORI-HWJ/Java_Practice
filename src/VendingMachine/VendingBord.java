package VendingMachine;

import java.awt.*;
import java.awt.event.*;
import java.text.*;

import javax.swing.*;
import javax.swing.border.Border;

class VendingBord extends JPanel implements ActionListener

{
    Machine m = new Machine(); //Machine 클래스를 불러옵니다.
    private JButton  orange,cocopam,coke,soda,coffee,chocomilk, grape;//음료캔 목록
    private JButton ohbakwon,chunwon, refund; //현금 버튼 목록
    ImageIcon icon1;

    public JButton sikhye;
    private JTextField getm; //현재 투입된 금액을 나타내는 텍스트필드
    private JLabel Text;
    NumberFormat showwon = NumberFormat.getCurrencyInstance(); //getCurrencyInstance()라는 메소드는 숫자 포매팅으로, 통화기호와 세자리 마다 콤마 표시를 해주는 메소드이다.

    public GridBagConstraints getPoint(int gridx, int gridy, int gridwidth, int gridheight, int anchor) //버튼 좌표 설정
    {
        GridBagConstraints p = new GridBagConstraints();
        p.insets = new Insets(20,80,8,35);
        p.ipadx = 0;
        p.ipady = 0;
        p.gridx = gridx;
        p.gridy = gridy;
        p.gridwidth = gridwidth;
        p.gridheight = gridheight;
        p.anchor = anchor;
        return p;
    }

    public VendingBord()
    {
        JPanel VBord = new JPanel();
        setLayout(new GridBagLayout());
        Border mainname = BorderFactory.createLineBorder(Color.BLUE); //자판기 테두리를 초록색으로 설정.

        m.Bev(0, new Beverage("환타-오렌지", m.amount));
        m.Bev(1, new Beverage("코코팜", m.amount));
        m.Bev(2, new Beverage("콜라", m.cokeamount));
        m.Bev(3, new Beverage("사이다" , m.amount));
        m.Bev(4, new Beverage("초코에몽", m.amount));
        m.Bev(5, new Beverage("커피", m.coffeeamount));
        m.Bev(6, new Beverage("식혜", m.sikhyeamount));
        m.Bev(7, new Beverage("봉봉", m.amount));

        VBord.setLayout(new GridBagLayout());
        VBord.setBorder(BorderFactory.createTitledBorder(mainname)); // 양각 효과를 준 자판기 판 테두리에 "음료"라고 덧붙였습니다.

        icon1 = new ImageIcon("VendingMachine/img/fanta.png");
        orange = new JButton(icon1); // 오렌지주스라고 써져있는 버튼을 생성합니다.
        orange.addActionListener(this); // 버튼 클릭 이벤트를 만들어줍니다.
        VBord.add(orange,getPoint(3,0,1,1, GridBagConstraints.EAST)); // Panel위에 음료버튼을 추가하고, 오른쪽으로 정렬 합니다. 이하 동문~

        cocopam = new JButton(new ImageIcon("VendingMachine/img/2.png"));
        cocopam.addActionListener(this);
        VBord.add(cocopam,getPoint(4,0,1,1, GridBagConstraints.EAST));

        coke = new JButton(new ImageIcon("VendingMachine/img/콜라.png"));
        coke.addActionListener(this);
        VBord.add(coke,getPoint(3,1,1,1, GridBagConstraints.EAST));

        soda = new JButton(new ImageIcon("VendingMachine/img/3.png"));
        soda.addActionListener(this);
        VBord.add(soda,getPoint(4,1,2,1, GridBagConstraints.EAST));

        chocomilk = new JButton(new ImageIcon("VendingMachine/img/초코우유.png"));
        chocomilk.addActionListener(this);
        VBord.add(chocomilk,getPoint(3,2,1,1, GridBagConstraints.EAST));

        coffee = new JButton(new ImageIcon("VendingMachine/img/커피.png"));
        coffee.addActionListener(this);
        VBord.add(coffee,getPoint(4,2,1,1, GridBagConstraints.EAST));

        sikhye = new JButton (new ImageIcon("VendingMachine/img/식혜.png"));
        sikhye.addActionListener(this);
        VBord.add(sikhye, getPoint(3, 3, 1, 1, GridBagConstraints.EAST));

        grape = new JButton (new ImageIcon("VendingMachine/img/포도.png"));
        grape.addActionListener(this);
        VBord.add(grape, getPoint(4, 3, 1, 1, GridBagConstraints.EAST));

        ohbakwon = new JButton("500원넣기");
        ohbakwon.addActionListener(this);
        VBord.add(ohbakwon,getPoint(0,1,0,30, GridBagConstraints.WEST));

        chunwon = new JButton("천원넣기");
        chunwon.addActionListener(this);
        VBord.add(chunwon, getPoint(0, 1, 0, 500, GridBagConstraints.WEST));

        refund = new JButton("돈반환");
        refund.addActionListener(this);
        VBord.add(refund,getPoint(0,8,5,50, GridBagConstraints.WEST));

        Text = new JLabel("현재 투입된 금액");
        VBord.add(Text,getPoint(0,0,2,1, GridBagConstraints.WEST));


        getm = new JTextField(7); // 현재 투입된 금액의 글자 길이를 7로 지정 합니다.
        VBord.add(getm, getPoint(0,0,3,3, GridBagConstraints.WEST));
        this.add(VBord); // // Panel위에 텍스트필드를 Frame에 추가해줍니다.
    }


    public void order(int orders)
    {
        if(m.money >= m.cost) // 현재 가지고 있는 돈이 사려는 음료수 가격보다 큰 경우
            JOptionPane.showMessageDialog(null, m.getName(orders) + "이(가) 나왔습니다. \n        맛있게 드세요 :)",
                    "상품출고", JOptionPane.INFORMATION_MESSAGE); //음료 출고 메시지를 나타냅니다.
        else if(m.money < m.cost) // 현재 가지고 있는 돈이 사려는 음료수 가격보다 적은 경우
            JOptionPane.showMessageDialog(null, "돈을 더 넣어주세요", "돈부족", JOptionPane.WARNING_MESSAGE); // 돈이 부족하다는 메시지창을 나타냅니다.
    }

    public void actionPerformed(ActionEvent bton) // 버튼 이벤트 구문~.
    {
        Object source = bton.getSource();

        if (source == ohbakwon) // 500원넣기 버튼을 눌렀을때
        {
            m.money += 500; // 버튼을 누를때마다 500원을 투입합니다.
            getm.setText(showwon.format(m.money)); // 투입한 금액을 원자리 기호를 사용하여 표시해줍니다.
        }

        if (source == chunwon) //천원넣기 버튼을 눌렀을때
        {
            m.money +=1000; // 버튼을 누를때마다 1000원을 투입합니다.
            getm.setText(showwon.format(m.money));
        }

        if (source == orange) // 눌려진 버튼이 오렌지주스 버튼이면
        {
            order(0); // order 메소드에 0값을 넣어줍니다.
            m.getMoney(0); // 오렌지주스에 해당하는 돈 연산을 해줍니다.
            getm.setText(showwon.format(m.money)); // 현재 남은 금액을 표시해줍니다.
        }

        if (source == cocopam) // 눌려진 버튼이 코코팜 버튼이면
        {
            order(1); // order 메소드에 1값을 넣어줍니다.
            m.getMoney(1); // 코코팜에 해당하는 돈 연산을 해주고
            getm.setText(showwon.format(m.money)); // 현재 남은 금액을 표시해줍니다.
        }

        if (source == coke) // 눌려진 버튼이 콜라 버튼이면
        {
            order(2); // order 메소드에 2값을 넣어줍니다.
            m.Cokecost(); // 콜라에 해당하는 돈 연산을 해주고
            getm.setText(showwon.format(m.money)); // 현재 남은 금액을 표시해줍니다.
        }

        if (source == soda) // 이하 동문.
        {
            order(3);
            m.getMoney(3);
            getm.setText(showwon.format(m.money));
        }

        if (source == chocomilk)
        {
            order(4);
            m.getMoney(4);
            getm.setText(showwon.format(m.money));
        }

        if(source == coffee)
        {
            order(5);
            m.Coffeecost();
            getm.setText(showwon.format(m.money));
        }

        if(source == sikhye){
            order(6);
            m.Sikhyecost();
            getm.setText(showwon.format(m.money));
        }

        if(source == grape){
            order(7);
            m.getMoney(7);
            getm.setText(showwon.format(m.money));
        }

        if (source == refund) //눌러진 버튼이 돈반환 버튼이면
        {
            m.refund(); // refund 메소드를 실행시켜주고 money 값을 0으로 초기화해줍니다.
            getm.setText(showwon.format(m.money)); // 현재 남은 금액을 표시해줍니다.
        }
    }

}