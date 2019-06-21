import {HttpClient} from '@angular/common/http'
import {Injectable} from '@angular/core'
import { map } from 'rxjs/operators';

@Injectable()
export class TaskService{
	constructor(private http: HttpClient){

	}

	getsTasks(){
		return this.http.request("GET","/api/tasks",{responseType:"json"});
		//this.http.get('/api/tasks').map(reponse => response.json);
	}
}