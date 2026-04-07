class Tree{
    String treeNames[] = new String[10];
	int index;
	
	
	public boolean addTree(String treeName){
		System.out.println("invoked addTree");
		boolean isTreeAdded = false;
		if(index < treeNames.length){
			
		if(treeName != null && !treeName.isEmpty()){
			 treeNames[index++] = treeName;
			 isTreeAdded = true;
			 System.out.println("added tree");
			 
		}else System.out.println("no tree");
		
	}else System.out.println("contact later................");
		
		return isTreeAdded;
		
	}
	
	public void getTrees(){
		System.out.println("invoked getTrees");
		for(String tree : treeNames)
			System.out.println(tree);
	}
	
	public String getTreeByName(String treeName){
		String name = null;
		
		for(String tree : treeNames){
			if(tree == treeName){
				name = tree;
				break;
			}
		}
		if(name == null){
			System.out.println(treeName + " is not found");
		}
		
		return name;
	}
	
	public boolean updateTree(String oldTreeName , String newTreeName){
		System.out.println("---------------");
		System.out.println("invoked updateTree");
		boolean isTreeUpdated = false;
		
		for(int index = 0; index < treeNames.length ; index++){
			if(treeNames[index] == oldTreeName){
				treeNames[index] = newTreeName;
				isTreeUpdated = true;
				break;
			}
		}
		if(isTreeUpdated == false){
			System.out.println(oldTreeName + " not fund in list");
		}
		
		return isTreeUpdated;
	}
	
	public boolean deleteTree(String treeName){
		System.out.println("invoked deleteTree");
		boolean isTreeDeleted = false;
		
		for(int index = 0; index < treeNames.length ; index++){
			if(treeNames[index] == treeName ){
				treeNames[index] = null;
				isTreeDeleted = true;
			}
		}
		if(isTreeDeleted == false){
			System.out.println(treeName + " deleted");
		}
		 return isTreeDeleted;
	}
	
}