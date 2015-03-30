#include <iostream>
#include <string>
#include <memory>

using namespace std;


class data {
public:
	string d;
	data(string d){
		this->d = d;
	}

	friend ostream& operator<<(ostream &stream, const data &data) {
		return stream << data.d;
	}
};

template<class T> 
class node {
public:
	shared_ptr<T> node_data;
	shared_ptr<node<T> > next;
	//shared_ptr<node<T> > prev;

	node(shared_ptr<T> nd, shared_ptr<node <T> > n) {
		this->node_data = nd;
		this->next = n;
	}

	node(shared_ptr<T> d) {
		this->node_data = d;
		this->next = nullptr;
	}

	T get_data(){
		return *this->node_data;
	}
	void printnext(){
		for (shared_ptr<node<T> > i = this; i != nullptr; i = i->next){
			cout << i->node_data << endl;
		}
	}
	
};

template<class T>
class linkedlist {
public:
	int length;
	shared_ptr<node<T> > head;
	shared_ptr<node<T> > last;
	linkedlist () {
		this->length = 0;
		this->head = nullptr;
		this->last = nullptr;
	}

	void add_head(shared_ptr<node<T> > n){
		if (this->last == nullptr){
			this->last = n;
		}
		n->next = this->head;
		this->head = n;
		this->length++;
	}

	void add_tail(shared_ptr<node<T> > n){
		if (this->head == nullptr){
			this->head = n;
			this->last = n;
		} else {
			this->last->next = n;
			this->last = n;
		}
		this->length++;
	}

	void add_after(shared_ptr<node<T> > n, shared_ptr<node<T> > after){
		if (after == this->last){
			add_tail(n);
		} else if (after == this->head) {
			add_head(n);
		} else {
			shared_ptr<node<T> > addafter;
			for (shared_ptr<node<T> > i = this->head; i != after; i = i->next){
				addafter = i;
			}
		}
	}

	void remove_head(){
		shared_ptr<node<T> > tmp = this->head;
		this->head = this->head->next;
	}

	void remove_tail(){
		shared_ptr<node<T> > tmp = this->last;
		shared_ptr<node<T> > last = this->head;
		for (shared_ptr<node<T> > i = this->head; i->next != nullptr; i = i->next){
			last = i;
		}
		this->last = last;
		this->last->next = nullptr;
	}

	void print(){
		for (shared_ptr<node<T> > i = this->head; i != nullptr; i = i->next){
			cout << i->get_data() << " " << i->next << endl;
		}
	}
	
};

int main(){
	linkedlist<data> ll;
	typedef shared_ptr<node<data> > shared_node;
	ll.add_head(shared_node(new node<data>(shared_ptr<data>(new data("node1")))));
	ll.add_head(shared_node(new node<data>(shared_ptr<data>(new data("node2")))));
	ll.add_head(shared_node(new node<data>(shared_ptr<data>(new data("node3")))));
	ll.add_head(shared_node(new node<data>(shared_ptr<data>(new data("node4")))));
	ll.add_head(shared_node(new node<data>(shared_ptr<data>(new data("node5")))));
	ll.add_head(shared_node(new node<data>(shared_ptr<data>(new data("node6")))));
	ll.print();
	cout << "remove head" << endl;
	ll.remove_head();
	ll.print();
	cout << "remove tail" << endl;
	ll.remove_tail();
	ll.print();

	cout << endl << "linked list two!" << endl;
	linkedlist<string> ll2;
	typedef shared_ptr<node<string> > shared_node_str;
	ll2.add_tail(shared_node_str(new node<string>(shared_ptr<string>(new string("lawl")))));
	ll2.add_tail(shared_node_str(new node<string>(shared_ptr<string>(new string("linked")))));
	ll2.add_tail(shared_node_str(new node<string>(shared_ptr<string>(new string("lists")))));
	ll2.add_tail(shared_node_str(new node<string>(shared_ptr<string>(new string("are")))));
	ll2.add_tail(shared_node_str(new node<string>(shared_ptr<string>(new string("fun")))));
	ll2.print();

	return 0;
}