package array;

//기본 형태를 담당

public class BitArray {
	private Object[] base;
	private int max;
	private int size;
	
	public BitArray() {
		this(10);
	}
	
	public BitArray(int _max) {
		setMax(_max);	//max = _max;
		setSize(0);
		base = new Object[max];
	}

	public int getMax() {
		return max;
	}

	private void setMax(int max) {
		this.max = max;
	}

	public int getSize() {
		return size;
	}

	private void setSize(int size) {
		this.size = size;
	}
	
	public boolean isOverflow() {
		if(max <= size) {
			return true;
		}
		else
			return false;
	}
	
	public boolean IsUseIdx(int idx) {

		if(idx >= 0 && idx <= size-1){
			return true;
		}
		else
				return false;
	}
	
	public void Insert(Object obj) throws Exception{
		if(isOverflow()== true)
			throw new Exception("저장 공간이 부족합니다.");
		
		base[size] = obj;
		size++;
		
	}
	
	public void Delete(int idx) throws Exception{
		if(IsUseIdx(idx) == false)
			throw new Exception("유효하지 않은 인덱스 접근입니다.");
		for(int i=idx; i< size-1;i++) {
			base[i] = base[i+1];
		}
		size--;
	}

	
}
