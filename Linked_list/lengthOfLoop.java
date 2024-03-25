static int countNodesinLoop(Node head)
    {
        Node fast = head, slow = head;
        boolean cycle = false;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                cycle = true;
                break;
            }
        }
        if(!cycle) return 0;
        slow = head;
        while(fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        int count = 0;
        do {
            fast = fast.next;
            count++;
        } while(fast != slow);
        return count;
    }