/*
Copyright 2009 Ramnivas Laddad

Licensed under the Apache License, Version 2.0 (the "License"); 
you may not use this file except in compliance with the License. 
You may obtain a copy of the License at 
    http://www.apache.org/licenses/LICENSE-2.0 

Unless required by applicable law or agreed to in writing, software 
distributed under the License is distributed on an "AS IS" BASIS, 
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
See the License for the specific language governing permissions and 
limitations under the License. 
*/

//Listing A.7 Repository for InventoryItem
package ajia.repository;

import ajia.domain.InventoryItem;
import ajia.domain.Product;
import ajia.util.GenericRepository;

public interface InventoryItemRepository extends GenericRepository<InventoryItem> {
    InventoryItem findByProduct(Product product);
}
