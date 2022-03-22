public class AddTwoNumbers {
  public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int number;
        ListNode dummy = new ListNode(0);
        int carry = 0;
        ListNode answer = dummy;
        while (l1 != null || l2 != null){
            int value1 = (l1 != null) ? l1.val : 0;
            int value2 = (l2 != null) ? l2.val : 0;

            int sum = value1 + value2 + carry;

            carry = (sum >= 10) ? 1 : 0;
            int digit = sum%10;

            ListNode newNode = new ListNode(digit);
            answer.next = newNode;
            answer = answer.next;

            if (l1 != null ) l1 = l1.next;
            if (l2 != null)  l2 = l2.next;
        }
        if (carry> 0){
            ListNode newNode = new ListNode(1);
            answer.next = newNode;
            answer = answer.next;
        }
        return answer;
    }
}
